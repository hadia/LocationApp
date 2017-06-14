package location_app.hadia.com.locationapp.model;

import android.content.Context;

import javax.inject.Inject;

import location_app.hadia.com.locationapp.model.dependencies.AppInjector;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/14/17.
 */

public class FourSquarePlace extends PlaceModel {

    private int index;
    private String phone;
    private String catogery;
    private String subCatogery;

    @Inject
    Context context;

    public FourSquarePlace() {

        context = AppInjector.getAppComponent().getContext();
    }


    /**
     * @return Gets the value of id and returns id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the id
     * You can use getId() to get the value of id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Gets the value of latitude and returns latitude
     */
    public double getLatitude() {
        return this.latitude;
    }

    /**
     * Sets the latitude
     * You can use getLatitude() to get the value of latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return Gets the value of longitude and returns longitude
     */
    public double getLongitude() {
        return this.longitude;
    }

    /**
     * Sets the longitude
     * You can use getLongitude() to get the value of longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return Gets the value of name and returns name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name
     * You can use getName() to get the value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Gets the value of vicinity and returns vicinity
     */
    public String getVicinity() {
        return this.vicinity;
    }

    /**
     * Sets the vicinity
     * You can use getVicinity() to get the value of vicinity
     */
    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    /**
     * @return Gets the value of iconURL and returns iconURL
     */
    public String getIconURL() {
        return this.iconURL;
    }

    /**
     * Sets the iconURL
     * You can use getIconURL() to get the value of iconURL
     */
    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    /**
     * @return Gets the value of index and returns index
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Sets the index
     * You can use getIndex() to get the value of index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return Gets the value of phone and returns phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Sets the phone
     * You can use getPhone() to get the value of phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return Gets the value of catogery and returns catogery
     */
    public String getCatogery() {
        return this.catogery;
    }

    /**
     * Sets the catogery
     * You can use getCatogery() to get the value of catogery
     */
    public void setCatogery(String catogery) {
        this.catogery = catogery;
    }

    /**
     * @return Gets the value of subCatogery and returns subCatogery
     */
    public String getSubCatogery() {
        return this.subCatogery;
    }

    /**
     * Sets the subCatogery
     * You can use getSubCatogery() to get the value of subCatogery
     */
    public void setSubCatogery(String subCatogery) {
        this.subCatogery = subCatogery;
    }
}


