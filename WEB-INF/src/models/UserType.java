package models;

public class UserType{
	public static final int CANDIDATE=1;
	public static final int COMPANY=2;
	private Integer userTypeId;
	private String userType;

//-------------Constructors-------------------------------//
	public UserType(){
	
	}

//-------------Getter & setter-------------------------------//

	public UserType(int userTypeId){
		this.userTypeId = userTypeId;
	}

	public void setUserTypeId(Integer userTypeId){
		this.userTypeId = userTypeId;
	}

	public Integer getUserTypeId(){
		return userTypeId;
	}

	public void setUserType(String userType){
		this.userType = userType;
	}

	public String getUserType(){
		return userType;
	}
}