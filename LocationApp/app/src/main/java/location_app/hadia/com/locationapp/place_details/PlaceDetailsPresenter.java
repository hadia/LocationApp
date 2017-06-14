package location_app.hadia.com.locationapp.place_details;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/12/17.
 */

public interface PlaceDetailsPresenter {
    public void requetGoogleRestaurant(String placeID);
    public void requetFoursquare(String placeID);
    public void openMap(boolean isGoogle);
}
