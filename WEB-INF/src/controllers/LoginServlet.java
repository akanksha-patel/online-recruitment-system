package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import java.io.IOException;
import models.*;


public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
		
		HttpSession session = request.getSession();
		
		String nextPage="login.jsp";
		System.out.println("---------------"+nextPage);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println("-------------");
		System.out.println(email);
		System.out.println(password);
		boolean flag = true;
		String msg = "Enter ";
		if(email.trim().equals("")){
				msg+="Email, ";
				flag=false;
			}if(password.trim().equals("")){
				msg+=" Password";
				flag=false;		
			}
		System.out.println("helloz");
		if(flag){
			System.out.println("hiii");
			User user = User.loginUser(email,password);
			if(user!=null){				
				if(user instanceof Candidate){
					Candidate candidate = (Candidate)user;
					nextPage="candidate_profile.jsp";
					System.out.println("++++++++");
					if(candidate.collectUserInfo()){
						
						session.setAttribute("user",candidate);
						System.out.println("******");
					}					
				}else if(user instanceof Company){
					System.out.println("inside company");
					Company company = (Company)user;
					nextPage="company_profile.jsp";
					System.out.println("-------------");

					if(company.collectCompanyInfo()){
					session.setAttribute("user",company);
					System.out.println("bhag");
					}
				}

			}else{
				
				msg+="";
				request.setAttribute("msg",msg);
				flag=false;
			}
		}else{
			request.setAttribute("msg",msg);
		}
	
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request,response);
	}

}