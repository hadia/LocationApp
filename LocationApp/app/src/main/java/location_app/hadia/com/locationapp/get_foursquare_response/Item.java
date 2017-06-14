package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class Item extends responseModel {

	@JsonProperty("unreadCount")
	private int unreadCount;

	public void setUnreadCount(int unreadCount){
		this.unreadCount = unreadCount;
	}

	public int getUnreadCount(){
		return unreadCount;
	}

	@Override
 	public String toString(){
		return 
			"Item{" + 
			"unreadCount = '" + unreadCount + '\'' + 
			"}";
		}
}