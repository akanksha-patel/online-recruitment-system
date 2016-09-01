package models;

public class JobSkill{
	private Integer jobSkillId;
	private Job job;
	private Skill skill;

	public JobSkill(){
	
	
	}

	public void setjobSkillId(Integer jobSkillId){
		this.jobSkillId = jobSkillId;		
	}
	
	public Integer getJobSkiilId(){
		return jobSkillId;
	}

	public void setJob(Job job){
		this.job = job;
	}
	
	public Job getJob(){
		return job;
	}

	public void setSkill(Skill skill){
		this.skill = skill;
	}

	public Skill getSkill(){
		return skill;
	}
}