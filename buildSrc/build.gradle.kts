plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.20"
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:8.6.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
}

kotlin {
    jvmToolchain(17)
}
