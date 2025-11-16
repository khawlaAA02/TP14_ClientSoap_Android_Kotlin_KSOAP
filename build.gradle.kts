// build.gradle.kts (racine)

plugins {
    // on DÉCLARE les plugins sans les appliquer au projet racine
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// tâche clean classique
tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
