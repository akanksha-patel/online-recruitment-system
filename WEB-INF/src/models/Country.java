package models;

public class Country{
	
	private Integer countryId;
	private String country;

	public Country(Integer countryId){
		this.countryId = countryId;
	}
		
	public Country(){
		
	}

	public void setCountryId(Integer countryId){
		this.countryId = countryId;
	}

	public Integer getCountryId(){
		return countryId;
	}
	
	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

}