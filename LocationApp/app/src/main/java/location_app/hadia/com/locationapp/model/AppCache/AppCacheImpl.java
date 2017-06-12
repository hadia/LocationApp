package location_app.hadia.com.locationapp.model.AppCache;

import android.util.Log;

import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.get_googe_places.google_places_response.ResultsItem;
import location_app.hadia.com.locationapp.model.GooglePlace;


public class AppCacheImpl implements AppCache {

    private ArrayList<GooglePlace> locations;


    @Inject
    public AppCacheImpl() {
        locations = new ArrayList<>() ;


    }

    @Override
    public void setGooglePlaces(List<ResultsItem> nearbyPlacesList) {
        for (int i = 0; i < nearbyPlacesList.size(); i++) {
            GooglePlace googlePlaceLocation= new GooglePlace();
            Log.d("FillModel","Entered into showing locations");
            MarkerOptions markerOptions = new MarkerOptions();
            ResultsItem googlePlace = nearbyPlacesList.get(i);

            googlePlaceLocation.setLatitude(googlePlace.getGeometry().getLocation().getLat());
            googlePlaceLocation.setLongitude( googlePlace.getGeometry().getLocation().getLng());
            googlePlaceLocation.setName(googlePlace.getName());
            googlePlaceLocation.setIconURL(googlePlace.getIcon());
            googlePlaceLocation.setVicinity( googlePlace.getVicinity());
            googlePlaceLocation.setId(googlePlace.getPlaceId());
            locations.add(googlePlaceLocation);
        }
    }



    @Override
    public     List<GooglePlace> getGooglePlaces() {
        return locations;
    }


}
