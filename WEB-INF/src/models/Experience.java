package models;

import java.sql.Date;
public class Experience{
	private Integer experienceId;
	private Candidate candidate;
	private String companyName;
	private IndustryType industryType;
	private Department department;
	private Designation designation;
	private Date joinDate;
	private Date leavingDate;
	private Integer ctc;

	public Experience(){
	
	}
	
	public void setExperienceId(Integer experienceId){
		this.experienceId = experienceId;
	}

	public Integer getExperienceId(){
		return experienceId;
	}

	public void setCandidate(Candidate candidate){
		this.candidate = candidate;
	}

	public Candidate getCandidate(){
		return candidate;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setIndustryType(IndustryType industryType){
		this.industryType = industryType;
	}

	public IndustryType getIndustryType(){
		return industryType;
	}

	public void setDepartment(Department department){
		this.department = department;
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
	public void setJoinDate(Date joinDate){
		this.joinDate = joinDate;
	}

	public Date getJoinDate(){
		return joinDate;
	}

	public void setLeavingDate(Date leavingDate){
		this.leavingDate = leavingDate;
	}

	public Date getLeavingDate(){
		return leavingDate;
	}

	public void setCtc(Integer ctc){
		this.ctc = ctc;
	}

	public Integer getCtc(){
		return ctc;
	}

}

