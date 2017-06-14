package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class Icon extends responseModel {

	@JsonProperty("prefix")
	private String prefix;

	@JsonProperty("suffix")
	private String suffix;

	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	public String getPrefix(){
		return prefix;
	}

	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	public String getSuffix(){
		return suffix;
	}

	@Override
 	public String toString(){
		return 
			"Icon{" + 
			"prefix = '" + prefix + '\'' + 
			",suffix = '" + suffix + '\'' + 
			"}";
		}
}