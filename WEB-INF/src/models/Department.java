package models;

public class Department{
	private Integer departmentId;
	private String department;
	
	public Department(){
		
	
	}

	public void setDepartmentId(Integer departmentId){
		this.departmentId = departmentId;
	}

	public Integer getDepartmentId(){
		return departmentId;
	}

	public void setDepartment(String department){
		this.department = department;
	}

	public String getDepartment(){
		return department;
	}


}