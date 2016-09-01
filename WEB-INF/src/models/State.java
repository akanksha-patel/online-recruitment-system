package models;

import java.sql.*;
import java.util.*;

public class State{

	private Integer stateId;
	private String state;


public State(){
	
	}


	public static ArrayList<State> collectStates(){
		ArrayList<State> states = new ArrayList<State>();

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp?user=root&password=mysql");
			
			String query = "select state_id,state_name from states";

			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				State state = new State();
				state.stateId = rs.getInt(1);
				state.state = rs.getString(2);

				
				states.add(state);
			}

			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return states;
	}


	//setter getter

	public void setStateId( Integer stateId){
		this.stateId = stateId;
	}
	public Integer getStateId(){
		return stateId;
	}

	public void setState( String state){
		this.state = state;
	}
	public String getState(){
		return state;
	}



}