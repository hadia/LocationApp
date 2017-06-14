package location_app.hadia.com.locationapp.get_places_details_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class AspectsItem extends responseModel {

	@JsonProperty("rating")
	private int rating;

	@JsonProperty("type")
	private String type;

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"AspectsItem{" + 
			"rating = '" + rating + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}