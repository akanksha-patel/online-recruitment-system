package models;

public class Project{
	
	private Integer projectId;
	private String title;
	private Candidate candidate;
	private String duration;
	private Integer member;
	private String projectDetail;
	private String otherDetail;

	public Project(){
	
	
	}

	public void setProectId(Integer projectId){
		this.projectId = projectId;
	}

	public Integer getProjectId(){
		return projectId;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCandidate(Candidate candidate){
		this.candidate = candidate;
	}

	public Candidate getCandidate(){
		return candidate;
	}
	
	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setMember(Integer member){
		this.member = member;
	}

	public Integer getMember(){
		return member;
	}

	public void setProjectDetail(String projectDetail){
		this.projectDetail = projectDetail;
	}

	public String getProjectDetail(){
		return projectDetail;
	}

	public void setOtherDetail(String otherDetail){
		this.otherDetail = otherDetail;
	}

	public String getOtherDetail(){
		return otherDetail;
	}
}