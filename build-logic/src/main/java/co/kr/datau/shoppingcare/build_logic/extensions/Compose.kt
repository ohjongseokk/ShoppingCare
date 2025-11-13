package co.kr.datau.shoppingcare.build_logic.extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>
) {
    commonExtension.apply {
        buildFeatures {
            compose = true
        }

        dependencies {
            "implementation"(platform(libs.findLibrary("androidx-compose-bom").get()))
            "implementation"(libs.findLibrary("androidx-ui-tooling-preview").get())
            "debugImplementation"(libs.findLibrary("androidx-ui-tooling-preview").get())
        }
    }
}
