package location_app.hadia.com.locationapp.model.AppCache;


import java.util.List;

import location_app.hadia.com.locationapp.get_googe_places.google_places_response.ResultsItem;
import location_app.hadia.com.locationapp.model.GooglePlace;

public interface AppCache {


    void setGooglePlaces(List<ResultsItem> googlePlaces);

    List<GooglePlace> getGooglePlaces();

}
