import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidComposeFeatureConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("shoppingcare.android.library")
                apply("shoppingcare.android.library.compose")
            }

            dependencies {
                "implementation"(project(":domain"))
                "implementation"(project(":core:designsystem"))
            }
        }
    }
}
