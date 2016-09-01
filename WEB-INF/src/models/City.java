package models;

import java.sql.*;
import java.util.*;

public class City{

	private Integer cityId;
	private String city;
	private State state;
	
	public City(){
	
	}


	public static ArrayList<City> collectCities(){
		ArrayList<City> cities = new ArrayList<City>();

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp?user=root&password=mysql");
			
			String query = "select c.city_id,c.city_name,c.state_id, s.state_name from cities as c inner join states as s on c.state_id = s.state_id";

			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				City city = new City();
				State state = new State();
				city.cityId = rs.getInt(1);
				city.city = rs.getString(2);
				state.setStateId(rs.getInt(3));
				state.setState(rs.getString(4));
				city.state= state;

				cities.add(city);
			}

			connection.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return cities;
	}


	// setter getter

	public void setCityId(Integer cityId){
		this.cityId = cityId;
	}
	public Integer getCityId(){
		return cityId;
	}

	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}

	public void setState(State state){
		this.state = state;
	}
	public State getState(){
		return state;
	}

}