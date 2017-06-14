package location_app.hadia.com.locationapp.model.AppCache;


import java.util.List;

import location_app.hadia.com.locationapp.get_foursquare_response.Response;
import location_app.hadia.com.locationapp.get_foursquare_response.VenuesItem;
import location_app.hadia.com.locationapp.get_googe_places.google_places_response.ResultsItem;
import location_app.hadia.com.locationapp.model.FourSquarePlace;
import location_app.hadia.com.locationapp.model.GooglePlace;

public interface AppCache {


    void setGooglePlaces(List<ResultsItem> googlePlaces);

    List<GooglePlace> getGooglePlaces();

    void setSquarePlaces(List<VenuesItem> googlePlaces);

    List<FourSquarePlace> getSquarePlaces();

}
