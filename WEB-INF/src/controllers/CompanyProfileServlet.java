

package controllers;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import models.*;


public class CompanyProfileServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
						HttpSession session = request.getSession();
						
						Company company = (Company)session.getAttribute("company");
						
						Boolean flag = true;
						String nextPage = "contact.jsp" ;
						String msg = "";

				
						Integer industry = null;
						if((request.getParameter("industry"))!=null){
						industry = Integer.valueOf(request.getParameter("industry"));
						System.out.println("industry"+industry);
						}else{
							msg+="select gender";
							flag = false ;
						}

						
						String mission = request.getParameter("mission");
								if(mission.trim().equals("")){
										msg+="select nationality";
										flag = false ;
								}
								System.out.println(mission);

								String vision = request.getParameter("vision");
								if(vision.trim().equals("")){
										msg+="select vision";
										flag = false ;
								}
								System.out.println(mission);

								String website = request.getParameter("website");
								if(website.trim().equals("")){
										msg+="select website";
										flag = false ;
								}
								System.out.println(website);



						
											
					
						if(flag){
							System.out.println("===================");
							company.setWebsite(website);
							company.setMission(website);
							company.setIndustryType(new IndustryType(industry));
							company.setVision(vision);
							


							if(company.saveinfo(website,mission,vision,industry)){
								System.out.println("____________________________");
								System.out.println("saving info");
								nextPage="Home.jsp";
							}else{
								System.out.println("-=-=-=-=---=-=-=");
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