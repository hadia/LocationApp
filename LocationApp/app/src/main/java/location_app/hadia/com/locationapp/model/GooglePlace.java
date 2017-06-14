package location_app.hadia.com.locationapp.model;

import android.content.Context;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.model.dependencies.AppInjector;

public class GooglePlace extends PlaceModel{


    @Inject
    Context context;

    public GooglePlace() {

        context = AppInjector.getAppComponent().getContext();
    }


}
