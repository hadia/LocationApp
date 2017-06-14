package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.responseModel;

@Generated("com.robohorse.robopojogenerator")
public class Meta extends responseModel {

	@JsonProperty("code")
	private int code;

	@JsonProperty("requestId")
	private String requestId;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	public String getRequestId(){
		return requestId;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"code = '" + code + '\'' + 
			",requestId = '" + requestId + '\'' + 
			"}";
		}
}