package location_app.hadia.com.locationapp.map_feature;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URLEncoder;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.common.DownloadUrl;
import location_app.hadia.com.locationapp.common.Interactor;
import location_app.hadia.com.locationapp.get_foursquare_response.GetFourSquareResponse;
import location_app.hadia.com.locationapp.model.AppCache.AppCache;
import location_app.hadia.com.locationapp.model.dependencies.AppInjector;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/14/17.
 */

public class GetFourSquarePlaceData  extends Interactor {

    @Inject
    AppCache cache;
    String fourPlacesData;
    // GoogleMap mMap;
    String url;

    private double lng;

    private double lat;
    private int PROXIMITY_RADIUS = 10000;


    public GetFourSquarePlaceData(double lat,double lng) {


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
            fourPlacesData = downloadUrl.readUrl(url);
            Log.d("GooglePlacesReadTask", "doInBackground Exit");
        } catch (Exception e) {
            Log.d("GooglePlacesReadTask", e.toString());
        }
        return fourPlacesData;

    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        ObjectMapper objectMapper = new ObjectMapper();
        GetFourSquareResponse response=null;
        try {
            response  = objectMapper.readValue((String)result, GetFourSquareResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("JSon error", "onPostExecute Exit");
        }
        if(response!=null)
        {

            cache.setSquarePlaces(response.getResponse().getVenues());
            success(null);
        }
    }


    private String getUrl(double latitude, double longitude) {
       // foursquareRequestUrl = "https://api.foursquare.com/v2/venues/explore?client_id=YFRT0F0EKMLCUYYQO04YWQMUN15MXZH2KEXU5ZGN2D1QV0CF&client_secret=I2NQKHQPPL3DCCBTWU4PP4ZF2WJMGYZEOXIVXSHF0K330RJA&v=20130815%20&near=" + URLEncoder.encode(area, "UTF-8");

        StringBuilder foursquarePlacesUrl = new StringBuilder("https://api.foursquare.com/v2/venues/search?");
        foursquarePlacesUrl.append("ll=" + latitude + "," + longitude);
        foursquarePlacesUrl.append("&categoryId=4d4b7105d754a06374d81259");
        foursquarePlacesUrl.append("&oauth_token=" + "OY5TFSA5H4G4TTMS0UOYUTQWS22F13E5LTP35JV5DSULQJSD");
        foursquarePlacesUrl.append("&client_id=YFRT0F0EKMLCUYYQO04YWQMUN15MXZH2KEXU5ZGN2D1QV0CF&client_secret=I2NQKHQPPL3DCCBTWU4PP4ZF2WJMGYZEOXIVXSHF0K330RJA&v=20130815%20");
        Log.d("getUrl", foursquarePlacesUrl.toString());
        return (foursquarePlacesUrl.toString());
    }

}
