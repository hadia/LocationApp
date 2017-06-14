package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.MfpModel;

@Generated("com.robohorse.robopojogenerator")
public class Contact extends MfpModel {

	@JsonProperty("twitter")
	private String twitter;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("facebookUsername")
	private String facebookUsername;

	@JsonProperty("facebook")
	private String facebook;

	@JsonProperty("formattedPhone")
	private String formattedPhone;

	@JsonProperty("facebookName")
	private String facebookName;

	public void setTwitter(String twitter){
		this.twitter = twitter;
	}

	public String getTwitter(){
		return twitter;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setFacebookUsername(String facebookUsername){
		this.facebookUsername = facebookUsername;
	}

	public String getFacebookUsername(){
		return facebookUsername;
	}

	public void setFacebook(String facebook){
		this.facebook = facebook;
	}

	public String getFacebook(){
		return facebook;
	}

	public void setFormattedPhone(String formattedPhone){
		this.formattedPhone = formattedPhone;
	}

	public String getFormattedPhone(){
		return formattedPhone;
	}

	public void setFacebookName(String facebookName){
		this.facebookName = facebookName;
	}

	public String getFacebookName(){
		return facebookName;
	}

	@Override
 	public String toString(){
		return 
			"Contact{" + 
			"twitter = '" + twitter + '\'' + 
			",phone = '" + phone + '\'' + 
			",facebookUsername = '" + facebookUsername + '\'' + 
			",facebook = '" + facebook + '\'' + 
			",formattedPhone = '" + formattedPhone + '\'' + 
			",facebookName = '" + facebookName + '\'' + 
			"}";
		}
}