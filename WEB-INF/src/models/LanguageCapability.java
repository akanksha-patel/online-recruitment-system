package models;

public class LanguageCapability{
	private Integer languageCapabilityId;
	private String languageCapability;
	
	public LanguageCapability(){
	
	
	}

	public void setLanguageCapabilityId(Integer languageCapabilityId){
		this.languageCapabilityId = languageCapabilityId;
	}

	public Integer getLanguageCapabilityId(){
		return languageCapabilityId;
	}

	public void setLanguageCapability(String languageCapability){
		this.languageCapability = languageCapability;
	}

	public String getLanguageCapability(){
		return languageCapability;
	}

}