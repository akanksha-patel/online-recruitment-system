package models;

public class CompanyFollower{

	private Integer companyFollowerId;
	private Candidate candidate;
	private Company company;
		
	public CompanyFollower(){
	
	
	}

	public void setCompanyFollowerId(Integer companyFollowerId){
		this.companyFollowerId = companyFollowerId;
	}

	public Integer getCompanyFollowerId(){
		return this.companyFollowerId;
	}
	
	public void setCandidate(Candidate candidate){
		this.candidate = candidate;
	}

	public Candidate getCandidate(){
		return this.candidate;
	}

	public void setCompany(Company company){
		this.company = company;
	}

	public Company getCompany(){
		return this.company;
	}
}
