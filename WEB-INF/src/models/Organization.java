package models;

public class Organization{
	
	private Integer organizationId;
	private OrganizationType organizationType;
	private String organization;
	
	public Organization(){
	
	
	}

	public void setOrganizationId(Integer organizationId){
		this.organizationId = organizationId;
	}

	public Integer getOrganizationId(){
		return organizationId;
	}

	public void setOrganizationType(OrganizationType organizationType){
		this.organizationType = organizationType;
	}

	public OrganizationType getOrganizationtype(){
		return organizationType;
	}

	public void setOrganization(String organizaiton){
		this.organization = organization;
	}

	public String getOrganization(){
		return organization;
	}
}