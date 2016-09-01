package models;

public class CandidateLanguage{
	
	private Integer candidateLanguageId;
	private Language language;
	private LanguageCapability languageCapability;
	private Candidate candidate;

	public CandidateLanguage(){
	
	
	}

	public void setCandidateLanguageId(Integer candidateLanguageId){
		this.candidateLanguageId = candidateLanguageId;
	}

	public Integer getCandidateLanguageId(){
		return candidateLanguageId;
	}

	public void setLanguage(Language language){
		this.language = language;
	}

	public Language getLanguage(){
		return language;
	}

	public void setLanguageCapability(LanguageCapability languageCapability){
		this.languageCapability = languageCapability;
	} 

	public LanguageCapability getLanguageCapability(){
		return languageCapability;
	}

	public void setCandidate(Candidate candidate){
		this.candidate = candidate;
	}

	public Candidate getcandidate(){
		return candidate;
	}

}