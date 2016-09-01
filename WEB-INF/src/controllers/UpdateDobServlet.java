package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.sql.*;
import models.*;

public class UpdateDobServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

		HttpSession session = request.getSession();
		System.out.println("**************");
		String msg = null;
		String dob = request.getParameter("dob1");
		
		System.out.println(dob);

		if(!dob.trim().equals(" ")){
			Date date = Date.valueOf(dob);
			System.out.println(date);
			Candidate candidate = (Candidate)session.getAttribute("user");
			if(candidate.UpdateDob(date)){
				System.out.println("updatedob ho gaya");
				msg = "done";
				candidate.setDateOfBirth(date);
			}else{
				msg = "failed";
			}
		
		}else{
			msg = "empty" ; 
		}
		
		System.out.println(msg);
		response.getWriter().write(msg);
	
	}


}