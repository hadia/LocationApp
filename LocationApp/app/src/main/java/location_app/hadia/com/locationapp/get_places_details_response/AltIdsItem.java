package location_app.hadia.com.locationapp.get_places_details_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AltIdsItem{

	@JsonProperty("scope")
	private String scope;

	@JsonProperty("place_id")
	private String placeId;

	public void setScope(String scope){
		this.scope = scope;
	}

	public String getScope(){
		return scope;
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
			"AltIdsItem{" + 
			"scope = '" + scope + '\'' + 
			",place_id = '" + placeId + '\'' + 
			"}";
		}
}