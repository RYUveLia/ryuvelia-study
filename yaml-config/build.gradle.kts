plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

group = "com.ryuvelia"

dependencies {
    implementation("com.charleskorn.kaml:kaml:0.53.0")
    implementation("com.google.guava:guava:r05")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-jvm:1.6.3")
}
