 Info
---
This project is a reproducer of a changed Gradle behaviour between 6.3 to 6.4-rc-1.

What was changed
---
When you change project version for all sub projects everything is recompiled and build cache is not used.

In this reproducer I force project version on every build with:  `version = UUID.randomUUID().toString()` in build.gradle.


Gradle 6.3:  
1. gradle clean compileJava -> first run, nothing is taken from cache
2. gradle clean compileJava -> second run, compileJava is taken from cache

Gradle 6.4-rc-1:  
1. gradle clean compileJava -> first run, nothing is taken from cache
2. gradle clean compileJava -> second run, nothing is taken from cache

