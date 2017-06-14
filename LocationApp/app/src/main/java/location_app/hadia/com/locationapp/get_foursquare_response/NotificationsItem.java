package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class NotificationsItem  extends responseModel {

	@JsonProperty("item")
	private Item item;

	@JsonProperty("type")
	private String type;

	public void setItem(Item item){
		this.item = item;
	}

	public Item getItem(){
		return item;
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
			"NotificationsItem{" + 
			"item = '" + item + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}