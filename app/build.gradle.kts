plugins {
    id(Plugin.ANDROID_APPLICATION)
    id(Plugin.KOTLIN_ANDROID)
    id(Plugin.KAPT)
    id(Plugin.SECRET_GRADLE_PLUGIN)
    id(Plugin.NAVIGATION)
    id(Plugin.KOTLIN_PARCELIZE)
    id(Plugin.HILT_PLUGIN)
}

android {
    namespace = "com.example.booksearchapp"
    compileSdk = DefaultConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.example.booksearchapp"
        minSdk = DefaultConfig.MIN_SDK_VERSION
        targetSdk = DefaultConfig.TARGET_SDK_VERSION
        versionCode = DefaultConfig.VERSION_CODE
        versionName = DefaultConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APP_COMPACT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)

    //Testing
    testImplementation(Testing.JUNIT4)
    testImplementation("androidx.test.ext:truth:1.5.0")
    testImplementation("androidx.test:runner:1.5.2")

    androidTestImplementation(Testing.ANDROID_JUNIT)
    androidTestImplementation(Testing.ESPRESSO_CORE)

    //Retrofit
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER_MOSHI)

    //Moshi
    implementation(Dependencies.MOSHI)
    kapt(Dependencies.MOSHI_KAPT)

    //OkHttp
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.OKHTTP_LOGGING_INTERCEPTOR)

    //Lifecycle
    implementation(Dependencies.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependencies.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.LIFECYCLE_SVAESTATE)

    //Coroutine
    implementation(Dependencies.COROUTINE_CORE)
    implementation(Dependencies.COROUTINE_ANDROID)

    //Coil
    implementation(Dependencies.COIL)

    //RecyclerView
    implementation(Dependencies.RECYCLERVIEW)

    //Navigation
    implementation(Dependencies.NAVIGATION_FRAGMENT_KTX)
    implementation(Dependencies.NAVIGATION_UI_KTX)

    //Room
    implementation(Dependencies.ROOM_RUNTIME)
    implementation(Dependencies.ROOM_KTX)
    kapt(Dependencies.ROOM_COMPILER)
    implementation(Dependencies.ROOM_PAGING)

    //Kotlin serialization
    implementation(Dependencies.KOTLINX_SERIALIZATION)

    //DataStore
    implementation(Dependencies.DATASTORE_PREFERENCE)

    //Paging
    implementation(Dependencies.PAGING_RUNTIME)

    //WorkManager
    implementation(Dependencies.WORK_RUNTIME)

    //Hilt
    implementation(Dependencies.HILT_ANDROID)
    kapt(Dependencies.ANDROID_COMPILER)

    //viewModel delegate
    implementation(Dependencies.ACTIVITY_KTX)
    implementation(Dependencies.FRAGMENT_KTX)

    //Hilt extension
    implementation(Dependencies.HILT_WORK)
    kapt(Dependencies.HILT_COMPILER)
}