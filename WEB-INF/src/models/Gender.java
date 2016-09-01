package models;

import java.util.*;
import java.sql.*;

public class Gender
{
	private Integer genderId;
	private String genderType;

	public static final int FEMALE = 2;
	public static final int MALE = 1;

	
	public Gender(Integer genderId){
		this.genderId=genderId;
	}

	public Gender(){
	}


	public Gender(Integer genderId,String genderType){
		this.genderId = genderId;
		this.genderType = genderType;

	}

	
	public static ArrayList collectGenders(){
		  ArrayList list = new ArrayList();

		  try{

			  Class.forName("com.mysql.jdbc.Driver");
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");

			  String query = "select gender_id,gender_type from genders";

			  PreparedStatement ps = con.prepareStatement(query);

			  ResultSet rs = ps.executeQuery();

			  while(rs.next()){
				  Gender gender = new Gender(rs.getInt(1),rs.getString(2));
				  list.add(gender);
			  System.out.println("****************************************************8");
			  }
				
				con.close();
		  }catch(ClassNotFoundException e){
				e.printStackTrace();
		  }catch(SQLException e){
				e.printStackTrace();
		  }
			
		  return list;
	
	}

	public Integer getGenderId() 
	{
		return genderId;
	}

	public void setGenderId(Integer genderId) 
	{
		this.genderId = genderId;
	}

	public String getGenderType()
	{
		return genderType;
	}

	public void setGenderType(String genderType)
	{
		this.genderType = genderType;
	}
}