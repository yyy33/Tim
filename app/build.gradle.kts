plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

kotlin {
    jvmToolchain(17)
}

android {
  namespace = "com.tim"

  compileSdk = 35 

  buildToolsVersion = "35.0.0"

  ndkVersion = "27.1.12297006"

  defaultConfig {
    applicationId = "com.tim"

    minSdk = 26 

    targetSdk = 35 

    versionCode = 1

    versionName = "1.0"
  }


  buildTypes {
    getByName("release") {
      isMinifyEnabled = true 
      proguardFiles( 
      getDefaultProguardFile("proguard-android.txt"), 
      "proguard-rules.pro" 
    )
    }
  }

  buildFeatures {
    viewBinding = true
  }

}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.window:window:1.1.0-beta02")
    implementation("androidx.startup:startup-runtime:1.1.1")
}
