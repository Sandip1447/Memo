/**
 * Created by Sandip Rode on 30-01-2022.
 */
object BuildConfig {

    const val navigation =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"

    const val google_services = "com.google.gms:google-services:${Versions.google_services}"
    const val build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle}"
    const val firebase_crashlytics = "com.google.firebase:firebase-crashlytics-gradle:${Versions.crashlytics_gradle}"

    const val hilt_gradle ="com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt_gradle}"

}