package location_app.hadia.com.locationapp.model.AppCache;

import android.content.Context;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.model.Manager;


public class AppManagerImpl extends Manager {

    private Context context;
    private AppCache appCache;

    @Inject
    public AppManagerImpl(AppCache appCache, Context context) {

        this.appCache = appCache;
        this.context = context;
    }


}
