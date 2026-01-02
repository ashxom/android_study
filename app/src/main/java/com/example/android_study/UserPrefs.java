package com.example.android_study;

import android.content.Context;
import android.content.SharedPreferences;

public class UserPrefs {

    private static final String PREF_NAME = "user_pref";
    private static final String KEY_NAME = "user_name";
    private static final String KEY_AGE = "user_age";

    public static void saveUser(Context context, String name, int age) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        prefs.edit()
                .putString(KEY_NAME, name)
                .putInt(KEY_AGE, age)
                .apply();
    }

    public static String getName(Context context) {
        return context
                .getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .getString(KEY_NAME, null);
    }

    public static int getAge(Context context) {
        return context
                .getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .getInt(KEY_AGE, -1);
    }

    public static boolean hasUser(Context context) {
        return context
                .getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .contains(KEY_NAME);
    }

}
