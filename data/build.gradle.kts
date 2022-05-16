plugins {
    id(libs.plugins.agp.library.get().pluginId)
    kotlin("android")
    id("kotlin-kapt")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 22
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            buildConfigField("String", "MAIN_BASE_URL", "\"https://kitsu.io/api/edge/\"")
            buildConfigField("String", "AUTH_BASE_URL", "\"https://kitsu.io/api/oauth/\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(libs.bundles.okHttp)
    implementation(libs.bundles.retrofit)
    implementation(libs.coroutines.android)
    // Paging 3
    api(libs.paging.paging)
}