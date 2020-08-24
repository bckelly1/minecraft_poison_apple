This is an apple that poisons you

It is based on https://github.com/TechnoVisionDev/Forge-Modding-Tutorial-1.16

And

https://adfoc.us/serve/sitelinks/?id=271228&url=https://files.minecraftforge.net/maven/net/minecraftforge/forge/1.16.2-33.0.20/forge-1.16.2-33.0.20-mdk.zip

## Setup
* Install [Minecraft Forge](https://adfoc.us/serve/sitelinks/?id=271228&url=https://files.minecraftforge.net/maven/net/minecraftforge/forge/1.16.2-33.0.20/forge-1.16.2-33.0.20-installer.jar).
* Open IntelliJ (or Eclipse I suppose).
* Import Project
* Allow gradle to init, run fg_runs.genIntellijRuns
* Restart IntelliJ
* run fg_runs.runClient

Sometimes the dependent jar cannot be found, you have to troubleshoot the build.gradle minecraft versions.
The snapshots tend to not be reliable, I'm not sure I understand their format yet.
