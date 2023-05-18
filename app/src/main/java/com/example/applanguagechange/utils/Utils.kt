package com.example.applanguagechange.utils

import android.app.Activity
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.content.res.Configuration
import java.util.Locale


fun changeLanguage(activity: Activity, languageCode: String?) {
    val locale = Locale(languageCode)
    Locale.setDefault(locale)
    val resources = activity.resources
    val config: Configuration = resources.configuration
    config.setLocale(locale)
    resources.updateConfiguration(config, resources.displayMetrics)
   //get Sharedpreference
    val editor: SharedPreferences.Editor = activity.getSharedPreferences("settings", MODE_PRIVATE).edit()
    editor.putString("My_Language", languageCode)
    editor.commit()
}
