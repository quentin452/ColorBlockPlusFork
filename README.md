# Color Blocks Plus

自由な配色で、自由な建築を！

![Color Blocks Plus](resources/images/logo.jpg)  
![Color Blocks Plus](resources/images/screenshot.png)  


## Minecraft Mod

[Color Blocks 2](http://www.planetminecraft.com/mod/color-blocks/)がマルチプレイに対応していなかったため、[Color Blocks 1.4 (GPLv3)](https://github.com/KeeperofMee/Color-Blocks)をベースに2の配色を再現した派生Modを作成しました。

以下のブロックが追加されます。

- 全340色のブロック
- 全340色の階段
- 全340色のハーフブロック

[Minecraft Colorize Blocks Generator](https://gitlab.com/Isthmis/Minecraft-Colorize-Blocks-Generator) (Pythonスクリプトです。CC0ライセンスで公開しています) によってJavaファイルを自動生成しています。  
Color Blocks 2と比較した場合のメリットとして、以下の点が挙げられます。

- マルチプレイ対応
- [MinePainter](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/1288124-0-2-6-mine-painter-simple-sculpture-and-pixel-art)対応

また、2同様[BuildCraft](http://www.mod-buildcraft.com)の外装板や[Carpenter's Blocks](http://www.carpentersblocks.com)にも使用可能です。  


## Support

- Minecraft 1.7.10
- Forge 10.13.4.1558, 10.13.4.1614
- Multiplayer
- No Recipe, **CREATIVE MODE ONLY!** (クリエイティブモード専用)


## Download

[Color Blocks Plus - Minecraft CurseForge](https://minecraft.curseforge.com/projects/color-blocks-plus)


## Usage

### Install
通常のMod同様、`mods/`内に`.jar`ファイルを置くことで動作します。

### Multiplayer
マルチプレイで使用する際は、必ずサーバー側・クライアント側両方に導入してください。  
クライアント側にのみ導入している場合、クリエイティブモードのインベントリ2ページ目以降を表示しようとした際にクラッシュします。(シングルプレイ用プロファイルとマルチプレイ用プロファイルを一緒にしている人はご注意ください。)

### Creative Mode Tab
クリエイティブモードのタブでブロックの表示順が乱れてしまうことがあります。

表示順が乱れている場合のスクリーンショット (BAD CASE)  
![bad case](resources/images/badcase.png)  
Forgeの仕様(?)のようなので、おそらくMod側では対策不能です。

インストール→ブロック設置→アンインストール→再度ワールドを開いてMissing BlocksでYes→再度インストール→ワールド修復処理でYes、の手順を行うことで正しくグラデーション状に並ぶ場合があります。(バックアップを取った上で、自己責任で行ってください)

\*\**DO AT YOUR OWN RISK.*\*\*  
![missing blocks](resources/images/missing-blocks.jpg)  
![repair world](resources/images/repair-world.jpg)  
![sorted](resources/images/screenshot.png)


## Development

### Dependencies
- Java
- [Forge 1.7.10-10.13.4.1614, Gradle](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.7.10.html)
- [Minecraft Colorize Blocks Generator](https://gitlab.com/Isthmis/Minecraft-Colorize-Blocks-Generator)
    - Bash
    - Python 3.6.0
    - PyYAML
    - ImageMagick

1. Download [Forge 1.7.10-10.13.4.1614](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.7.10.html) (src)
1. Copy and paste `build.gradle`, `gradle/`, `gradlew`, `gradlew.bat`
1. Double click `build.command` (macOS) or `$ ./build.command`


## License

Created by (c) 2017 Mutous

Derived from Color Blocks 1.4 (c) 2014 KeeperofMee  
[KeeperofMee/Color-Blocks](https://github.com/KeeperofMee/Color-Blocks)

This project is licensed under the terms of the GNU General Public License v3.0.

<a href="https://www.gnu.org/licenses/gpl-3.0.html"><img src="https://upload.wikimedia.org/wikipedia/commons/9/93/GPLv3_Logo.svg" alt="GPLv3" width="120" height="60"></a>
