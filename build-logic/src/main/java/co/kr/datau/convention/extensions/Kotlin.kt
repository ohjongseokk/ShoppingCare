package co.kr.datau.convention.extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

internal fun Project.configureKotlin(
    commonExtension: CommonExtension<*, *, *, *, *, *>
) {
    commonExtension.apply {
        compileSdk = ApplicationConst.COMPILE_SDK

        defaultConfig {
            minSdk = ApplicationConst.MIN_SDK
        }

        compileOptions {
            sourceCompatibility = ApplicationConst.JAVA_VERSION
            targetCompatibility = ApplicationConst.JAVA_VERSION
        }

        configureKotlinOptions {
            jvmTarget = ApplicationConst.JDK_VERSION
        }

        buildTypes {
            getByName("release") {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android.txt"),
                    "proguard-rules.pro",
                )
            }
        }
    }
}

internal fun CommonExtension<*, *, *, *, *, *>.configureKotlinOptions(
    block: KotlinJvmOptions.() -> Unit,
) {
    (this as ExtensionAware).extensions.configure("kotlinOptions", block)
}