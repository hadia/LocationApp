package location_app.hadia.com.locationapp.list_feature;

import android.os.Bundle;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.model.AppCache.AppCache;
import location_app.hadia.com.locationapp.model.dependencies.AppInjector;
import nucleus.presenter.Presenter;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/12/17.
 */

public class LocationListPresenter extends Presenter<LocationListActivity> {
    @Inject
    AppCache cache;

    public LocationListPresenter() {
        cache = AppInjector.getAppComponent().getAppCache();
    }
    @Override
    public void create(Bundle bundle) {
        super.create(bundle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onTakeView(LocationListActivity locationListActivity) {
        super.onTakeView(locationListActivity);
        if(getView()!=null)
            getView().bindLocations(cache.getGooglePlaces());
    }
}
