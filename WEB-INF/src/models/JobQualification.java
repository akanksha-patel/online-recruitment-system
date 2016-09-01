package models;

public class JobQualification{

	private Integer jobQualificationId;
	private Job job;
	private Course course;

	public JobQualification(){
	

	}

	public void setJobQualificationId(Integer jobQualificationId){
		this.jobQualificationId = jobQualificationId;
	}

	public Integer getJobQualificationId(){
		return jobQualificationId;
	}

	public void setJob(Job job){
		this.job = job;
	}

	public Job getJob(){
		return job;
	}

	public void setCourse(Course course){
		this.course = course;
	}

	public Course getCourse(){
		return course;
	}

}