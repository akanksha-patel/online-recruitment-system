package listeners;

import javax.servlet.*;
import utilities.*;
import models.*;
import java.util.*;

public class AppListener implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent event){
		ServletContext context = event.getServletContext();
		DBBoard.dbPass = context.getInitParameter("dbpass");

		ArrayList maritalStatus = MaritalStatus.collectMaritalStatus();
		context.setAttribute("maritalStatus",maritalStatus);

		ArrayList genders = Gender.collectGenders();
		System.out.println(genders+"0000000000000000000000000");
		context.setAttribute("genders",genders);

		ArrayList<City> cities = City.collectCities();
		context.setAttribute("cities", cities);

		ArrayList<State> states = State.collectStates();
		context.setAttribute("states", states);

		ArrayList<IndustryType> industryTypes = IndustryType.collectIndustryTypes();
		context.setAttribute("industryTypes",industryTypes);

	}

	public void contextDestroyed(ServletContextEvent event){
	
	}
}