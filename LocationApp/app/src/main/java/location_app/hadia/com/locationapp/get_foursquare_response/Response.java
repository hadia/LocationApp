package location_app.hadia.com.locationapp.get_foursquare_response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.MfpModel;

@Generated("com.robohorse.robopojogenerator")
public class Response  extends MfpModel {

	@JsonProperty("confident")
	private boolean confident;

	@JsonProperty("venues")
	private List<VenuesItem> venues;

	public void setConfident(boolean confident){
		this.confident = confident;
	}

	public boolean isConfident(){
		return confident;
	}

	public void setVenues(List<VenuesItem> venues){
		this.venues = venues;
	}

	public List<VenuesItem> getVenues(){
		return venues;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"confident = '" + confident + '\'' + 
			",venues = '" + venues + '\'' + 
			"}";
		}
}