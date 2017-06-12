package location_app.hadia.com.locationapp.place_details;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import location_app.hadia.com.locationapp.common.DownloadUrl;
import location_app.hadia.com.locationapp.common.Interactor;
import location_app.hadia.com.locationapp.get_places_details_response.GetplaceDetailsResponse;


public class GetPlaceDetailsData extends Interactor<GetplaceDetailsResponse> {


    String googlePlacesData;
    // GoogleMap mMap;
    String url;

    String placeID;
    private int PROXIMITY_RADIUS = 10000;


    public GetPlaceDetailsData(String placeID) {



        this. placeID= placeID;

    }

    @Override
    protected GetplaceDetailsResponse onTaskWork() {
        try {

            //mMap = (GoogleMap) params[0];
            url =getUrl(placeID);
            DownloadUrl downloadUrl = new DownloadUrl();
            googlePlacesData=   downloadUrl.readUrl(url);
            Log.d("GooglePlacesReadTask", "doInBackground Exit");
        } catch (Exception e) {
            Log.d("GooglePlacesReadTask", e.toString());
        }
        ObjectMapper objectMapper = new ObjectMapper();
        GetplaceDetailsResponse response=null;
        try {
            response  = objectMapper.readValue(googlePlacesData, GetplaceDetailsResponse.class);
            if(response!=null)
            {
                return response;
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("JSon error", "onPostExecute Exit");
        }

      return null;

    }




    private String getUrl(String placeID) {
        StringBuilder sb = new StringBuilder("https://maps.googleapis.com/maps/api/place/details/json?");
        sb.append("placeid="+placeID);
        sb.append("&key=AIzaSyATuUiZUkEc_UgHuqsBJa1oqaODI-3mLs0");

        return (sb.toString());
    }

}
