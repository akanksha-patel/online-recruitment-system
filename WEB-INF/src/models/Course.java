package models;

public class Course{
	private Integer courseId;
	private String course;

	public Course(){
	
	}

	public void setCourseId(Integer courseId){
		this.courseId = courseId;
	}

	public Integer getCourseId(){
		return courseId;
	}

	public void setCourse(String course){
		this.course = course;
	}

	public String getCourse(){
		return course;
	}

}