package models;

public class JobScoreCriteria{

	private Integer jobScoreCriteriaId;
	private Job job;
	private Integer highSchool;
	private Integer higherSecondary;
	private Integer graduation;
	private Integer postGraduation;

	public JobScoreCriteria(){
	
	}

	public void setJobScoreCriteriaId(Integer jobScoreCriteriaId){
		this.jobScoreCriteriaId = jobScoreCriteriaId;
	}

	public Integer getJobScoreCriteriaId(){
		return jobScoreCriteriaId;
	}

	public void setJob(Job job){
		this.job = job;
	}

	public Job getJob(){
		return job;
	}

	public void setHighSchool(Integer highSchool){
		this.highSchool = highSchool;
	}

	public Integer getHighSchool(){
		return highSchool;
	}

	public void setHigherSecondary(Integer higherSecondary){
		this.higherSecondary = higherSecondary;
	}

	public Integer getHigherSecondary(){
		return higherSecondary;
	}

	public void setGraduation(Integer graduation){
		this.graduation = graduation;
	}

	public Integer getGraduation(){
		return graduation;
	}

	public void setPostGraduation(Integer postGraduation){
		this.postGraduation = postGraduation;
	}

	public Integer getPostGraduation(){
		return postGraduation;
	}

}