package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;
import models.*;


public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException,IOException{
		
			HttpSession session = request.getSession();
			
			boolean flag = true;
			String nextPage="register.jsp";
			String msg = "";

			String name = request.getParameter("name");
			System.out.println(name);
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String repassword = request.getParameter("repassword");

			Integer userType=null;			
			if((request.getParameter("register_as"))!=null){
				userType = Integer.parseInt(request.getParameter("register_as"));
			}else{
				flag=false;
				msg+=" Register As, ";
			}

			if(name.trim().equals("")){
				msg+="Name, ";
				flag=false;
			} if(email.trim().equals("")){
				msg+="Email, ";
				flag=false;
			} if(password.trim().equals("")){
				msg+="Password";
				flag=false;
			} else if(password.length()<8){
				msg+=" Password must be 8 character long";
				flag=false;
			} if(!(password.trim().equals(repassword.trim()))){
				msg+=" Entered Password does not match.";
				flag=false;
			}


			if(flag==true && userType==1){
				Candidate candidate = new Candidate(name,email,password,new UserType(userType));
				if(candidate.registerUser()){
					nextPage="login.jsp";
					if(candidate.storeUserInfo()){
						System.out.println("********");
						session.setAttribute("candidate",candidate);
					}
				}else{
					msg+="Email Already Exist..";
					request.setAttribute("msg",msg);
				}
			}else {
				msg+="";
				request.setAttribute("msg",msg);
			}			


				if(flag==true && userType==2){
				Company company = new Company(name,email,password,new UserType(userType));
				System.out.println("********");
				if(company.registerUser()){
					nextPage="login.jsp";
					if(company.storeCompanyInfo()){
						System.out.println("********");
						session.setAttribute("company",company);
					}
				}else{
					msg+="Email Already Exist..";
					request.setAttribute("msg",msg);
				}
			}else {
				msg+="";
				request.setAttribute("msg",msg);
			}			
					

				/*	User user = new User(name,email,password,new UserType(userType));
					if(user.registerUser()){
						nextPage="login.jsp";
						Candidate candidate = new Candidate(user);	
						candidate.registerCandidate();
					}else{
						msg+="Email Already Exist..";
						request.setAttribute("msg",msg);
					}
				}else {
					msg+="";
					request.setAttribute("msg",msg);
			}*/
			
			RequestDispatcher rd = request.getRequestDispatcher(nextPage);
			rd.forward(request,response);	
	}
}
