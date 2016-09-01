package models;

public class UserAddress{

	private Integer userAddressId;
	private User user;
	private ContactType contactType;
	private Pincode pincode;
	private String address;

//-------------Constructors-------------------------------//

	public UserAddress(){

	}

//-------------Getter & Setter----------------------------//	
	
	public void setUserAddressId(Integer userAddressId){
		this.userAddressId = userAddressId;
	}

	public Integer getUserAddressId(){
		return userAddressId;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void ContactType(ContactType contactType){
		this.contactType = contactType;
	}

	public ContactType getContactType(){
		return contactType;
	}

	public void setPincode(Pincode pincode){
		this.pincode = pincode;
	}

	public Pincode getPincode(){
		return pincode;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}
	
}