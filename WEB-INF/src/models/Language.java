package models;

public class Language{
	private Integer languageId;
	private String language;

	public Language(){
	
	
	}

	public void setLanguageId(Integer languageId){
		this.languageId = languageId;
	}

	public Integer getLanguageId(){
		return languageId;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}
}