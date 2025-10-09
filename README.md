# RetailSense – Costco IoT
**Author:** Gustavo Sanchez  
**Course:** CSTP2301 – Database & Mobile Systems  
**Project:** RetailSense Costco IoT  
**Version:** v1.0.0

---

## Overview
RetailSense is a simulated IoT monitoring system designed for retail environments (e.g., Costco).  
It demonstrates real-time store monitoring, device management, and data-driven insights — all within a simulated clock environment.

The app follows Material Design 3 guidelines and is built entirely with **Java**, **RecyclerView**, and **MPAndroidChart** for visualization.

---

##  Build Steps

### 1. Prerequisites
- Android Studio Hedgehog or newer
- Gradle 8+
- Minimum SDK: 26
- Target SDK: 34

### 2. Dependencies
dependencies {
implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
implementation("androidx.recyclerview:recyclerview:1.3.1")
implementation("com.google.android.material:material:1.10.0")
implementation(libs.appcompat)
implementation(libs.material)
implementation(libs.activity)
implementation(libs.constraintlayout)
implementation(libs.recyclerview)
implementation(libs.lifecycle.livedata)
implementation(libs.lifecycle.viewmodel)
implementation(libs.mpandroidchart)
implementation(libs.androidx.recyclerview)
testImplementation(libs.junit)
androidTestImplementation(libs.ext.junit)
androidTestImplementation(libs.espresso.core)
}
