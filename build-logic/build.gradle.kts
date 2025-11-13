plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "shoppingcare.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "shoppingcare.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "shoppingcare.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidComposeLibrary") {
            id = "shoppingcare.android.compose.library"
            implementationClass = "AndroidComposeLibraryConventionPlugin"
        }
        register("jvmLibrary") {
            id = "shoppingcare.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("androidComposeFeatureCompose") {
            id = "shoppingcare.android.compose.feature"
            implementationClass = "AndroidComposeFeatureConventionPlugin"
        }
    }
}
