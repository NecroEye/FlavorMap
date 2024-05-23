buildscript{

    repositories{
        google()
        mavenCentral()
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
    alias(libs.plugins.hiltAndroid) apply false
    alias(libs.plugins.android.library) apply false
}

val clean by tasks.registering(Delete::class) {
    delete(rootProject.buildDir)
}
