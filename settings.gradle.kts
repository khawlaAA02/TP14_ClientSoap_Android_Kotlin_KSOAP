pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        // 👉 dépôt spécial pour ksoap2-android
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/ksoap2-android-releases/")
        }
    }
}

rootProject.name = "SOAPCompteApp"
include(":app")
 