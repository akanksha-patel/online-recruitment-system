package models;

public class OrganizationType{
	private Integer organizationId;
	private String organization;

	public OrganizationType(){
	
	}

	public void setOrganizationId(Integer organizationId){
		this.organizationId = organizationId;
	}

	public Integer getOrganizationId(){
		return organizationId;
	}

	public void setOrganization(String organization){
		this.organization = organization;		
	}
	
	public String getOrganization(){
		return organization;
	}
}
