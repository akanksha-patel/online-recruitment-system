package models;

public class Skill{
	private Integer skillId;
	private String skill;

	public Skill(){
	
	
	}

	public void setSkillId(Integer skillId){
		this.skillId = skillId;
	}

	public Integer getSkillId(){
		return skillId;
	}

	public void setSkill(String skill){
		this.skill = skill;
	}

	public String getSkill(){
		return skill;
	}
}