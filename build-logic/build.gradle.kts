plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)         // 추후 추가될 hilt, room 플러그인을 추가하는 과정에서 ksp 플러그인 사용을 위함
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
        register("androidLibraryCompose") {
            id = "shoppingcare.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("jvmLibrary") {
            id = "shoppingcare.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("androidFeatureCompose") {
            id = "shoppingcare.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
    }
}
