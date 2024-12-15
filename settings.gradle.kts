rootProject.name = "Tim"
include("app")

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven ("https://jitpack.io")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
    }
}

plugins {
    id("com.android.application") version "8.7.3" apply false
    id("com.android.library") version "8.7.3" apply false
    id("org.jetbrains.kotlin.android") version "2.0.20" apply false
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven ("https://jitpack.io")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
    }
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
}
