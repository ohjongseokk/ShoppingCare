plugins {
    alias(libs.plugins.shoppingcare.android.compose.feature)
}

android {
    namespace = "co.kr.datau.shoppingcare.feature.launch"
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)

}