package models;

import java.sql.Timestamp;
public class JobShift{
	private Integer jobShiftId;
	private Job job;
	private Timestamp startHour;
	private Timestamp endHour;

	public JobShift(){
	
	
	}

	public void setJobShiftId(Integer jobShiftId){
		this.jobShiftId = jobShiftId;
	}
	
	public Integer getJobShiftId(){
		return jobShiftId;
	}

	public void setJob(Job job){
		this.job = job;
	}

	public Job getJob(){
		return job;
	}

	public void setStartHour(Timestamp startHour){
		this.startHour = startHour;
	}

	public Timestamp getStartHour(){
		return startHour;
	}

	public void setEndHour(Timestamp endHour){
		this.endHour = endHour;
	}

	public Timestamp getEndHour(){
		return endHour;
	}

}