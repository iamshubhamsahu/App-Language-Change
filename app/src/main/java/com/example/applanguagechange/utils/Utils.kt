package com.example.applanguagechange.utils

import android.app.Activity
import android.content.res.Configuration
import java.util.Locale


fun changeLanguage(activity: Activity, languageCode: String?) {
    val locale = Locale(languageCode)
    Locale.setDefault(locale)
    val resources = activity.resources
    val config: Configuration = resources.configuration
    config.setLocale(locale)
    resources.updateConfiguration(config, resources.displayMetrics)
}