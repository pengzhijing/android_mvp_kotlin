plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.pzj.android_mvp_kotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.pzj.android_mvp_kotlin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding{
        enable=true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("q.rorbin:VerticalTabLayout:1.2.5")

    /*material*/
    implementation("com.google.android.material:material:1.2.1")

    /*YUtils*/
    implementation(libs.yechaoaYUtils)

    /*retrofit、rxjava*/
    implementation(libs.retrofit)
    implementation(libs.adapter.rxjava2)
    implementation(libs.converter.gson)
    implementation(libs.rxandroid)
    implementation(libs.logging.interceptor)

    /*BRVAH*/
    implementation(libs.baseRecyclerViewAdapterHelper)

    /*banner*/
    implementation(libs.banner)

    /*glide*/
    implementation(libs.glide)
    implementation(libs.compiler)

    /*agentWeb*/
    implementation(libs.agentweb)

    /*VerticalTabLayout*/
    /*implementation(libs.verticalTabLayout)*/

    /*FlowLayout*/
    implementation(libs.flowlayout.lib)


}