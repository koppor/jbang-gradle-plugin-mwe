plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

pluginManagement {
  repositories {
      mavenLocal()
      gradlePluginPortal()
  }
}

rootProject.name = "jbang-gradle-plugin-mwe"
include("lib")
