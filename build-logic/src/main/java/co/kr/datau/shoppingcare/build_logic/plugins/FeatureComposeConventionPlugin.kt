import co.kr.datau.shoppingcare.build_logic.extensions.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class FeatureComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("shoppingcare.android.library")
                apply("shoppingcare.android.compose.library")
            }

            dependencies {
                "implementation"(project(":domain"))
                "implementation"(project(":core:designsystem"))
            }
        }
    }
}
