package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class Stats extends responseModel {

	@JsonProperty("checkinsCount")
	private int checkinsCount;

	@JsonProperty("usersCount")
	private int usersCount;

	@JsonProperty("tipCount")
	private int tipCount;

	public void setCheckinsCount(int checkinsCount){
		this.checkinsCount = checkinsCount;
	}

	public int getCheckinsCount(){
		return checkinsCount;
	}

	public void setUsersCount(int usersCount){
		this.usersCount = usersCount;
	}

	public int getUsersCount(){
		return usersCount;
	}

	public void setTipCount(int tipCount){
		this.tipCount = tipCount;
	}

	public int getTipCount(){
		return tipCount;
	}

	@Override
 	public String toString(){
		return 
			"Stats{" + 
			"checkinsCount = '" + checkinsCount + '\'' + 
			",usersCount = '" + usersCount + '\'' + 
			",tipCount = '" + tipCount + '\'' + 
			"}";
		}
}