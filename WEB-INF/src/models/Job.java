package models;

import java.sql.Date;

public class Job{

	private Integer jobId;
	private Company company;
	private String jobTitle;
	private Branch branch;
	private Department department;
	private Designation designation;
	private Integer noOfPost;
	private Date launchDate;
	private Date lastAppliedDate;
	private String jobDescription;
	private Integer experienceMin;
	private Integer experienceMax;
	private Integer ctcMin;
	private Integer ctcMax;

	public Job(){
	
	}

	public void setJobId(Integer jobId){
		this.jobId = jobId;
	}

	public Integer getJobId(){
		return jobId;
	}

	public void setCompany(Company company){
		this.company = company;
	}

	public Company getCompany(){
		return company;
	}

	public void setBranch(Branch branch){
		this.branch = branch;
	}

	public Branch getBranch(){
		return branch;
	}

	public Department getDepartment(){
		return department;
	}

	public void setDesignation(Designation designation){
		this.designation = designation;
	}
	
	public Designation getDesignation(){
		return designation;
	}
	
	public void setNoOfPost(Integer noOfPost){
		this.noOfPost = noOfPost;
	}

	public void setLaunchDate(Date launchDate){
		this.launchDate = launchDate;
	}

	public Date getLaunchDate(){
		return launchDate;
	}

	public void setlastAppliedDate(Date lastAppliedDate){
		this.lastAppliedDate = lastAppliedDate;
	}

	public Date getLastAppliedDate(){
		return lastAppliedDate;
	}
	
	public void setJobDescription(String jobDescription){
		this.jobDescription = jobDescription;
	}

	public String getJobDescription(){
		return jobDescription;
	}
	
	public void setExperienceMin(Integer experienceMin){
		this.experienceMin = experienceMin;
	}

	public Integer getExperienceMin(){
		return experienceMin;
	}

	public void getExperienceMax(Integer experienceMax){
		this.experienceMax = experienceMax;
	}

	public Integer getExperienceMax(){
		return experienceMax;
	}

	public void setCtcMin(Integer ctcMin){
		this.ctcMin = ctcMin;
	}

	public Integer getCtcMin(){
		return ctcMin;
	}

	public void setCtcMax(Integer ctcMax){
		this.ctcMax = ctcMax;
	}

	public Integer getCtcMax(){
		return ctcMax;
	}

}

