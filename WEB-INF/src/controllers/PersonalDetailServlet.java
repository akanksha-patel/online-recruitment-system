package controllers;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import models.*;


public class PersonalDetailServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
						HttpSession session = request.getSession();
						
						Candidate candidate = (Candidate)session.getAttribute("user");
						
						Boolean flag = true;
						String nextPage = "contact.jsp" ;
						String msg = "";

						Date dob = Date.valueOf(request.getParameter("dob"));
					
						Integer gender = null;
						if((request.getParameter("gender"))!=null){
						gender = Integer.valueOf(request.getParameter("gender"));
						System.out.println("gender"+gender);
						}else{
							msg+="select gender";
							flag = false ;
						}

						Integer mstatus = null;
						String st = request.getParameter("status");
						System.out.println(st);
						if((request.getParameter("status"))!=null){
							System.out.println("hello");
						mstatus = Integer.parseInt(request.getParameter("status"));
						System.out.println("status"+mstatus);
						}else{
							msg+="select status";
							flag = false ;
							System.out.println("hiiiiiii");

						}


						String nationality = request.getParameter("nationality");
								if(nationality.trim().equals("")){
										msg+="select nationality";
										flag = false ;
								}
								System.out.println(nationality);
						
											
					
						if(flag){
							//Candidate candidate = new Candidate(dob, new Gender(gender), new MaritalStatus(mstatus),nationality);
							candidate.setDateOfBirth(dob);
							candidate.setGender(new Gender(gender));
							candidate.setMaritalStatus(new MaritalStatus(mstatus));
							candidate.setNationality(nationality);
							


							if(candidate.saveinfo(dob,nationality,gender,mstatus)){
								System.out.println("saving info");
								nextPage="contact.jsp";
							}else{
								nextPage="login.jsp";
							
							}
						
						
						}else{
							msg+="";
							request.setAttribute("msg",msg);
						}








						RequestDispatcher view = request.getRequestDispatcher(nextPage);
						view.forward(request,response);
	
	}

}