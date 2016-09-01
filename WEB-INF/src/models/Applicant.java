package models;

import java.sql.Date;

public class Applicant{

	private Integer applicantId;
	private Job job;
	private Candidate candidate;
	private Status status;
	private Date appliedDate;
	
//-------------Constructors-------------------------------//
	public Applicant(){
	
	}

	public Applicant(Integer applicantId, Job job, Candidate candidate, Status status, Date appliedDate){
		this.applicantId = applicantId;
		this.job = job;
		this.candidate = candidate;
		this.status = status;
		this.appliedDate = appliedDate;
	}

//-------------Getter & Setter-------------------------------//
	public void setApplicantId(Integer applicantId){
		this.applicantId  =  applicantId;
	}

	public Integer getApplicantId(){
		return applicantId;
	}

	public void setJob(Job job){
		this.job = job;
	}

	public Job getJob(){
		return job;
	}
	
	public void setCandidate(Candidate candidate){
		this.candidate = candidate;
	}

	public Candidate getCandidate(){
		return candidate;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(	){
		return status;
	}

	public void setAppliedDate(Date appliedDate){
		this.appliedDate = appliedDate;
	}

	public Date getDate(){
		return appliedDate;	
	}
}