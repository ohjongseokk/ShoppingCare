import co.kr.datau.convention.extensions.ApplicationConst
import co.kr.datau.convention.extensions.configureKotlin
import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(plugins) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlin(this)

                defaultConfig.apply {
                    targetSdk = ApplicationConst.TARGET_SDK
                    versionCode = ApplicationConst.VERSION_CODE
                    versionName = ApplicationConst.VERSION_NAME
                }
            }
        }
    }
}