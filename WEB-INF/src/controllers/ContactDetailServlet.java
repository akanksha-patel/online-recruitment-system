
package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

import models.*;

public class ContactDetailServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
			HttpSession session = request.getSession();
			Candidate candidate = (Candidate)session.getAttribute("user");
						
						Boolean flag = true;
						String nextPage = "Home.jsp" ;
						String msg = "";
						
						String laddress = request.getParameter("laddress");
						String paddress = request.getParameter("paddress");
						String lpincode = request.getParameter("lpincode");
						String city = request.getParameter("city");
						String state =request.getParameter("state");
						String country = request.getParameter("country");
						String lemail = request.getParameter("lemail");
						String semail = request.getParameter("semail");
						String plandline = request.getParameter("plandline");
						String slandline = request.getParameter("slandline");
						String lmobile = request.getParameter("lmobile");
						String smobile = request.getParameter("smobile");

/*

						
											
					
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





*/

			
		RequestDispatcher rd=request.getRequestDispatcher("contact_detail.jsp");
		rd.forward(request,response);
	} 

}