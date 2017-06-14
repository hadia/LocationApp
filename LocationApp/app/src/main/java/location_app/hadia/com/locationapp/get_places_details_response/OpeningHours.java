package location_app.hadia.com.locationapp.get_places_details_response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class OpeningHours extends responseModel {

	@JsonProperty("open_now")
	private boolean openNow;

	@JsonProperty("periods")
	private List<PeriodsItem> periods;

	@JsonProperty("weekday_text")
	private List<String> weekdayText;

	public void setOpenNow(boolean openNow){
		this.openNow = openNow;
	}

	public boolean isOpenNow(){
		return openNow;
	}

	public void setPeriods(List<PeriodsItem> periods){
		this.periods = periods;
	}

	public List<PeriodsItem> getPeriods(){
		return periods;
	}

	public void setWeekdayText(List<String> weekdayText){
		this.weekdayText = weekdayText;
	}

	public List<String> getWeekdayText(){
		return weekdayText;
	}

	@Override
 	public String toString(){
		return 
			"OpeningHours{" + 
			"open_now = '" + openNow + '\'' + 
			",periods = '" + periods + '\'' + 
			",weekday_text = '" + weekdayText + '\'' + 
			"}";
		}
}