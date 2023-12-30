#!/usr/bin/env python3

'''
    Minecraft Colorize Blocks Generator
'''

import imghdr
import json
import os
import re
import shutil
import sys
import yaml



config_file = 'config.yaml'

ignore_dir  = re.compile(fr'{os.path.sep}(\..+|[e|E]xcludes?){os.path.sep}')    # .hidden_dir/ or ignores/
ignore_file = re.compile(r'\.ignore(\.|$)')    # *.ignore.* or *.ignore File

def add_directory_lastsep(directory):
    if directory:
        return (directory + os.path.sep) if (re.search(os.path.sep + '$', directory) is None) else directory
    else:
        return ''
def list_all_files(directory, show_root_dir=True, show_hidden_files=False):
    directory = add_directory_lastsep(directory)
    for root, dirs, files in os.walk(directory):
        root = add_directory_lastsep(root)
        for file in files:
            if (re.search(ignore_dir, root) is not None) or (re.search(ignore_file, file) is not None) or (show_hidden_files is False and file.startswith('.')):
                print('ignore: ' + os.path.join(root, file))
                continue
            elif show_root_dir is False:
                root = re.sub('^' + directory, '', root)
            yield os.path.join(root, file)
def use_double_quote_style(expression, enclosure=False):
    expression = json.dumps(expression, ensure_ascii=False) if expression is not None else ''
    if (enclosure is False) and (expression.startswith('"') and expression.endswith('"')):
        expression = expression[1:-1]
    return expression
def replace_tag(data, color=None):
    replace_lists = {
        'mod':   config['mod'],
        'block': config['block'],
    }
    if color:
        replace_lists['color'] = color
    # replace
    for config_category, config_list in replace_lists.items():
        for config_name, config_value in config_list.items():
            tag  = '___' + config_category + config_name[0].upper() + config_name[1:] + '___'
            text = use_double_quote_style(config_value)
            data = data.replace(tag, text)
    return data

with open(config_file) as f:
    config = yaml.load(f)
config['mod']['packageName'] = ''.join(map(str, config['mod']['packageName'])) if config['mod']['packageName'] else ''
config['block']['info'] = ''.join(map(str, config['block']['info'])) + ' ' if config['block']['info'] else ''
colors     = config['colors']
base_dir   = '.' + os.path.sep + add_directory_lastsep(config['templates']['baseDir'])
export_dir = '.' + os.path.sep + add_directory_lastsep(config['templates']['exportDir'])
templates  = list_all_files(base_dir, show_root_dir=False)



# Check Command-Line Options
if 1 < len(sys.argv):
    if '-p' in sys.argv or '--packaging' in sys.argv:
        if config['mod']['packageName']:
            print('')
            print('Preparing .jar file…')
            package_file = f"{add_directory_lastsep(config['mod']['packageDir'])}{config['mod']['packageName']}.jar"
            if config['mod']['packageDir'] and not os.path.isdir(config['mod']['packageDir']):
                os.makedirs(config['mod']['packageDir'])
            shutil.copyfile('build/libs/modid-1.0.jar', package_file)
            print('')
            print('PACKAGING SUCCESSFUL')
            print('')
            print(f'Mod package file: {package_file}')
            print('')
    else:
        print(f'Usage: {sys.argv[0]} [-p/--packaging]')
    sys.exit()



print('')
print('Generating blocks…')
print('')



# Initialize export_dir
if os.path.isdir(export_dir):
    shutil.rmtree(export_dir)



'''
    Generate Codes
'''
for template in templates:
    base_file   = base_dir   + template
    export_file = export_dir + replace_tag(template)
    if not os.path.isdir(os.path.dirname(export_file)):
        os.makedirs(os.path.dirname(export_file))

    # Copy & Replace ___colorTag___.* File
    if '___color' in export_file:
        for color in colors:
            color_file = replace_tag(export_file, color)
            shutil.copyfile(base_file, color_file)
            with open(color_file, 'r') as f:
                data = f.read()
            data = replace_tag(data, color)
            with open(color_file, 'w') as f:
                f.write(data)
    # Copy & Replace Normal File
    else:
        shutil.copyfile(base_file, export_file)
        # if export_file is Image File
        if imghdr.what(export_file) is not None:
            continue

        newlines = ''
        with open(export_file) as f:
            for line in f:
                # ___colorTag___ Replace (Multi-line Expansion)
                if '___color' in line:
                    for color in colors:
                        newlines += replace_tag(line, color)
                # ___normalTag___ Replace
                else:
                    newlines += replace_tag(line)
        with open(export_file, 'w') as f:
            f.writelines(newlines)



'''
    Generate Textures
'''
texture_dir = f"{export_dir}main/resources/assets/{config['mod']['id']}/textures/blocks/"
if not os.path.isdir(texture_dir):
    os.makedirs(texture_dir)
for color in colors:
    os.system(f'''convert -size 16x16 xc:{color['code']} "{texture_dir}{color['id']}.png"''')



print('')
print('GENERATE SUCCESSFUL')
print('')
