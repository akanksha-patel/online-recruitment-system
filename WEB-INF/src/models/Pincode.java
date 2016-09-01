package models;

public class Pincode{

	private Integer pincodeId;
	private City city;
	private String pincode;

	public Pincode(){
	
	
	}

	public void setPincodeId(Integer pincodeId){
		this.pincodeId = pincodeId;
	}

	public Integer getPincodeId(){
		return pincodeId;
	}

	public void setCity(City city){
		this.city = city;
	}

	public City getCity(){
		return city;
	}

	public void setPincode(String pincode){
		this.pincode = pincode;
	}

	public String getPincode(){
		return pincode;
	}
}