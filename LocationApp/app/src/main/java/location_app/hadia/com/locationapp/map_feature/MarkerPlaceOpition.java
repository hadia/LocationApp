package location_app.hadia.com.locationapp.map_feature;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/14/17.
 */

public class MarkerPlaceOpition {
   private String markerId;
   private boolean isGooglePlace;

    public MarkerPlaceOpition(String markerId, boolean isGooglePlace) {
        this.markerId = markerId;
        this.isGooglePlace = isGooglePlace;
    }

    /**
     * @return Gets the value of markerId and returns markerId
     */
    public String getMarkerId() {
        return this.markerId;
    }

    /**
     * Sets the markerId
     * You can use getMarkerId() to get the value of markerId
     */
    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    /**
     * @return Gets the value of isGooglePlace and returns isGooglePlace
     */
    public boolean isGooglePlace() {
        return this.isGooglePlace;
    }

    /**
     * Sets the isGooglePlace
     * You can use getGooglePlace() to get the value of isGooglePlace
     */
    public void setGooglePlace(boolean googlePlace) {
        this.isGooglePlace = googlePlace;
    }
}
