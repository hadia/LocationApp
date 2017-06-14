package location_app.hadia.com.locationapp.get_foursquare_response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class VenuesItem extends responseModel {

	@JsonProperty("menu")
	private Menu menu;
	@JsonProperty("hasPerk")
	private boolean hasPerk;

	@JsonProperty("specials")
	private Specials specials;

	@JsonProperty("referralId")
	private String referralId;

	@JsonProperty("venueChains")
	private List<Object> venueChains;

	@JsonProperty("verified")
	private boolean verified;

	@JsonProperty("url")
	private String url;

	@JsonProperty("beenHere")
	private BeenHere beenHere;

	@JsonProperty("hereNow")
	private HereNow hereNow;

	@JsonProperty("stats")
	private Stats stats;

	@JsonProperty("contact")
	private Contact contact;

	@JsonProperty("name")
	private String name;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("id")
	private String id;


	@JsonProperty("storeId")
	private String storeId;

	@JsonProperty("categories")
	private List<CategoriesItem> categories;

	@JsonProperty("allowMenuUrlEdit")
	private boolean allowMenuUrlEdit;

	public void setHasPerk(boolean hasPerk){
		this.hasPerk = hasPerk;
	}

	public boolean isHasPerk(){
		return hasPerk;
	}

	public void setSpecials(Specials specials){
		this.specials = specials;
	}

	public Specials getSpecials(){
		return specials;
	}

	public void setReferralId(String referralId){
		this.referralId = referralId;
	}

	public String getReferralId(){
		return referralId;
	}

	public void setVenueChains(List<Object> venueChains){
		this.venueChains = venueChains;
	}

	public List<Object> getVenueChains(){
		return venueChains;
	}

	public void setVerified(boolean verified){
		this.verified = verified;
	}

	public boolean isVerified(){
		return verified;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setBeenHere(BeenHere beenHere){
		this.beenHere = beenHere;
	}

	public BeenHere getBeenHere(){
		return beenHere;
	}

	public void setHereNow(HereNow hereNow){
		this.hereNow = hereNow;
	}

	public HereNow getHereNow(){
		return hereNow;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setContact(Contact contact){
		this.contact = contact;
	}

	public Contact getContact(){
		return contact;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCategories(List<CategoriesItem> categories){
		this.categories = categories;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}

	public void setAllowMenuUrlEdit(boolean allowMenuUrlEdit){
		this.allowMenuUrlEdit = allowMenuUrlEdit;
	}

	public boolean isAllowMenuUrlEdit(){
		return allowMenuUrlEdit;
	}

	@Override
 	public String toString(){
		return
			"VenuesItem{" +
			"hasPerk = '" + hasPerk + '\'' +
			",specials = '" + specials + '\'' +
			",referralId = '" + referralId + '\'' +
			",venueChains = '" + venueChains + '\'' +
			",verified = '" + verified + '\'' +
			",url = '" + url + '\'' +
			",beenHere = '" + beenHere + '\'' +
			",hereNow = '" + hereNow + '\'' +
			",stats = '" + stats + '\'' +
			",contact = '" + contact + '\'' +
			",name = '" + name + '\'' +
			",location = '" + location + '\'' +
			",id = '" + id + '\'' +
			",categories = '" + categories + '\'' +
			",allowMenuUrlEdit = '" + allowMenuUrlEdit + '\'' +
			"}";
		}

	/**
	 * @return Gets the value of storeId and returns storeId
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * Sets the storeId
	 * You can use getStoreId() to get the value of storeId
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * @return Gets the value of menu and returns menu
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * Sets the menu
	 * You can use getMenu() to get the value of menu
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}