#!/usr/bin/env bash

ANDROID_HOME=$HOME/android/android-sdk \
  gradle \
  --no-daemon \
  -P android.aapt2FromMavenOverride=$HOME/android/android-sdk/build-tools/35.0.0/aapt2 \
  installDebug
