package location_app.hadia.com.locationapp.get_places_details_response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Result{

	@JsonProperty("utc_offset")
	private int utcOffset;

	@JsonProperty("formatted_address")
	private String formattedAddress;

	@JsonProperty("types")
	private List<String> types;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("rating")
	private int rating;

	@JsonProperty("address_components")
	private List<AddressComponentsItem> addressComponents;

	@JsonProperty("photos")
	private List<PhotosItem> photos;

	@JsonProperty("url")
	private String url;

	@JsonProperty("reference")
	private String reference;

	@JsonProperty("reviews")
	private List<ReviewsItem> reviews;

	@JsonProperty("scope")
	private String scope;

	@JsonProperty("name")
	private String name;

	@JsonProperty("opening_hours")
	private OpeningHours openingHours;

	@JsonProperty("geometry")
	private Geometry geometry;

	@JsonProperty("vicinity")
	private String vicinity;

	@JsonProperty("id")
	private String id;

	@JsonProperty("adr_address")
	private String adrAddress;

	@JsonProperty("formatted_phone_number")
	private String formattedPhoneNumber;

	@JsonProperty("international_phone_number")
	private String internationalPhoneNumber;

	@JsonProperty("place_id")
	private String placeId;
	@JsonProperty("website")
	private String website;

	public void setUtcOffset(int utcOffset){
		this.utcOffset = utcOffset;
	}

	public int getUtcOffset(){
		return utcOffset;
	}

	public void setFormattedAddress(String formattedAddress){
		this.formattedAddress = formattedAddress;
	}

	public String getFormattedAddress(){
		return formattedAddress;
	}

	public void setTypes(List<String> types){
		this.types = types;
	}

	public List<String> getTypes(){
		return types;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setAddressComponents(List<AddressComponentsItem> addressComponents){
		this.addressComponents = addressComponents;
	}

	public List<AddressComponentsItem> getAddressComponents(){
		return addressComponents;
	}

	public void setPhotos(List<PhotosItem> photos){
		this.photos = photos;
	}

	public List<PhotosItem> getPhotos(){
		return photos;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setReference(String reference){
		this.reference = reference;
	}

	public String getReference(){
		return reference;
	}

	public void setReviews(List<ReviewsItem> reviews){
		this.reviews = reviews;
	}

	public List<ReviewsItem> getReviews(){
		return reviews;
	}

	public void setScope(String scope){
		this.scope = scope;
	}

	public String getScope(){
		return scope;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOpeningHours(OpeningHours openingHours){
		this.openingHours = openingHours;
	}

	public OpeningHours getOpeningHours(){
		return openingHours;
	}

	public void setGeometry(Geometry geometry){
		this.geometry = geometry;
	}

	public Geometry getGeometry(){
		return geometry;
	}

	public void setVicinity(String vicinity){
		this.vicinity = vicinity;
	}

	public String getVicinity(){
		return vicinity;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setAdrAddress(String adrAddress){
		this.adrAddress = adrAddress;
	}

	public String getAdrAddress(){
		return adrAddress;
	}

	public void setFormattedPhoneNumber(String formattedPhoneNumber){
		this.formattedPhoneNumber = formattedPhoneNumber;
	}

	public String getFormattedPhoneNumber(){
		return formattedPhoneNumber;
	}

	public void setInternationalPhoneNumber(String internationalPhoneNumber){
		this.internationalPhoneNumber = internationalPhoneNumber;
	}

	public String getInternationalPhoneNumber(){
		return internationalPhoneNumber;
	}

	public void setPlaceId(String placeId){
		this.placeId = placeId;
	}

	public String getPlaceId(){
		return placeId;
	}

	@Override
 	public String toString(){
		return 
			"Result{" + 
			"utc_offset = '" + utcOffset + '\'' + 
			",formatted_address = '" + formattedAddress + '\'' + 
			",types = '" + types + '\'' + 
			",icon = '" + icon + '\'' + 
			",rating = '" + rating + '\'' + 
			",address_components = '" + addressComponents + '\'' + 
			",photos = '" + photos + '\'' + 
			",url = '" + url + '\'' + 
			",reference = '" + reference + '\'' + 
			",reviews = '" + reviews + '\'' + 
			",scope = '" + scope + '\'' + 
			",name = '" + name + '\'' + 
			",opening_hours = '" + openingHours + '\'' + 
			",geometry = '" + geometry + '\'' + 
			",vicinity = '" + vicinity + '\'' + 
			",id = '" + id + '\'' + 
			",adr_address = '" + adrAddress + '\'' + 
			",formatted_phone_number = '" + formattedPhoneNumber + '\'' + 
			",international_phone_number = '" + internationalPhoneNumber + '\'' + 
			",place_id = '" + placeId + '\'' + 
			"}";
		}

	/**
	 * @return Gets the value of website and returns website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Sets the website
	 * You can use getWebsite() to get the value of website
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
}