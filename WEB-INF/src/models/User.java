package models;

import java.sql.*;
import utilities.*;
import org.jasypt.util.password.*;

public class User{
	private Integer userId;
	private String userName;
	private String email;
	private String password;
	private UserType userType;

//-------------Constructors-------------------------------//

	public User(Integer userId){
		this.userId=userId;
	
	}

	public User(){
	
	}
	/*---------------not necessary 
	public User(String email, String password){
		this.email = email;
		this.password = password;
		
		System.out.println("--------email-------"+email);
		System.out.println("--------password-------"+password);
	}

	public User(String name,String email,String password,UserType userType){
		this.name = name;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}*/
	

//-------------Methods-------------------------------//

	public boolean registerUser(){
		boolean flag = false;

		try{  
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println(DBBoard.dbPass+" ++++++++++++++++++++");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			
			String query = "insert into users (user_type_id,user_name,email,password) values (?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			
			ps.setInt(1,userType.getUserTypeId());
			System.out.println(userType.getUserTypeId());
			ps.setString(2,userName);
			ps.setString(3,email);
			StrongPasswordEncryptor enc = new StrongPasswordEncryptor();
			String encPass = enc.encryptPassword(password);
			ps.setString(4,encPass);


	

			int result = ps.executeUpdate();

			if(result!=0){
				flag=true;
				ResultSet rs =	ps.getGeneratedKeys();
				if(rs.next()){
					userId = rs.getInt(1);
					System.out.println("UserId"+userId);
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

	public static User loginUser(String email,String password){
		boolean flag = false;
		User user = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			String query = "select password,user_type_id,user_id,user_name from users where email=?";
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setString(1,email);
			//ps.setString(2,password);

			//------------------------------System.out.println("--------Prepared Statement-------"+ps);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				flag=true;
				StrongPasswordEncryptor enc = new StrongPasswordEncryptor();
				if(enc.checkPassword(password,rs.getString(1)))
				{
				int userTypeId = rs.getInt(2);
				System.out.println(userTypeId);
				if(userTypeId==1){
					Candidate candidate = new Candidate();
					candidate.setUserType(new UserType(userTypeId));
					candidate.setEmail(email);
					//candidate.setPassword(password);
					candidate.setUserId(rs.getInt(3));
					candidate.setUserName(rs.getString(4));

					user = candidate;
					System.out.println("jjjjjjjjjjjjjjjjjjjjj");
					
				}else{
					Company company = new Company();
					company.setUserType(new UserType(userTypeId));
					company.setEmail(email);
					company.setUserId(rs.getInt(3));
					company.setUserName(rs.getString(4));

					user = company;
					System.out.println("yo baby");
				}

				}
				//userId = rs.getInt(1);
				//name = rs.getString(2);
			}
				
			//----------------System.out.println("--------userId-------"+userId+"+++++++++++Name"+name);

			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	
		return user;
	}


public boolean updateUserName(String userName){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			
			String query = "update users set user_name=? where user_id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, userName);
			ps.setInt(2, userId);

			
			ps.executeUpdate();
			flag = true;	

			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return flag;
	}








// getter and setters

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setEmail(String email)	{
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setUserType(UserType userType){
		this.userType = userType;
	}

	public UserType getUserType(){
		return userType;
	}
}