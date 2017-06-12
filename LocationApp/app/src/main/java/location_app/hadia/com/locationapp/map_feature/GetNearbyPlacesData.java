package location_app.hadia.com.locationapp.map_feature;

import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.R;
import location_app.hadia.com.locationapp.common.DownloadUrl;
import location_app.hadia.com.locationapp.common.Interactor;
import location_app.hadia.com.locationapp.common.InteractorListener;
import location_app.hadia.com.locationapp.common.InteractorSuccessListener;
import location_app.hadia.com.locationapp.get_googe_places.google_places_response.GooglePlacesResponse;
import location_app.hadia.com.locationapp.model.AppCache.AppCache;
import location_app.hadia.com.locationapp.model.dependencies.AppInjector;


public class GetNearbyPlacesData extends Interactor {

    @Inject
    AppCache cache;
    String googlePlacesData;
   // GoogleMap mMap;
    String url;

    private double lng;

    private double lat;
    private int PROXIMITY_RADIUS = 10000;


    public GetNearbyPlacesData(double lat,double lng) {


        cache = AppInjector.getAppComponent().getAppCache();
        this.lat=lat;
        this.lng=lng;
    }

    @Override
    protected Object onTaskWork() {
        try {
            Log.d("GetNearbyPlacesData", "doInBackground entered");
            //mMap = (GoogleMap) params[0];
            url =getUrl(lat,lng);
            DownloadUrl downloadUrl = new DownloadUrl();
            googlePlacesData = downloadUrl.readUrl(url);
            Log.d("GooglePlacesReadTask", "doInBackground Exit");
        } catch (Exception e) {
            Log.d("GooglePlacesReadTask", e.toString());
        }
        return googlePlacesData;

    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        ObjectMapper objectMapper = new ObjectMapper();
        GooglePlacesResponse response=null;
        try {
            response  = objectMapper.readValue((String)result, GooglePlacesResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("JSon error", "onPostExecute Exit");
        }
        if(response!=null)
        {

            cache.setGooglePlaces(response.getResults());
            success(null);
        }
    }


    private String getUrl(double latitude, double longitude) {
        String Restaurant = "restaurant";
        StringBuilder googlePlacesUrl = new StringBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
        googlePlacesUrl.append("location=" + latitude + "," + longitude);
        googlePlacesUrl.append("&radius=" + PROXIMITY_RADIUS);
        googlePlacesUrl.append("&type=" + Restaurant);
        googlePlacesUrl.append("&sensor=true");
        googlePlacesUrl.append("&key=" + "AIzaSyATuUiZUkEc_UgHuqsBJa1oqaODI-3mLs0");
        Log.d("getUrl", googlePlacesUrl.toString());
        return (googlePlacesUrl.toString());
    }

}
