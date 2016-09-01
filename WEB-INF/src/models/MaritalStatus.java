package models;

import java.util.*;
import java.sql.*;

public class MaritalStatus
{	
	// FIELDS
	private Integer maritalStatusId;
	private String maritalStatus;

	//CONSTRUCTOR
	public MaritalStatus(Integer maritalStatusId,String maritalStatus){
		this.maritalStatusId = maritalStatusId;
		this.maritalStatus = maritalStatus;
	
	}

	public MaritalStatus(Integer maritalStatusId){
			this.maritalStatusId = maritalStatusId;
	}

	public MaritalStatus(){
	
	}

	//METHODS

	public static ArrayList collectMaritalStatus(){
			ArrayList lst = new ArrayList();

			try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");

					String query = "select marital_status_id,marital_status from marital_status" ;

					PreparedStatement ps = con.prepareStatement(query);

					ResultSet rs = ps.executeQuery();

					while(rs.next()){

						MaritalStatus marital = new MaritalStatus(rs.getInt(1),rs.getString(2));
						lst.add(marital);
					
					}
			

				con.close();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}

				return lst;
	}



	//GETTER - SETTER
	public Integer getMaritalStatusId(){
		return maritalStatusId;
	}

	public void setMaritalStatusId(Integer maritalStatusId){
		this.maritalStatusId = maritalStatusId;
	}

	public String getMaritalStatus(){
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus){
		this.maritalStatus = maritalStatus;
	}








}