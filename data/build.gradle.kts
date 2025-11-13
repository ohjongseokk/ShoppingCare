plugins {
    alias(libs.plugins.shoppingcare.android.library)
}

android {
    namespace = "co.kr.datau.shoppingcare.data"
}

dependencies {
    implementation(projects.domain)
}