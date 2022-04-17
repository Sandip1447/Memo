/**
 * Created by Sandip Rode on 30-01-2022.
 */
object Dependencies {

    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val kotlin_standard_library = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val firebase_auth = "com.google.firebase:firebase-auth:${Versions.firebase_auth}"
    const val firebase_crashlytics =
        "com.google.firebase:firebase-crashlytics:${Versions.firebase_crashlytics}"
    const val firebase_analytics =
        "com.google.firebase:firebase-analytics:${Versions.firebase_analytics}"
    const val firebase_messaging =
        "com.google.firebase:firebase-messaging:${Versions.firebase_messaging}"

    const val navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val navigation_runtime = "androidx.navigation:navigation-runtime:${Versions.nav_version}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
    const val navigation_dynamic =
        "androidx.navigation:navigation-dynamic-features-fragment:${Versions.nav_version}"

    const val room_runtime = "androidx.room:room-runtime:${Versions.room}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit2_version}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2_version}"

    const val hilt_android = "com.google.dagger:hilt-android:${Versions.hilt_gradle}"
    const val hilt_lifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt_viewmodels}"

    const val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.livedata_ktx}"

    const val okhttp3_platform = "com.squareup.okhttp3:okhttp-bom:${Versions.okhttp}"
    const val okhttp3_okhttp = "com.squareup.okhttp3:okhttp"
    const val okhttp3_interceptor = "com.squareup.okhttp3:logging-interceptor"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    const val datastore = "androidx.datastore:datastore-preferences:${Versions.datastore}"


}