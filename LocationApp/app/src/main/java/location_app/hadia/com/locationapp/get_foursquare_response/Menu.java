package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class Menu extends responseModel {

	@JsonProperty("externalUrl")
	private String externalUrl;

	@JsonProperty("anchor")
	private String anchor;

	@JsonProperty("label")
	private String label;

	@JsonProperty("mobileUrl")
	private String mobileUrl;

	@JsonProperty("type")
	private String type;

	@JsonProperty("url")
	private String url;

	public void setExternalUrl(String externalUrl){
		this.externalUrl = externalUrl;
	}

	public String getExternalUrl(){
		return externalUrl;
	}

	public void setAnchor(String anchor){
		this.anchor = anchor;
	}

	public String getAnchor(){
		return anchor;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setMobileUrl(String mobileUrl){
		this.mobileUrl = mobileUrl;
	}

	public String getMobileUrl(){
		return mobileUrl;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Menu{" + 
			"externalUrl = '" + externalUrl + '\'' + 
			",anchor = '" + anchor + '\'' + 
			",label = '" + label + '\'' + 
			",mobileUrl = '" + mobileUrl + '\'' + 
			",type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}