https://retrogamecorps.com/2022/10/16/steam-deck-emulation-starter-guide/
# Compiling tips
# Games and Software

[Back to Home](/README.md#table-of-contents)

<!-- TODO Overview -->

## Table of Contents

- [Discord](#discord)
- [Steam](#steam)
  - [Plugins](#plugins)
- [File Transfer](#file-transfer)
- [Alternatives](#alternatives)

## Discord

[Back to the Top](#table-of-contents)

[Discord](https://discord.com/) is an application with modern voice & text chat app. It provides clear voice, multiple server and channel support, mobile apps, and more. It's available on Linux, macOS, Windows, iOS, Android, and your web browser. [Flatpak verion](https://flathub.org/apps/details/com.discordapp.Discord)

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/203752975-d489f776-2039-474d-82ce-1cdd3dcdeff7.png">
</p>

## Steam

[Back to Top](#games-and-software)

### Plugins

[Back to Top](#games-and-software)

[Decky Loader](https://github.com/SteamDeckHomebrew/decky-loader) is a plugin loader tool for the Steam Deck.

**Features:**

- Clean injecting and loading of one or more plugins.
- Persistent, meaning it doesn't need to be reinstalled after every system update.
- Allows 2-way communication between the plugins and the loader.
- Allows plugins to define python functions and run them from javascript.
- Allows plugins to make fetch calls, bypassing cors completely.

A list of available plugins for Decky Loader can be found in [this store](https://plugins.deckbrew.xyz/).

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/176962910-9bf09ad0-1ab2-4524-bd50-7420afec2c4a.png">
</p>

[Crankshaft](https://crankshaft.space/) is a Steam client plugin manager and framework. It lets you install and create plugins to add more functionality to your Steam client. [Available as a Flatpak](https://flathub.org/apps/details/space.crankshaft.Crankshaft)

 <p align="center">
 <img src="https://user-images.githubusercontent.com/2069735/193312550-4c3c5c0d-11ef-4eef-bf19-32e522398fd0.png">
 </p>

[Steam Deck PowerTools](https://github.com/NGnius/PowerTools) is a plugin for Decky that provides system tweaks for power users.

- Enable & disable CPU threads & SMT
- Set CPU max frequency and toggle boost
- Set some GPU power parameters (fastPPT & slowPPT)
- Set the fan RPM (unsupported on SteamOS beta)
- Display supplementary battery info
- Keep settings between restarts (stored in ~/.config/powertools.json)

 <p align="center">
 <img src="https://user-images.githubusercontent.com/45159366/168942613-685cf180-3b1d-4a29-ba10-f5bdfbcfdfb6.png">
 </p>

### Steam Deck

[Back to Top](#games-and-software)

[Steam Tinker Launch](https://github.com/frostworx/steamtinkerlaunch) is a Linux wrapper tool for use with the Steam client which allows customizing and start tools and options for games quickly on the fly.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/176962906-5d388e16-955e-4936-a676-c591d0937acd.png">
</p>

#### Improving Battery Life

[Back to Top](#games-and-software)

[Steam Deck - How To Get The Best Battery Life In Games! | The Phawx YouTube](https://www.youtube.com/watch?v=zB6tkjuXX8A-Y)

[auto-cpufreq](https://github.com/AdnanHodzic/auto-cpufreq) is an automatic CPU speed & power optimizer for Linux based on active monitoring of laptop's battery state, CPU usage, CPU temperature and system load. Ultimately allowing you to improve battery life without making any compromises.

- [auto-cpufreq - tool demo (Automatic CPU speed & power optimizer for Linux) | YouTube](https://www.youtube.com/watch?v=QkYRpVEEIlg-Y)

[Power-Control-Panel](https://github.com/project-sbc/Power-Control-Panel) is a software tool that allows easy change of TDP on **windows handheld devices(including Steam Deck)**. Features include:

- Configurable profiles with charger vs battery values -xinput TDP change capability (hold LB, RB, and a dpad direction)
- Assign an exe to a profile to auto start when exe opens
- Auto startup at logon to system tray
- Touch friendly interface, keyboard (mostly) not required.

[Power Control App | Project-SBC YouTube](https://www.youtube.com/watch?v=PcSV1tto2OM-Y)

## File Transfer

[Back to Top](#games-and-software)

[KDE Connect](https://kdeconnect.kde.org/) is a tool that lets you easily link up your phone to your computer, your computer to your tablet; or your computer to your Steam Deck device. It can be used to share files across devices, read and send SMS directly from your laptop, and lock up your computer remotely.

[Warpinator](https://github.com/linuxmint/warpinator) is a free, open-source tool for sending and receiving files between computers that are on the same network. [Warpinator Flatpak](https://flathub.org/apps/details/org.x.Warpinator)

[FileZilla Client](https://filezilla-project.org/) is a fast and reliable cross-platform FTP, FTPS and SFTP client with lots of useful features and an intuitive graphical user interface. [FileZilla Flatpak](https://flathub.org/apps/details/org.filezillaproject.Filezilla)

[Dragit](https://github.com/sireliah/dragit) is an application for intuitive file sharing between devices. It's useful for when you want to send file from one computer to another with minimal effort. Dragit automatically detects devices in the local network with help of mDNS protocol and allows you to send file immediately. [Dragit Flatpak](https://flathub.org/apps/details/com.sireliah.Dragit)

[WinFsp](https://github.com/winfsp/winfsp) is a set of software components for Windows computers that allows the creation of user mode file systems. In this sense it is similar to FUSE (Filesystem in Userspace), which provides the same functionality on UNIX-like computers.

[SSHFS-Win](https://github.com/winfsp/sshfs-win) is a minimal port of SSHFS to Windows. Looking under the hood it uses Cygwin for the POSIX environment and WinFsp for the FUSE (Filesystem in Userspace) functionality.

[RiftShare](https://riftshare.app) is a cross platform (Windows, MacOS, Linux) file sharing tool that supports fully encrypted transfers both on the local network and off network using a simple passphrase. RiftShare uses [magic-wormhole](https://github.com/magic-wormhole/magic-wormhole) under the hood and is compatible with other magic-wormhole clients. It is also fully open source and licensed under the GPLv3. [RiftShare Flatpak](https://flathub.org/apps/details/app.riftshare.RiftShare)

[SyncThing](https://syncthing.net/) is a continuous file synchronization program. It synchronizes files between two or more computers in real time, safely protected from prying eyes. Works with Mac OS X, Windows, Linux, FreeBSD, Solaris, OpenBSD, Android, and many others. Downloadable in Discover. It's also open source and licensed under the MPL-2.0 license.

[Usermode FTP Server](https://gitlab.com/ergoithz/umftpd) is a tool that let's you start an FTP server as user and transfer files with any FTP client. Allowing you to access your files directly with many file browsers' builtin FTP support: Windows File Explorer, Thunar, Gnome Files, Dolphin and many more. [Usermode FTP Server on FlatHub](https://flathub.org/apps/details/eu.ithz.umftpd)

## Alternatives

[Back to Top](#games-and-software)

# Games and Software

[Back to Home](/README.md#table-of-contents)

<!-- TODO Overview -->

## Table of Contents

- [Steam](#steam)
  - [Proton](#proton)
- [Lutris](#lutris)
- [Bottles](#bottles)
- [Other Launchers](#other-launchers)
  - [Installing Other Launchers](#other-launchers)
  - [Adding Games from Other Launchers to Steam](#adding-games-from-other-launchers-to-steam)
  - [List of Other Launchers](#list-of-other-launchers)
- [Game Streaming](#game-streaming)
  - [Cloud](#cloud)
  - [Local Game Streaming](#local-game-streaming)
- [Emulation](#emulation)
  - [Emulators](#emulators)
- [Android](#android)

## Steam

[Back to the Top](#games-and-software)

[Steam](https://store.steampowered.com/about/) Obviously

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/106686402-13100100-657f-11eb-9012-6bdac264a808.png">
</p>

### Proton

[Back to the Top](#games-and-software)

[Proton](https://github.com/ValveSoftware/Proton/) is a tool for use with the Steam client which allows games which are exclusive to Windows to run on the Linux operating system. It uses Wine to facilitate this.

[Proton Next](https://github.com/ValveSoftware/Proton/wiki/Changelog) is an easier way to check out and test the upcoming stable releases of new Proton versions for Linux desktop and Steam Deck.

  **The following games are now playable:**
       - Rift
       - Unravel 2
       - Airborne Kingdom
       - Nancy Drew: Legend of the Crystal Skull
       - Re-Volt
       - Aspire: Ina's Tale
       - Battle Realms: Zen Edition
       - Deathsmiles II
       - Primal Carnage: Extinction
       - Pico Park Classic Edition
       - Six Ages: Ride Like the Wind
       - Darkstar One
       - Indiana Jones and the Emperor Tomb
       - Bulletstorm: Full Clip Edition
   * Fix Batman: Arkham City GOTY launching in the background on Steam Deck when set to fullscreen.
   * Fix Marvel's Spider-Man Remastered displaying dialog about outdated drivers on AMD systems.
   * Fix Final Fantasy IV (3D Remake) having no audio.
   * Fix Return to Monkey Island not reacting to mouse clicks after a recent game update.
   * Fix upsidedown videos in VRChat and many other games.
   * Fix Call of Duty Black Ops II Zombies and Multiplayer hanging on exit.
   * Fix Bail or Jail crashing when opening the Terms of Serivce.
   * Improve GTA V situation with not loading textures.
   * Fix Red Dead Redemption 2 crashing after a recent game update.
   * Fix Final Fantasy XIV Online launcher functionality after game update.
   * Fix cutscene stutter in Disgaea 5.
   * Fix Thrustmaster HOTAS having non-functional dial in Elite Dangerous.
   * Fix Planet Zoo randomly crashing.
   * Fix SCP: Secret Labratory not being playable after a recent game update (again).
   * Fix Tekken 7 crashing at launch.
   * Fix Armello hanging on exit.
   * Fix Sword Art Online: Hollow Realization freezing after the tutorial.
   * Fix Space Engineers intro video not playing correctly.
   * Fix Dragon's Dogma: Dark Arisen videos not playing correctly.
   * Implement network video support for VRChat.
   * Update dxvk to v1.10.3-28-ge3daa699.

[ProtonUp-Qt](https://github.com/DavidoTek/ProtonUp-Qt) is a tool to install and manage [Proton-GE](https://github.com/GloriousEggroll/proton-ge-custom) and [Luxtorpeda](https://github.com/luxtorpeda-dev/luxtorpeda) for Steam and [Wine-GE](https://github.com/GloriousEggroll/wine-ge-custom) for Lutris with this graphical user interface. Based on AUNaseef's [ProtonUp](https://github.com/AUNaseef/protonup), made with Python 3 and Qt 6.

## Lutris

[Back to the Top](#games-and-software)

[Back to the Top](https://github.com/mikeroyal/Steam-Deck-Guide#table-of-contents)

[Lutris](https://lutris.net) is a gaming client for Linux. It gives you access to all your video games with the exception of the current console generation. Also, integrates nicely with other stores like GOG, Steam, Battle.net, Origin, Ubisoft Connect and many other sources that allow you to import your existing game library and community maintained install scripts give you a completely automated setup.

## Bottles

[Back to the Top](#games-and-software)

[Bottles](https://usebottles.com/) is a software tool that let's you run Windows software on Linux. It's built-in dependency installation system grants automatic software compatibility access. The download manager can download the official components such as: the runner (Wine, Proton), DXVK, dependencies, etc. Available on [FlatHub](https://flathub.org/apps/details/com.usebottles.bottles) or throught [KDE Discover](https://apps.kde.org/discover/) store.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/182049940-ccba08e7-b05d-4991-b36f-1e2596c390da.png">
</p>

## Other Launchers

[Back to the Top](#games-and-software)

### Installing Other Launchers

[Back to the Top](#games-and-software)

### Adding Games from Other Launchers to Steam

[Back to the Top](#games-and-software)

### List of Other Launchers

[GameHub](https://github.com/tkashkin/GameHub) is a unified library for all your games. It allows you to store your games from different platforms into one program to make it easier for you to manage your games.

<img src="https://user-images.githubusercontent.com/45159366/107862734-96451880-6e03-11eb-9b92-9d355b890083.png">

**GameHub supports:**

- native games for Linux
- **multiple compatibility layers:**
  - Wine
  - Proton
  - [DOSBox](https://www.dosbox.com/)
  - [RetroArch](https://store.steampowered.com/app/1118310/RetroArch/)
  - [ScummVM](https://www.scummvm.org/)
  - [WineWrap](https://www.gog.com/forum/general/adamhms_linux_wine_wrappers_news_faq_discussion/post1) — a set of preconfigured wrappers for [supported games](https://www.gog.com/forum/general/adamhms_linux_wine_wrappers_news_faq_discussion/post3);
  - custom emulators

- **multiple game platforms:**
  - [Steam](https://store.steampowered.com/)
  - [GOG](https://www.gog.com/)
  - [Humble Bundle (including Humble Trove)](https://www.humblebundle.com/)
  - [itch.io](https://itch.io/)

[Heroic](https://heroicgameslauncher.com/) is an Open Source Game Launcher for Linux, Windows and macOS (for both Native and Windows Games using Crossover). It supports launching games from the Epic Games Store using Legendary, a CLI alternative to the Epic Games Launcher. [Flatpak for Heroic Games Launcher](https://flathub.org/apps/details/com.heroicgameslauncher.hgl)

[Epic Games Store](https://www.epicgames.com/store/) is a digital video game storefront for Microsoft Windows and macOS, operated by Epic Games.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/111918016-3fed7a00-8a40-11eb-964e-930c801c1c72.png">
</p>

[GOG GALAXY](https://lutris.net/games/gog-galaxy/) is a fully optional client to install, play and update your games.

<img src="https://user-images.githubusercontent.com/45159366/189615528-385c01a8-f780-49e0-9502-db00d8082d9d.png">

[Blizzard Battle.net](https://lutris.net/games/battlenet/) is an internet-based online gaming, digital distribution, and digital rights management platform developed by Activision and Blizzard Entertainment. Battle.net is the launcher for World of Warcraft, Diablo III, StarCraft II, Hearthstone, Heroes of the Storm, Overwatch and Call of Duty.

<img src="https://user-images.githubusercontent.com/45159366/189614458-d51a15cb-d02d-4b1f-9e77-e712dcdb1d73.png">

[Ubisoft Connect](https://lutris.net/games/ubisoft-connect/) is a digital distribution, digital rights management, multiplayer and communications service created by Ubisoft to provide an experience similar to the achievements/trophies offered by various other game companies.

<img src="https://user-images.githubusercontent.com/45159366/189614471-422cbad8-1ae7-4f06-ad81-7f3b68550569.png">

[EA Play](https://lutris.net/games/ea-desktop/) is a subscription-based video game service from Electronic Arts for the Xbox One, Xbox Series X/S, PlayStation 4, PlayStation 5 and Microsoft Windows platforms, offering access to selected games published by Electronic Arts along with additional incentives.

<img src="https://user-images.githubusercontent.com/45159366/189614466-476e0c4e-bab9-44bd-86c4-8aeadd739b63.png">

[Origin](https://lutris.net/games/origin/) is an online gaming, digital distribution and digital rights management (DRM) platform developed by Electronic Arts that allows users to purchase games on the internet for PC and mobile platforms, and download them with the Origin client (formerly EA Download Manager, EA Downloader and EA Link).

<img src="https://user-images.githubusercontent.com/45159366/189614468-49c4a05c-d6ca-4988-b3e6-10f0c71463d6.png">

[Itch.io Store](https://itch.io/app) is an app that lets you effortlessly download and run games and software from itch.io. All of your downloads are kept in a single place and are automatically updated.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/199429576-278a8604-7f76-4a41-abeb-84d03865daeb.png">
</p>

## Game Streaming

[Back to the Top](#games-and-software)

### Cloud

[Back to the Top](#games-and-software)

[Geforce NOW](https://www.nvidia.com/en-us/geforce-now/download/) is NVIDIA's Cloud Gaming Service.

<img src="https://user-images.githubusercontent.com/45159366/106686391-0f7c7a00-657f-11eb-9d0b-1ebb4d385883.jpeg">

[Xbox Cloud Gaming](https://www.xbox.com/en-US/xbox-game-pass/cloud-gaming) is Microsoft's cloud-based Xbox game-streaming technology **(currently in Beta)**. **Play games like Forza Horizon 4, Halo 5: Guardians, Gears of War 4, Sea of Thieves, Cuphead, Red Dead Redemption 2, and 100+ other games on your mobile device or Chrome web browser**. Xbox Cloud Gaming does require an [Xbox Game Pass Ultimate](https://www.xbox.com/en-US/xbox-game-pass/cloud-gaming) subscription.

- [Xbox Cloud Gaming in Microsoft Edge with Steam Deck | Microsoft](https://support.microsoft.com/en-us/topic/xbox-cloud-gaming-in-microsoft-edge-with-steam-deck-43dd011b-0ce8-4810-8302-965be6d53296)

<img src="https://user-images.githubusercontent.com/45159366/108111388-74d56e00-7049-11eb-8aeb-3e5d65f9e832.png">

[Amazon Luna](https://www.amazon.com/luna/landing-page) is Amazon's Cloud Gaming Service. Amazon Luna is Compatible/Supported on a vartiey of [Devices and Browsers](https://www.amazon.com/gp/help/customer/display.html?nodeId=GUFHUSX8X324T4XE).

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/112693072-364b8400-8e3d-11eb-9df0-d58af7ac9c9c.png">
</p>

Shadow](https://shadow.tech/) is a fully-featured, cloud-based, high-end computer. It is the only remote service that offers performance capable of competing with a local PC. Available on Windows, macOS, Linux, Android/AndroidTV, and iOS/tvOS.

<p align="center">
 <img src="https://user-images.githubusercontent.com/45159366/200110962-dd631248-7a13-48bb-9b5a-acbbf8550e16.png">
</p>

### Local Game Streaming

[Back to the Top](#games-and-software)

[Steam Remote Play Together](https://store.steampowered.com/remoteplay/#together) is a steam service that let's you share your Steam local multi-player games with friends over the internet, for free. Using Remote Play Together, one player owns and runs the game, then up to four players can join.

[Steam Link app](https://store.steampowered.com/steamlink/about) is available free of charge, streaming your Steam PC games to phones, tablets, and TV.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/112692999-14ea9800-8e3d-11eb-964a-6bee4e665900.png">
</p>

[Chiaki](https://git.sr.ht/~thestr4ng3r/chiaki) is a Free and Open Source Software Client for PlayStation 4 and PlayStation 5 Remote Play for Linux, FreeBSD, OpenBSD, Android, macOS, Windows, Nintendo Switch and potentially even more platforms. [Chiaki Flatpak](https://flathub.org/apps/details/re.chiaki.Chiaki)

[Parsec](https://parsec.app/cloud-gaming) is a video game streaming platform, which offers a wide variety of games and genres to choose from and provides a high-quality and smooth gameplay. SParsec is developed in order to provide a high-quality smooth gameplay, same time to be free of all ads and in-game purchases.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/166166858-e70ca081-8931-46f3-9dc3-fe9c719d76f8.png">
</p>

[Moonlight Game Streaming](https://moonlight-stream.org/) is a program that let you stream from your PC games over the Internet with no configuration required. Stream from almost any device, whether you're in another room or miles away from your gaming rig. [Sunshine](https://github.com/LizardByte/Sunshine) is a **Game stream host for Moonlight** that is a self-hosted, low latency, cloud gaming solution with support for AMD, Intel, and NVIDIA GPUs.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/106686398-11463d80-657f-11eb-841a-d534829ccc3d.png">
</p>

## Emulation

[Back to the Top](#games-and-software)

Also checkout these subreddits for more great Game Emulators recommendations

- [r/emulation](https://www.reddit.com/r/emulation/)
- [r/emulations](https://www.reddit.com/r/emulators/)
- [r/RetroArch](https://www.reddit.com/r/RetroArch/)
- [r/RetroPie](https://www.reddit.com/r/RetroPie/)
- [r/DolphinEmulator](https://www.reddit.com/r/DolphinEmulator/)
- [r/Citra](https://www.reddit.com/r/Citra/)
- [r/cemu](https://www.reddit.com/r/cemu/)
- [r/yuzu](https://www.reddit.com/r/yuzu/)
- [r/OpenEmu](https://www.reddit.com/r/OpenEmu/)
- [r/MAME](https://www.reddit.com/r/MAME/)
- [r/EmuDev](https://www.reddit.com/r/EmuDev/)
- [r/Roms](https://www.reddit.com/r/Roms/)

[EmuDeck](https://www.emudeck.com/) is a tool that takes care of everything for your retrogaming needs from RetroArch Configuration, Bezels, Gamepad Configuration for GameCube, Wii, Citra, SNES, etc. EmuDeck will even install EmulationStation Desktop Edition and carry over all their custom configurations and no need to configure ROM paths or anything.

[RetroDECK](https://retrodeck.net/) is a tool that brings an environment to catalog and play your retro games directly from SteamOS and it's tailored specifically for the Steam Deck. It's powered by EmulationStation Desktop Edition, which uses RetroArch and other standalone emulators to allow you to import and play your favorite retro (and even non-retro) games in a tidy environment without flooding your Steam library.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/180627466-718dd292-cad0-48bb-93d0-e071a9e42194.png">
</p>

[EmulationStation Desktop Edition (ES-DE)](https://www.es-de.org/) is a frontend application for browsing and launching games from your multi-platform game collection. It's  available for Unix/Linux, macOS(M1 & Intel) and Windows.

[Pegasus](https://pegasus-frontend.org/) is a cross platform, customizable graphical frontend for launching emulators and managing your game library (especially retro games) and launching them from one place. It's focused on customizability, cross platform support (including embedded devices) and high performance.

[RetroPie](https://retropie.org.uk/) is a frontend for emulators that allows you to turn your Raspberry Pi, ODroid C1/C2, or PC into a retro-gaming machine. It builds upon Raspbian, [EmulationStation](https://github.com/Aloshi/EmulationStation), RetroArch and many other projects to enable you to play your favourite Arcade, home-console, and classic PC games with the minimum set-up.

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/153087555-e1bde100-6079-4089-a33d-804e29064789.png">
    <br />
</p>

[RetroArch](https://www.retroarch.com/) is a frontend for emulators, game engines and media players. It enables you to run classic games on a wide range of computers and consoles through its slick graphical interface. Settings are also unified so configuration is done once and for all. [RetroArch Flatpak](https://flathub.org/apps/details/org.libretro.RetroArch)

[Cartridge](https://github.com/unclebacon-live/cartridge) is a self-hosted game library made with Laravel + Vue.js.

Cartridge Features

- Scan for ROM files and match with IGDB game information
- Serve ROM download links alongside game details
- Manage access to library with user creation and permissions (WIP)
- Allow users to request games (Planned)
- Play select ROMs in-browser using JS emulators (Planned)
- Track played and favorite games (even ones that aren't available for download) (Planned)

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/172274231-d691a850-1879-44fb-8fa0-08e549d7bb29.png">
    <br />
      Cartridge UI
</p>

### Emulators

[Back to the Top](#games-and-software)

[Dolphin](https://dolphin-emu.org) is an emulator for two recent Nintendo video game consoles: the GameCube and the Wii. It allows PC gamers to enjoy games for these two consoles in full HD (1080p) with several enhancements: compatibility with all PC controllers, turbo speed, networked multiplayer, and even more. [Dolphin Flatpak](https://flathub.org/apps/details/org.DolphinEmu.dolphin-emu)

[Citra](https://citra-emu.org/) is an open-source emulator for the Nintendo 3DS capable of playing many of your favorite games. [Citra Flatpak](https://flathub.org/apps/details/org.citra_emu.citra)

[yuzu](https://yuzu-emu.org) is an experimental open-source emulator for the Nintendo Switch from the creators of Citra.[Yuzu Flatpak](https://flathub.org/apps/details/org.yuzu_emu.yuzu)

[m64p](https://m64p.github.io/) is a Nintendo 64 Emulator. It uses mupen64plus-gui, a brand new mupen64plus frontend written in Qt5. It supports all of the things you’d expect from a frontend (savestate management, pausing, screenshots). [m64p Flatpak](https://flathub.org/apps/details/io.github.m64p.m64p)

[DeSmuME](https://desmume.org/) is a Nintendo DS emulator. [DeSmuME Flatpak](https://flathub.org/apps/details/org.desmume.DeSmuME)

[Snes9x](https://www.snes9x.com/) is a portable, freeware Super Nintendo Entertainment System (SNES) emulator. [Snes9x Flatpak](https://flathub.org/apps/details/com.snes9x.Snes9x)

[bsnes](https://github.com/bsnes-emu/bsnes) is a Super Nintendo (SNES) emulator focused on performance, features, and ease of use. [bsnes flatpak](https://flathub.org/apps/details/dev.bsnes.bsnes)

[mGBA](https://mgba.io/) is a new emulator for running Game Boy Advance games. It aims to be faster and more accurate than many existing Game Boy Advance emulators, as well as adding features that other emulators lack. [mGBA Flatpak](https://flathub.org/apps/details/io.mgba.mGBA)

[DOSBox](https://www.dosbox.com/) is an open-source DOS emulator which primarily focuses on running DOS Games.

[DOSBox Staging](https://github.com/dosbox-staging/dosbox-staging) is a full x86 CPU emulator (independent of host architecture), capable of running DOS programs that require real or protected mode. [DOSBox Staging Flatpak](https://flathub.org/apps/details/io.github.dosbox-staging)

[Flycast](https://github.com/flyinghead/flycast) is a multi-platform Sega Dreamcast, Naomi and Atomiswave emulator derived from reicast. [Flycast Flatpak](https://flathub.org/apps/details/org.flycast.Flycast)

[DuckStation](https://www.duckstation.org/) is an simulator/emulator of the Sony PlayStation 1 console, focusing on playability, speed, and long-term maintainability. [Available as a Flatpak on Flathub](https://flathub.org/apps/details/org.duckstation.DuckStation).

[PCSX2](https://pcsx2.net/) is a PlayStation 2 'emulator', a free program that tries to replicate the PlayStation 2 console to enable you to play PS2 games on your PC. [PCSX2 Flatpak](https://flathub.org/apps/details/net.pcsx2.PCSX2)

[RPCS3](https://rpcs3.net/) is an experimental open-source Sony PlayStation 3 emulator and debugger written in C++ for Windows and Linux. RPCS3 started development in May of 2011 by its founders DH and Hykem. The emulator is currently capable of running over 1800 commercial titles powered by Vulkan and OpenGL. [RPCS3 Flatpak](https://flathub.org/apps/details/net.rpcs3.RPCS3)

[MAME](https://www.mamedev.org/) is a Arcade Machine Emulator.

[xemu](https://xemu.app/) is an original Xbox emulator.

[Xenia](https://github.com/xenia-project/xenia) is an Xbox 360 Emulator.

## Android

[Back to the Top](#games-and-software)

[Waydroid](https://github.com/waydroid/waydroid) is a container-based approach to boot a full Android system on a regular Linux system. Make sure to checkout the [Waydroid Arch wiki page](https://wiki.archlinux.org/title/Waydroid).

* [Setting up WayDroid by Philipp Richter](https://gitlab.com/popsulfr/steam-deck-tricks#android-via-waydroid)

<p align="center">
  <img src="https://user-images.githubusercontent.com/45159366/189516892-24454312-836a-4a88-a6b8-a3e9aaa8612c.png">
    <br />
</p>

[Anbox](https://github.com/anbox) is a container-based software for running a full Android system on Linux distributions. Make sure to checkout the [Anbox Arch wiki page](https://wiki.archlinux.org/title/Anbox).












#Desktop Mode
## Running Installers
Fellow Linux noobs like myself may get stumped by a certain problem when attempting to run installers from within desktop mode. If you try to run an installer and get a message that there's no software to run it, then then may confuse you since installers don't typically require special software to run. If you encounter this while trying to install any of the software from this guide, then all you need to do to resolve it is go to the file's properties and check off "is executable" from the permissions tab.

## On-Screen Keyboard
Don't bother trying to use the on-screen keyboard as a touchscreen keyboard from within desktop mode. Works great for SteamOS, but for whatever reason the keyboard isn't very responsive to touch from within desktop mode. I find the keyboard is best used by typing with the touch pads in this case. It takes some getting used to, but it works great once you are accustomed to it.

Sept 21st edit: Valve has fixed this issue in the latest update for the beta branch. https://store.steampowered.com/news/app/1675200/view/5464578025606471947 Likely will be in the next stable release as well.

## Closing The Steam Client
Some things you want to do in desktop mode will also require you to close Steam. Note that closing Steam for whatever reason will change the control scheme when you're using it in handheld mode. You wont be able to do anything with the built-in controls for a few seconds after Steam closes, but just wait it out. You'll find that the track-pads can still be used for moving the mouse, but clcking them no longer does anything. For whatever reason, you'll have to switch to using the triggers for right and left mouse clicks until you run the Steam client again.

More importantly, the Steam button doesn't do anything when the Steam client is closed, which means that you cannot use it to open the on-screen keyboard when it's closed. Keep this in mind when you're doing something that requires you to close it, such as running the Steam Rom Manager that is covered in the emulation section.

#SteamOS (gaming mode)
## Managing Storage
A great deal of you are no doubt using or planning on using an SD card for your Steam deck. If you're like me, then you will be wanting to put specific games on internal storage or SD for various reasons. You should therefore know that SteamOS does not ask you where to want to download games to when you install them from the library. It will automatically use whatever you set the default storage location to in settings. If you don't want to switch the default storage location for a specific installation, then all you need to do visit the store page and install from there. This is the only way I'm aware of in order to pick which storage you want to you use on a per-game basis.

## Decky Plugin Loader
https://github.com/SteamDeckHomebrew/decky-loader. Decky is an addon to SteamOS that can be used to install and manage plugins from right inside of SteamOS.

There are various useful plugins that you can find in the built-in plugin store, but I think the one with the most widespread appeal is ProtonDB Badges. This plugin connects to the ProtonDB https://www.protondb.com/ website and will display their compatibility rating in the top left corner when viewing the games in your library. You can click on the badge in order to go right to the ProtonDB page and get more info about the compatibility score. Other Steam Deck users who have uploaded their experience to the website will be clearly indicated with a Steam Deck logo. This is very useful when determining if an unverified game is going to play well on your deck or not. Sometimes there's tinkering steps provided that may be necessary to get the game running or increase performance as well.

#Playing Games From Other Stores
So lots of you are going to have games from other store fronts that you will want to try on Steam Deck. This is pretty easy to do, but it'll require that you install the third party launchers and/or games from desktop mode and add them to your Steam library in order to access them from within SteamOS, aka "Gaming Mode".

## BoilR
https://github.com/PhilipK/BoilR BoilR is a tool that can be used to automatically add non-Steam games to your Steam library, and can be set up to automatically download and apply artwork from SteamGridDB https://www.steamgriddb.com/ as well. You can also configure the games to launch through third-party launchers when this is required of them. The following sections will cover how to isntall non-Steam games from various sources and BoilR should be kept in mind as a convenient way to add them all to your Steam library once they're installed.

## Lutris
Used for installing and playing games from: GOG, Epic Games Store, Origin or Ubisoft Connect

If you're looking to install any of the above lauchers / store fronts onto your Steam Deck then Lutris https://lutris.net/ is a popular option. It's available via the Discover app in desktop mode and it helps you install and play video games from these store fronts by using existing emulators, engine re-implementations and compatibility layers.

Lutris also serves as a central point to launch the games from after you've installed them and can be added to your Steam library to launch from within SteamOS. However, you may decide you want to add the games themselves your library instead, and that can easily be achieved with the aforementioned BoilR.

## Heroic Games Launcher
Thank you to u/Javasteam for reminding me about this one.

https://heroicgameslauncher.com/ Heroic Games Launcher is another popular option for playing games from GOG and Epic Games Store. It actually provides an entirely separate launcher, but you can still access the Epic or GOG store and make purchases from within.

## itch.io
itcho.io has a desktop app https://itch.io/app that is available for Linux. It is a convenient way to access and install games from your itch.io library, but as of the writing of this guide, it doesn't seem possible to launch the app from within SteamOS. Attempting to do so with result in it loading for a while before closing without any sort of error message.

With that being said, I've played Turnip Boy Commits Tax Evasion, as well as Unciv from within Desktop mode and they both played great. I didn't have to configure the controls for Turnip Boy and the touch pads work great for playing a point-and-click game like Unciv.

Neither of the games showed up in the list when I tried to add them to my library using the Steam client, but I was able to add them using BloilR. However, I was not successful trying to launch Turnip Boy from within SteamOS and had similar experience to trying to run the itch launcher. However, I was able to launch Unciv no problem.

Again, Turnip boy launched and played great in desktop mode, so I have no idea what the problem is.

u/Cool-Arrival-2617 informed me a while back of a itch flatpak https://github.com/gjpin/itch-flatpak that would probably work via SteamOS and might fix my issue with launching Turnip Boy, but I haven't got around to trying it yet.

Edit: This comment https://www.reddit.com/r/SteamDeck/comments/xitb9p/my_ultimate_steam_deck_guide_after_being_able_to/ip4z547/?context=3 mentions that installing the Windows version of the itch.io app and adding it to your library through Bottles https://usebottles.com/ seems to work better.

## Xbox Cloud Gaming
https://support.microsoft.com/en-us/topic/xbox-cloud-gaming-in-microsoft-edge-with-steam-deck-43dd011b-0ce8-4810-8302-965be6d53296 Microsoft's official documentation on Xbox Cloud Gaming in Microsoft Edge with Steam Deck. I don't play xbox and so haven't tried this myself, but there you go.

#Emulation
Most emulators have native Linux versions and you can simply download, configure and install them individually. However, here are two major options for streamlining your emulation experience on Steam Deck: EmuDeck https://www.emudeck.com/ and RetroDECK. https://retrodeck.net/

EmuDeck has been around longer and seem to be the more widely used option, at least in this subreddit. I hadn't heard of RetroDECK when I first started with emulation on my Steam Deck either, so EmuDeck is the one that I have the most experience with. That said, I've had a pleasant experience using both of them and I'll do my best to cover both of them.

## EmuDeck
https://www.emudeck.com/ EmuDeck is downloaded off the website. When you run the installer, it initiates a script that will automatically install and configure a bunch of emulators to your Steam Deck. During the installation it will also ask you where you want to save your ROMs and BIOS files to and will create a folder structure there accordingly. Once that's done, you will have to go into the file system and place your ROMs and BIOS into the appropriate folders that it created in order to install them.

After installing ROMs you will have to close the Steam client and run the SteamRomManager.desktop script in order to add the games into your Steam library. Just like BoilR, this program will also use SteamGridDB https://www.steamgriddb.com/ to automatically download and apply artwork to your games.

You do not have to add the ROMs to your Steam library just because you're using EmuDeck though. It seamlessly integrates with EmulationStation https://github.com/Aloshi/EmulationStation

EmuDeck is catching increasing amounts of criticism from the community for not being available as a Flatpack, for having a "messy" install that places files and folders into different locations, and not being able to be fully uninstalled via it's own uninstall script.

Lastly, this post https://www.reddit.com/r/SteamDeck/comments/xfdswn/really_important_setup_instructions_most_emudeck/ also talks about how it may be necessary to reconfigure EmuDeck in order to get decent performance with some emulators. It might be fixed with an update, but for now, be sure to switch off of the RetroArch cores for improvement with N64, PS2, Gamecube and Wii emulation.

## RetroDECK
RetroDECK wins in ease of installation and updating simply because it is a Flatpack available via the Discovery app. Just like EmuDeck, it will install and configure emulators for your Steam Deck.

Unlike EmuDeck, RetroDECK does NOT add the Steam games to your library and instead functions as a standalone launcher for your ROMs. You can add it to your library as a non-Steam app for use within SteamOS, but there's no option to add the games to your library and BoilR doesn't seem to work with ROMs either. This isn't strictly a bad thing though, and some people may actually prefer a separate launcher for their ROMs, especially if they have a lot of them. Lastly, it can also use Steam Grid to add artwork to your ROMs after installation.

## General Emulation Advice
###FPS limiting

Limiting to 40 refresh rate and 40 fps is common bit of tinkering a lot of people do to squeeze some more battery life out of their deck. This comment https://www.reddit.com/r/SteamDeck/comments/xitb9p/my_ultimate_steam_deck_guide_after_being_able_to/ip6hc5c/?context=3 goes into detail about why this isn't a good idea for many emulators. If you have 40 fps as the default for all games on your Steam Deck then I recommend switching to only using that as a per-game setting and going with 30 or 60 fps on any emulated games.

###Disabling Simultaneous Multithreading (SMT)

Thank you u/Intoxicus5 from this comment chain https://www.reddit.com/r/SteamDeck/comments/xitb9p/my_ultimate_steam_deck_guide_after_being_able_to/ip7qzcc/?context=3 who educated me on this topic. What is suggested is disabling SMT when emulating any device that wasn't designed to handle modern multicore CPUs (which is definitely any system as old as the Wii or older). This can be done by installing the PowerTools extension for the Decky plugin loader that's covered in the SteamOS section.

###Switching to the OpenGL API

So Vulkan is better most of the time for your graphics API, but if you're noticing poor performance still after disabling SMT in an emulator for older hardware, then it might be worth it to try switching to OpenGL in your emulator's settings. u/Intoxicus5 also reports that this has increased his performance for the Dolphin emulator in particular.

#Compatibility Tools
## ProtonUp-Qt
ProtonUp-Qt is an excellent tool for installing and managing third-party compatibility tools for your Steam games, also available via the Discover app. I won't go into detail talking about it here, but rather I'll just link to this https://www.youtube.com/watch?v=wilUcrHNaCE informative YouTube video where I found out about it.

TL;DR: it is a single interface for downloading various compatibility tools and you can also assign said compatibility tools to specific games from right inside it's GUI. Very convenient if you want to mess round with these.

It can be used to install and manage all of the following compatibility tools:

GE-Proton (GE stands for Glorious Eggroll) https://github.com/GloriousEggroll/proton-ge-custom

Boxtron https://github.com/dreamer/boxtron

Luxtorpeda https://github.com/dreamer/luxtorpeda

Proton Tkg https://github.com/Tk-Glitch/wine-proton-tkg

Roberta https://github.com/dreamer/roberta

## Bottles
https://usebottles.com/ Bottles is yet another compatibility tool available via the Discovery app and is for running Windows software in Linux. It's kinda like Proton, but for desktop applications. It has both a gaming and general software environment. With the gaming one you can run the Windows version of the itch app and the other game stores that I otherwise suggested using Lutris for in the Non-Steam Gaming section. Why would you do this? Well at least in the case of the itch app, it seems that running the Windows version of it through bottles just makes it work better and lets you run more games. It's not strictly for gaming though, and the general software environment is designed for other use cases. More advanced configuration of bottles is also available to power users.

#File Transfer
There are so many different options available and I'm sure someone's gonna leave a comment talking about SSH and whatnot, but the solution I've gone with and that has worked great for me is Warpinator https://github.com/linuxmint/warpinator#warpinator---send-and-receive-files-across-a-local-network. It's available via the Discovery app for installing to your Steam Deck and is super easy to use. The developer only made it for Linux, but it's free and open source and that page contains links for other projects that make it work on Windows, Android and iOS as well. Once you've installed it, the only setup required is going into the settings and determining where you want the files to save to.

https://www.youtube.com/watch?v=x4_Sexd1UAw This video covers how to share folders with other devices on your local network without using any third party software and is also an option. It also covers setting up a network-attached storage system https://www.ibm.com/topics/network-attached-storage if that's something you're interested in.

#Game Streaming (local network)
Several users have proposed game streaming services as an alternative to file transfer. These are great services that I'm sure many people will find useful, so I've included some of them here, but I do not consider this as an alternative to file transfer. This is because these services are simply intended the extend your game library from something like a desktop computer to other devices in your house. There's plenty of use for it, including with your Steam Deck, but a streaming service is not going to help if you're traveling with your Steam Deck or if you want to transfer files en mass onto it, such as a collection of ROMs.

## Steam Link
https://store.steampowered.com/app/353380/Steam_Link/ Steam Link is a service that's built right into the Steam client and therefore won't require any additional downloads or setup for use on your Steam Deck.

## Moonlight & Sunshine
https://moonlight-stream.org/ Moonlight is an opensource NVIDIA game streaming client and Sunshine https://github.com/LizardByte/Sunshine adds compatibility for AMD and Intel GPUs. Several users have attested to superior performance than Steam Link, so if you're not satisfied with the image qualify, FPS or input lag when using Steam Link, then Moonshine / Sunshine may the superior choice.

#Buying an SD Card
Research the best SD card for the Steam Deck before buying one! Don't buy cheap brands either. Be cautious of brands you've never heard of before, and the deal seems too good to be true, it probably is! https://www.makeuseof.com/tag/how-to-spot-fake-microsd-card/

This video https://www.youtube.com/watch?v=JGHZs8RTlVU talks about what stats to look for when purchasing a micro SD card. They recommend an SDXC U3 A2 micro SD card for best performance.

This video https://www.youtube.com/watch?v=eNX4SFMftEY compares the performance of the 256GB model SD card for all the major brands with the same specifications as the previous video. Samsung ended up being the best for 512GB and below, whereas Sandisk is the best for 1TB.

Edit: Thanks to this commenter https://www.reddit.com/r/SteamDeck/comments/xitb9p/my_ultimate_steam_deck_guide_after_being_able_to/ip6hri4/?context=3 directing me to an infographic that provides much of the same info as the first video. Definitely more useful as just a quick reference point.











