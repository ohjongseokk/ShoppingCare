plugins {
    alias(libs.plugins.shoppingcare.jvm.library)
}

dependencies {
//    implementation(projects.core.model)
    api(project(":core:model"))
}