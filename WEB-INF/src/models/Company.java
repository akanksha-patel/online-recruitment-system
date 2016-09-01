package models;

import java.sql.*;
import utilities.*;


public class Company extends User{
	private Integer companyId;
	private IndustryType industryType;
	private String logoPath;
	private String website;
	private String mission;
	private String vision;
	private String aboutUs;
	private String history;
	private String achievement;

	public Company(){
	}

	public Company(String userName,String email, String password,UserType userType) {
		setUserName(userName);
		setEmail(email);
		setPassword(password);
		setUserType(userType);		
	}


	public boolean storeCompanyInfo(){
		boolean flag = false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			
			String query = "insert into companies (user_id) value(?)";
			PreparedStatement ps = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

			ps.setInt(1,getUserId());

			int result = ps.executeUpdate();

			if(result==1){
				flag = true;
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next()){
					companyId = rs.getInt(1);
					System.out.println("CompanyId "+companyId);
				}
			}
			
			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return flag;
	}
	

	public boolean collectCompanyInfo(){

		boolean flag = true;
		System.out.println("collectCompanyInfo");
			return flag;
			
	}


public boolean saveinfo( String website,String mission, String vision,Integer industryType){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			
			String query = "update companies set website=?,mission=?,vision=?,industry_type_id=? where company_id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			System.out.println("9099909099");
			ps.setString(1,website);
			ps.setString(2,mission);
			ps.setString(3,vision);
			ps.setInt(4,industryType);
			ps.setInt(5,companyId);


			ps.executeUpdate();
			System.out.println("heyzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			flag = true;
			
			System.out.println("website "+website);
			System.out.println("companyId "+companyId);
			System.out.println("industryType "+industryType);
			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return flag;
	}






	public void setCompanyId(Integer companyId){
		this.companyId = companyId;	
	}

	public Integer getCompanyId(){
		return companyId;
	}

	public void setIndustryType(IndustryType industryType){
		this.industryType = industryType;
	}

	public IndustryType getIndustryType(){
		return industryType;
	}

	public void setLogoPath(String logoPath){
		this.logoPath = logoPath;
	}

	public String getLogoPath(){
		return logoPath;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebSite(){
		return website;
	}

	public void setMission(String mission){
		this.mission = mission;
	}

	public String getMission(){
		return mission;
	}

	public void setVision(String vision){
		this.vision = vision;
	}

	public String getVision(){
		return vision;
	}

	public void setAboutUs(String aboutUs){
		this.aboutUs = aboutUs;
	}
	
	public String getAboutUs(){
		return aboutUs;
	}

	public void setAchievement(String achievement){
		this.achievement = achievement;
	}

	public String getAchievement(){
		return achievement;
	}

}