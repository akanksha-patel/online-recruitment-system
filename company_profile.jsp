<%@ page import="models.*,java.util.*" %>
<html>
	<head>
		<title>Contact Page</title>
		<link rel="stylesheet" type="text/css" href="css/header.css" />
			<link rel="stylesheet" type="text/css" href="css/footer.css" />
			<link rel="stylesheet" type="text/css" href="css/Home.css" />
			<link rel="stylesheet" type="text/css" href="css/candimenu.css" />
			<!--
			<link rel="stylesheet" type="text/css" href="css/contact.css" /> -->
	</head>
	<body>
		<div id="main_body">
			<a href="logout.jsp">Logout</a>
			<!--<a href="Home">Home</a>-->
			<%@ include file="header.jsp"%>
			<div id="menu1">	
				<%@ include file="candimenu.jsp"%>
			</div>
			<div id="main">
				<form id="company_form" action="savecompany.do" method="get" >
					<table id="contact_table">
						<caption id="cap">Contact Details</caption>
						<tr>
							<td>Mission</td>
							<td>
								<textarea rows="3" cols="20" id="mission" name="mission"></textarea>
							</td>
							<td>Vision</td>
							<td>
								<textarea rows="3" cols="20" id="vision" name="vision"></textarea>
							</td>
						</tr>
						
						<tr>
							<td>&nbsp;</td>
							<td>Industry Type:</td>
							
							<td>
								<% ArrayList industryTypes1 = (ArrayList)application.getAttribute("industryTypes"); %>
							<select name="industry"> 
									<option value="0">select</option> 
										<% 
										for(int i=0;i<industryTypes1.size();i++){ 
										  IndustryType industryTypes = (IndustryType)industryTypes1.get(i);
										%>
									<option value="<%= industryTypes.getIndustryTypeId() %>"><%= industryTypes.getIndustryName() %></option>			
									<% } %>
									</select>
								</td>
							<td>&nbsp;</td>
						</tr>

						<tr>
							<td>Website:</td>
							<td><input type="text" id="website" name="website"/></td>
						</tr>
							<tr>
								<td colspan="4" >&nbsp;</td>
							</tr>
						<tr>

						<tr>
							<td>&nbsp;</td><td>&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td id="savebutton">
								<input type="submit" id="save" value="Save" >
								
							</td>
						</tr>
							
						</table>
					</div>	
				<%@ include file="footer.jsp"%>	
			</div>
	</body>
</html>