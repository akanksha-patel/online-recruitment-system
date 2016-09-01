package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;

public class CandidateProfileServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		
		HttpSession session = request.getSession();

		User user = (User)session.getAttribute("user");
		
		String msg = "";
		if(user!=null){
			String userName = request.getParameter("username");
			if(user.updateUserName(userName)){
				msg = "done";
			}else{
				msg = "not_done";
			}
		}else{
			msg = "session_expire";
		}	
		
		response.getWriter().write(msg);
	}
}