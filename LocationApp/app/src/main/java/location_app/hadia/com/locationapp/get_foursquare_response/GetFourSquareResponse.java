package location_app.hadia.com.locationapp.get_foursquare_response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.MfpModel;


@Generated("com.robohorse.robopojogenerator")
public class GetFourSquareResponse extends MfpModel {

	@JsonProperty("meta")
	private Meta meta;

	@JsonProperty("response")
	private Response response;

	@JsonProperty("notifications")
	private List<NotificationsItem> notifications;

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setResponse(Response response){
		this.response = response;
	}

	public Response getResponse(){
		return response;
	}

	public void setNotifications(List<NotificationsItem> notifications){
		this.notifications = notifications;
	}

	public List<NotificationsItem> getNotifications(){
		return notifications;
	}

	@Override
 	public String toString(){
		return 
			"GetFourSquareResponse{" + 
			"meta = '" + meta + '\'' + 
			",response = '" + response + '\'' + 
			",notifications = '" + notifications + '\'' + 
			"}";
		}
}