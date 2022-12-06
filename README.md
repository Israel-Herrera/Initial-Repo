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
