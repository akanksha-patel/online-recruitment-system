package models;

public class Branch{
	private Integer branchId;
	private Company company;
	private String branchName;
	private String address;
	private Pincode pincode;
	private String contactPerson;
	private String contactNumber;
	private String email;

//-------------Constructors-------------------------------//
	
	public Branch(){
	
	}

	public Branch(Integer branchId, Company company, String branchName,String address, Pincode pincode,String contactPerson, String contactNumber, String email){
		this.branchId = branchId;
		this.company = company;
		this.branchName = branchName;
		this.address =  address;
		this.pincode = pincode;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.email = email;
	}

//-------------Getter & Setter-------------------------------//
	public void setBranchId(Integer branchId){
		this.branchId = branchId;
	}

	public Integer getBranchId(){
		return branchId;
	}

	public void setCompany(Company company){
		this.company = company;
	}
	public Company getCompany(){
		return company;
	}

	public void setBranchName(String branchName){
		this.branchName = branchName;
	}
	
	public String getBranchName(){
		return branchName;
	}

	public void setAddress(String address){
		this.address = address;	
	}
	public String getAddress(){
		return address;
	}
	public void setPincode(Pincode pincode){
		this.pincode = pincode;
	}

	public Pincode getPincode(){
		return pincode;
	}

	public void setContactPerson(String contactPerson){
		this.contactPerson = contactPerson;
	}

	public String getContactPerson(){
		return contactPerson;
	}

	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}

	public String getContactNumber(){
		return contactNumber;		
	}




}
