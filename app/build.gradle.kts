plugins {
    alias(libs.plugins.shoppingcare.android.application)
    alias(libs.plugins.shoppingcare.android.application.compose)
}

android {
    namespace = "co.kr.datau.shoppingcare.app"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data)

    implementation(projects.feature.launch)
}