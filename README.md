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
- Minimum SDK: 27
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


# RetailSense – Costco IoT CheckList

## Home Screen
- [ ] H1: Cards navigate to correct screens (Stores, Devices, Alerts, Insights)
- [ ] H2: Reset Day resets time and data, shows snackbar
- [ ] H3: About dialog shows app info

---

## Stores Screen
- [ ] S1: List sorted by store name ascending
- [ ] S2: Status chip count equals active alerts for each store
- [ ] S3: Maintenance dialog validates input and shows success toast

---

## Store Dashboard
- [ ] D1: Acknowledge single alert decrements active alert count
- [ ] D2: Acknowledge all sets active alerts to zero
- [ ] D3: Advance 1 hour updates at least one tile and one chart
- [ ] D4: Recent Alerts RecyclerView works with Acknowledge/Suppress
- [ ] D5: Store Devices RecyclerView shows type, label, status, last heartbeat

---

## Devices Screen
- [ ] V1: Filter chips update list within 100ms for ≤200 rows
- [ ] V2: Disable excludes device from aggregates and charts
- [ ] V3: Maintenance dialog validates input and shows success toast

---

## Device Detail
- [ ] E1: Type-specific chart shows at least last 24h
- [ ] E2: Calibration updates band/threshold immediately
- [ ] E3: Acknowledge removes device alerts from Alerts and Store Dashboard

---

## Alerts Screen
- [ ] A1: Multiple filters apply intersection logic
- [ ] A2: Acknowledge removes row and decrements global count
- [ ] A3: Open device navigates to Device Detail

---

## Insights Screen
- [ ] I1: All four charts render correctly on first launch
- [ ] I2: Correlation r value equals computed value from plotted points

---

## Readings
- [ ] RP1: CSV exists for every device ID
- [ ] RP2: CSV schema and row counts match type definitions
- [ ] RP3: Timestamps are ISO-8601 UTC and strictly ascending

---

## Non-functional
- [ ] NF1: Material Design 3 used throughout
- [ ] NF2: RecyclerViews scroll smoothly at 60fps
- [ ] NF3: Empty states and accessible labels present
- [ ] NF4: Malformed CSV row is skipped without crashing



MIT License

Copyright (c) 2025 Gustavo Sanchez

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

