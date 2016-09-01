package models;

import java.sql.*;
import utilities.*;

public class Candidate extends User{
	private Integer candidateId;
	private Date dateOfBirth;
	private Gender gender;
	private String nationality;
	private MaritalStatus maritalStatus;
	private Contact contact;
	
//-----------------Constructors------------------------//
	public Candidate(){
		
	}

	public Candidate(String email, String password){
		setEmail(email);
		setPassword(password);		
	}

	public Candidate(String userName,String email, String password,UserType userType) {
		setUserName(userName);
		setEmail(email);
		setPassword(password);
		setUserType(userType);		
	}

	public Candidate(Date dateOfBirth, Gender gender, MaritalStatus maritalStatus,String nationality){
		this.candidateId = candidateId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.nationality = nationality;
		
		
	}



//-----------------Methods------------------------//

	public boolean storeUserInfo(){
		boolean flag = false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			
			String query = "insert into candidates (user_id) value(?)";
			PreparedStatement ps = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

			ps.setInt(1,getUserId());

			int result = ps.executeUpdate();

			if(result==1){
				flag = true;
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next()){
					candidateId = rs.getInt(1);
					System.out.println("CandidateId "+candidateId);
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
	
	public boolean collectUserInfo(){
		boolean flag = true;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			String query = "select candidate_id,date_of_birth,gender_id,nationality,marital_status_id from candidates where user_id=?";
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1,getUserId());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				
				System.out.println("inside*******");
				candidateId = rs.getInt(1);
				dateOfBirth = rs.getDate(2);
				gender = new Gender(rs.getInt(3));
				nationality = rs.getString(4);
				maritalStatus =  new MaritalStatus(rs.getInt(5));

				System.out.println("inside");

				
			}
			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
			return flag;
	}


	public boolean saveinfo(Date dob,String nationality,Integer gender,Integer status){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			
			String query = "update candidates set date_of_birth=?,nationality=?,gender_id=?,marital_status_id=? where candidate_id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			System.out.println("9099909099");
			ps.setDate(1,dob);
			ps.setString(2,nationality);
			ps.setInt(3,gender);
			ps.setInt(4,status);
			ps.setInt(5,candidateId);


			ps.executeUpdate();
			System.out.println("heyzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			flag = true;
			
			System.out.println("status "+status);
			System.out.println("CandidateId "+candidateId);
			System.out.println("DOB "+dob);
			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return flag;
	}

	public boolean UpdateDob(Date dob){
		boolean flag = false;
		try{
				System.out.println("hello");
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
				System.out.println("hey");
				String query = "update candidates set date_of_birth = ? where candidate_id = ?";
				System.out.println(query);
				System.out.println(candidateId);
				PreparedStatement ps = con.prepareStatement(query);

				ps.setDate(1,dob);
				ps.setInt(2,candidateId);

				if(ps.executeUpdate()==1){
					System.out.println("model");
					flag = true;
				}
		
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	
	
	
	return flag;
	}


	

//-----------------Getter & Setter------------------------//

	public void setCandidateId(Integer candidateId){
		this.candidateId = candidateId;
	}

	public Integer getCandidateId(){
		return candidateId;
	}

	public void setDateOfBirth(Date dateOfbirth){
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfBirth(){
		return dateOfBirth;
	}

	public void setGender(Gender gender){
		this.gender = gender;
	}

	public Gender getGender(){
		return gender;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus){
		this.maritalStatus = maritalStatus;
	}
	
	public MaritalStatus getMaritalStatus(){
		return maritalStatus;
	}
	
	public void setNationality(String nationality){
		this.nationality=nationality;
	}

	public String getNationality(){
		return nationality;
	}
	

}