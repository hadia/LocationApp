package location_app.hadia.com.locationapp.get_places_details_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.MfpModel;

@Generated("com.robohorse.robopojogenerator")
public class PeriodsItem extends MfpModel {

	@JsonProperty("close")
	private Close close;

	@JsonProperty("open")
	private Open open;

	public void setClose(Close close){
		this.close = close;
	}

	public Close getClose(){
		return close;
	}

	public void setOpen(Open open){
		this.open = open;
	}

	public Open getOpen(){
		return open;
	}

	@Override
 	public String toString(){
		return 
			"PeriodsItem{" + 
			"close = '" + close + '\'' + 
			",open = '" + open + '\'' + 
			"}";
		}
}