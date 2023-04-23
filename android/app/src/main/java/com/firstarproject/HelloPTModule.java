package com.firstarproject;

import android.content.Context;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.jetbrains.annotations.NotNull;

public class HelloPTModule extends ReactContextBaseJavaModule {
    public HelloPTModule (@Nullable ReactApplicationContext reactContext){
        super(reactContext);
    }
    @Override
    public String getName() {
        return "HelloPT";
    }

    @ReactMethod
    public void sayHello (String name, int duration) {
        try {
            String hello = "Hello " + name;
//            Context context = getApplicationContext();
//            CharSequence text = "Hello toast!";
//            int duration = Toast.LENGTH_SHORT;
//
//            Toast toast = Toast.makeText(this.getApplicationContext(), text, duration);
//            toast.show();
            
//            cb.invoke(null, hello);
            // String mId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
            Toast.makeText(getReactApplicationContext(), name, duration).show();

        } catch (Exception err) {
            //cb.invoke(err, null);
        }
    }
}   