package location_app.hadia.com.locationapp.model.dependencies;

import android.util.Log;



public class AppInjector {

    private static ApplicationComponent mAppComponent;

    public static ApplicationComponent getAppComponent() {
        Log.d("Injection", "get: " + mAppComponent);
        return mAppComponent;
    }

    public static void setComponent(ApplicationComponent appComponent) {
        Log.d("Injection", "create: " + appComponent);
        mAppComponent = appComponent;
    }
}
