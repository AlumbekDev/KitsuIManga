package com.example.data.local.preferences

import android.content.Context
import android.content.SharedPreferences
import com.example.data.local.preferences.PreferencesKeys.ACCESS_TOKEN_KEY
import com.example.data.local.preferences.PreferencesKeys.IS_AUTHENTICATED
import com.example.data.local.preferences.PreferencesKeys.REFRESH_TOKEN_KEY

class PreferencesHelper(context: Context) {

    private val preferences: SharedPreferences =
        context.getSharedPreferences("prefs", Context.MODE_PRIVATE)


    var isAuthenticated
        get() = preferences.getBoolean(IS_AUTHENTICATED, false)
        set(value) = preferences.edit().putBoolean(IS_AUTHENTICATED, value).apply()
    var accessToken
        get() = preferences.getString(ACCESS_TOKEN_KEY, "")
        set(value) = preferences.edit().putString(ACCESS_TOKEN_KEY, value).apply()
    var refreshToken
        get() = preferences.getString(REFRESH_TOKEN_KEY, "")
        set(value) = preferences.edit().putString(REFRESH_TOKEN_KEY, value).apply()
}