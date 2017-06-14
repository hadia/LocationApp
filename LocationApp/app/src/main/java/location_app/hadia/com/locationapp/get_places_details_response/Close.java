package location_app.hadia.com.locationapp.get_places_details_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.MfpModel;

@Generated("com.robohorse.robopojogenerator")
public class Close extends MfpModel {

	@JsonProperty("time")
	private String time;

	@JsonProperty("day")
	private int day;

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setDay(int day){
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"Close{" + 
			"time = '" + time + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}