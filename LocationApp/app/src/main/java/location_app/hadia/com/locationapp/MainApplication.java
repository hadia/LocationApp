/*
 * This source code is part of the research paper
 * "Applying Model-View-Presenter Architecture to the Android Framework with App Prototype"
 *
 * Software Architecture and Management,
 * Herman-Hollerith-Zentrum, Reutlingen University
 *
 * Authors:  Dennis G. Geisse,
 *           Iven John,
 *           Daniel Joos,
 *           Sebastian Kotstein,
 *           Michael Wurster
 *
 * Year:     2015
 */

package location_app.hadia.com.locationapp;

import android.app.Application;

import location_app.hadia.com.locationapp.model.dependencies.AppInjector;
import location_app.hadia.com.locationapp.model.dependencies.ApplicationComponent;
import location_app.hadia.com.locationapp.model.dependencies.ApplicationModule;
import location_app.hadia.com.locationapp.model.dependencies.DaggerApplicationComponent;

public class MainApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationComponent appComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        AppInjector.setComponent(appComponent);
    }





}
