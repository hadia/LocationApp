package location_app.hadia.com.locationapp.get_googe_places.google_places_response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.MfpModel;

@Generated("com.robohorse.robopojogenerator")
public class OpeningHours extends MfpModel {

	@JsonProperty("open_now")
	private boolean openNow;

	@JsonProperty("weekday_text")
	private List<Object> weekdayText;

	public void setOpenNow(boolean openNow){
		this.openNow = openNow;
	}

	public boolean isOpenNow(){
		return openNow;
	}

	public void setWeekdayText(List<Object> weekdayText){
		this.weekdayText = weekdayText;
	}

	public List<Object> getWeekdayText(){
		return weekdayText;
	}

	@Override
 	public String toString(){
		return 
			"OpeningHours{" + 
			"open_now = '" + openNow + '\'' + 
			",weekday_text = '" + weekdayText + '\'' + 
			"}";
		}
}