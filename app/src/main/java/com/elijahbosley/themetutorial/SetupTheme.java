package com.elijahbosley.themetutorial;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SetupTheme {
    public static void setupWindowTheme(Activity activity) {
        SharedPreferences pref = PreferenceManager
                .getDefaultSharedPreferences(activity);
        String themeName = pref.getString("themeSelection", "Theme");

        switch (themeName) {
            case "LightTheme":
                activity.setTheme(R.style.LightTheme);
                break;
            case "DarkTheme":
                activity.setTheme(R.style.DarkTheme);
                break;
        }
    }
}
