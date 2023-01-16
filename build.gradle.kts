// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugin.ANDROID_APPLICATION) version "7.3.1" apply false
    id(Plugin.ANDROID_LIBRARY) version "7.3.1" apply false
    id(Plugin.KOTLIN_ANDROID) version "1.7.20" apply false
    id(Plugin.SECRET_GRADLE_PLUGIN) version "2.0.1" apply false
    id(Plugin.NAVIGATION) version "2.5.3" apply false
    id(Plugin.KOTLIN_SERIALIZATION) version "1.7.21" apply false
    id(Plugin.DAGGER_HILT) version "2.44" apply false
}