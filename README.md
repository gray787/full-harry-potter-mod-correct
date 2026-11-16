# Wizarding World Spells

Fabric mod project configured for Minecraft Java 26.3.

## Build

Requirements: Java 25 and Gradle 9.6.0.

```bash
gradle clean build
```

The distributable JAR is created in `build/libs/`. On GitHub, push this project and open **Actions**. Download the artifact named `wizarding-world-mod` from a successful workflow run.

## Repair scope

This repair fixes the broken project layout, obsolete build setup, missing entrypoint, and invalid metadata. The supplied spell JSON is retained. The original wand screen, wand item registration, chest loot injection, spell execution, and tracer rendering referenced missing classes or older Minecraft APIs and are not yet implemented in this repaired build.
