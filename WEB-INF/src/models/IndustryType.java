package models;

import java.sql.*;
import java.util.*;

public class IndustryType{

	private Integer industryTypeId;
	private String industryName;


		public IndustryType(Integer industryTypeId){
		this.industryTypeId=industryTypeId;
	
	}

	public IndustryType(){
	}


	public static ArrayList<IndustryType> collectIndustryTypes(){
		ArrayList<IndustryType> industryNames = new ArrayList<IndustryType> ();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp?user=root&password=mysql");
			String query = "select industry_type_id, industry_name from industry_types";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				IndustryType industryType = new IndustryType();
				industryType.industryTypeId = rs.getInt(1);
				industryType.industryName = rs.getString(2);
				industryNames.add(industryType);
			}
			conn.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return industryNames;
	}


	public void setIndustryTypeId(Integer industryTypeId) {
		this.industryTypeId = industryTypeId;
	}
	public Integer getIndustryTypeId() {
		return industryTypeId;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public String getIndustryName() {
		return industryName;
	}


}