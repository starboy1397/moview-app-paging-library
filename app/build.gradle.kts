plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.hilt.android)
}

android {
    namespace = "com.mastercoding.pagingapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mastercoding.pagingapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures{
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.hilt.android) // Hilt Android
    annotationProcessor(libs.hilt.compiler) // Hilt Compiler
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.retrofit)
    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler)
    implementation(libs.swiperefreshlayout)
    implementation(libs.gson)
    implementation(libs.retrofit.gson)
    implementation(libs.paging.runtime)
    implementation(libs.paging.rxjava3) // RxJava3 support for Paging
    implementation(libs.retrofit.rxjava3) // Retrofit RxJava3 adapter
    implementation(libs.lifecycle.runtime) // Lifecycle Runtime
    implementation(libs.lifecycle.livedata) // LiveData
    implementation(libs.lifecycle.viewmodel) // ViewModel
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    testImplementation(libs.paging.common) // Optional: Testing Paging components

}