package com.shovo.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefConfig {

    private SharedPreferences sharedPreferences;
    private Context context;

    public PrefConfig(Context context) {
        this.context = context;
        sharedPreferences=context.getSharedPreferences(context.getString(R.string.pref_config),context.MODE_PRIVATE);

    }

    public void  writeloginestatus(boolean status){

        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(context.getString(R.string.logine_status),status);
        editor.apply();
    }
     public boolean redLoginStatus(){

        return sharedPreferences.getBoolean(context.getString(R.string.logine_status),false);
     }

}

