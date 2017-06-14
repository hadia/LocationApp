package location_app.hadia.com.locationapp.get_foursquare_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import location_app.hadia.com.locationapp.common.MfpModel;

@Generated("com.robohorse.robopojogenerator")
public class CategoriesItem extends MfpModel {

	@JsonProperty("pluralName")
	private String pluralName;

	@JsonProperty("name")
	private String name;

	@JsonProperty("icon")
	private Icon icon;

	@JsonProperty("id")
	private String id;

	@JsonProperty("shortName")
	private String shortName;

	@JsonProperty("primary")
	private boolean primary;

	public void setPluralName(String pluralName){
		this.pluralName = pluralName;
	}

	public String getPluralName(){
		return pluralName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIcon(Icon icon){
		this.icon = icon;
	}

	public Icon getIcon(){
		return icon;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setShortName(String shortName){
		this.shortName = shortName;
	}

	public String getShortName(){
		return shortName;
	}

	public void setPrimary(boolean primary){
		this.primary = primary;
	}

	public boolean isPrimary(){
		return primary;
	}

	@Override
 	public String toString(){
		return 
			"CategoriesItem{" + 
			"pluralName = '" + pluralName + '\'' + 
			",name = '" + name + '\'' + 
			",icon = '" + icon + '\'' + 
			",id = '" + id + '\'' + 
			",shortName = '" + shortName + '\'' + 
			",primary = '" + primary + '\'' + 
			"}";
		}
}