package com.example.onesignal;

import com.onesignal.OneSignal;
import android.app.Application;

public class ApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this);
        OneSignal.setAppId("6dc641c3-6ebc-4d9d-b38a-80482db056ea");
    }
}
