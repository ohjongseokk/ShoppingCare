plugins {
    alias(libs.plugins.shoppingcare.android.application)
}

android {
    namespace = "co.kr.datau.shoppingcare.app"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data)

    implementation(projects.feature.launch)
}