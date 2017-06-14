package location_app.hadia.com.locationapp.get_foursquare_response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class Location extends responseModel {

	@JsonProperty("cc")
	private String cc;

	@JsonProperty("country")
	private String country;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("address")
	private String address;

	@JsonProperty("labeledLatLngs")
	private List<LabeledLatLngsItem> labeledLatLngs;

	@JsonProperty("lng")
	private double lng;

	@JsonProperty("distance")
	private int distance;

	@JsonProperty("formattedAddress")
	private List<String> formattedAddress;

	@JsonProperty("city")
	private String city;

	@JsonProperty("neighborhood")
	private String neighborhood;

	@JsonProperty("state")
	private String state;

	@JsonProperty("lat")
	private double lat;
	@JsonProperty("crossStreet")
	private String crossStreet;

	public void setCc(String cc){
		this.cc = cc;
	}

	public String getCc(){
		return cc;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setLabeledLatLngs(List<LabeledLatLngsItem> labeledLatLngs){
		this.labeledLatLngs = labeledLatLngs;
	}

	public List<LabeledLatLngsItem> getLabeledLatLngs(){
		return labeledLatLngs;
	}

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

	public void setFormattedAddress(List<String> formattedAddress){
		this.formattedAddress = formattedAddress;
	}

	public List<String> getFormattedAddress(){
		return formattedAddress;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setNeighborhood(String neighborhood){
		this.neighborhood = neighborhood;
	}

	public String getNeighborhood(){
		return neighborhood;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"cc = '" + cc + '\'' + 
			",country = '" + country + '\'' + 
			",address = '" + address + '\'' + 
			",labeledLatLngs = '" + labeledLatLngs + '\'' + 
			",lng = '" + lng + '\'' + 
			",distance = '" + distance + '\'' + 
			",formattedAddress = '" + formattedAddress + '\'' + 
			",city = '" + city + '\'' + 
			",neighborhood = '" + neighborhood + '\'' + 
			",state = '" + state + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}

	/**
	 * @return Gets the value of crossStreet and returns crossStreet
	 */
	public String getCrossStreet() {
		return crossStreet;
	}

	/**
	 * Sets the crossStreet
	 * You can use getCrossStreet() to get the value of crossStreet
	 */
	public void setCrossStreet(String crossStreet) {
		this.crossStreet = crossStreet;
	}

	/**
	 * @return Gets the value of postalCode and returns postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets the postalCode
	 * You can use getPostalCode() to get the value of postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}