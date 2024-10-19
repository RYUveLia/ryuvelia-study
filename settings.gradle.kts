rootProject.name = "ryuvelia-study"

pluginManagement {
    val kotlinVersion: String by settings
    val ktlintVersion: String by settings
    val detektVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        kotlin("kapt") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion
        id("org.jlleitschuh.gradle.ktlint") version ktlintVersion
        id("io.gitlab.arturbosch.detekt") version detektVersion
        kotlin("plugin.spring") version kotlinVersion
    }

    repositories {
        gradlePluginPortal()
    }
}

include("yaml-config")
