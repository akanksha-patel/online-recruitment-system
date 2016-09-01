package models;

import java.sql.*;
import utilities.*;


public class Contact{

	private Integer contactId;
	private User user;
	private ContactType contactType;
	private String contact;

	public Contact(){
	
	
	}






public boolean savecontact(Contact contact1){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/on_re_sy?user=root&password=mysql");
			
			String query = "insert into contacts(user_id,contact_type_id,contact) values (?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			System.out.println("9099909099");
			ps.setInt(1,user.getUserId());
			ContactType contactType = new ContactType(); 
			ps.setInt(2,1);
			ps.setString(3,contact);

			ps.executeUpdate();
			System.out.println("heyzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			flag = true;
			
			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return flag;
	}






















	public void setContactId(Integer contactId){
		this.contactId = contactId;
	}

	public Integer getContactId(){
		return contactId;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setContactType(ContactType contactType){
		this.contactType = contactType;
	}

	public ContactType getContactType(){
		return contactType;
	}

	public void setContact(String contact){
		this.contact = contact;
	}

	public String getContact(){
		return contact;
	}

}