package com.example.android.firebaseui_login_sample

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class MainFragmentDirections {
    companion object {
        fun actionMainFragmentToSettingsFragment(): NavDirections =
            ActionOnlyNavDirections(R.id.action_mainFragment_to_settingsFragment)
    }
}
