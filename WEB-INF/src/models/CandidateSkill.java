package models;

public class CandidateSkill{
	
	private Integer candidateSkillId;
	private Candidate candidate;
	private Skill skill;
	private String version;
	private String duration;

	public CandidateSkill(){
	
	
	}

	public void setCandidateSkillId(Integer candidateSkillId){
		this.candidateSkillId = candidateSkillId;
	}
	
	public Integer getCandidateSkill(){
		return candidateSkillId;
	}

	public void setCandidate(Candidate candidate){
		this.candidate = candidate;
	}

	public Candidate getCandidate(){
		return candidate;
	}

	public void setSkill(Skill skill){
		this.skill = skill;
	}

	public Skill getSkill(){
		return skill;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}


}
