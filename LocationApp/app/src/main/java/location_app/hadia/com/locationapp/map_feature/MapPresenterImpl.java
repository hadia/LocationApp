package location_app.hadia.com.locationapp.map_feature;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.common.Interactor;
import location_app.hadia.com.locationapp.common.InteractorListener;
import location_app.hadia.com.locationapp.common.InteractorSuccessListener;
import location_app.hadia.com.locationapp.model.AppCache.AppCache;
import location_app.hadia.com.locationapp.model.dependencies.AppInjector;
import nucleus.presenter.Presenter;


/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/11/17.
 */

public class MapPresenterImpl extends Presenter<MapsActivity> implements MapPresenter {
    @Inject
    AppCache cache;

    public MapPresenterImpl() {
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
    public void requetGoogleRestaurant(double latitude, double longitude) {
        // String url = getUrl(latitude, longitude, Restaurant);

        //  Log.d("onClick", url);
   new GetNearbyPlacesData( latitude, longitude).setSuccessListener(new InteractorSuccessListener() {
       @Override
       public void onSuccess(Interactor interactor, Object result) {
           if (getView() != null) {
               getView().bindLocations(cache.getGooglePlaces());
           }
       }
   }).execute();

        if (getView() != null)
            Toast.makeText(getView(), "Nearby Restaurants", Toast.LENGTH_LONG).show();
    }


}
