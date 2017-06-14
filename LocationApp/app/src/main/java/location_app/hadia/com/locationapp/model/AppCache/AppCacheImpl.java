package location_app.hadia.com.locationapp.model.AppCache;

import android.util.Log;

import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.get_foursquare_response.VenuesItem;
import location_app.hadia.com.locationapp.get_googe_places.google_places_response.ResultsItem;
import location_app.hadia.com.locationapp.model.FourSquarePlace;
import location_app.hadia.com.locationapp.model.GooglePlace;


public class AppCacheImpl implements AppCache {

    private ArrayList<GooglePlace> locations;
    private ArrayList<FourSquarePlace> fourSquarePlaces ;


    @Inject
    public AppCacheImpl() {
        locations = new ArrayList<>() ;
        fourSquarePlaces= new ArrayList<>();


    }

    @Override
    public void setGooglePlaces(List<ResultsItem> nearbyPlacesList) {
        for (int i = 0; i < nearbyPlacesList.size(); i++) {
            GooglePlace googlePlaceLocation= new GooglePlace();
            Log.d("FillModel","Entered into showing locations");

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

    @Override
    public void setSquarePlaces(List<VenuesItem> fourSquareVenues) {
        for (int i = 0; i < fourSquareVenues.size(); i++) {
            FourSquarePlace fourSquarePlace= new FourSquarePlace();
            Log.d("FillModel","Entered into showing locations");

            VenuesItem venuesItem = fourSquareVenues.get(i);

            fourSquarePlace.setLatitude(venuesItem.getLocation().getLat());
            fourSquarePlace.setLongitude( venuesItem.getLocation().getLng());
            fourSquarePlace.setName(venuesItem.getName());
            fourSquarePlace.setIconURL(venuesItem.getCategories().get(0).getIcon().getPrefix()+"64"+venuesItem.getCategories().get(0).getIcon().getSuffix());
            fourSquarePlace.setVicinity( venuesItem.getLocation().getAddress());
            fourSquarePlace.setId(venuesItem.getId());
            fourSquarePlace.setIndex(i);
            fourSquarePlace.setCatogery("Food");
            fourSquarePlace.setPhone(venuesItem.getContact().getPhone());
            fourSquarePlace.setSubCatogery( venuesItem.getCategories().get(0).getName());
            fourSquarePlaces.add(fourSquarePlace);
        }
    }

    @Override
    public List<FourSquarePlace> getSquarePlaces() {
        return fourSquarePlaces;
    }
}
