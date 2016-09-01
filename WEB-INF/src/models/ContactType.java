package models;

public class ContactType{
	private Integer contactTypeId;
	private String contactType;
	
	public ContactType(){
	
	
	}

	public void setContactTypeId(Integer contactTypeId){
		this.contactTypeId = contactTypeId;
		}

	public Integer getcontactType(){
		return contactTypeId;
	}

	public void setContactType(String contactType){
		this.contactType = contactType;
	}

	public String getContactType(){
		return contactType;
	}

}