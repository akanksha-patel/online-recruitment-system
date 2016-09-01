<%@ page import="models.*,java.util.*" %>
<html>
	<head>
		<title>Profile Page</title>
			<link rel="stylesheet" type="text/css" href="css/header.css" />
			<link rel="stylesheet" type="text/css" href="css/footer.css" />
			<link rel="stylesheet" type="text/css" href="css/Home.css" />
			<link rel="stylesheet" type="text/css" href="css/mainmenu.css" />
			<link rel="stylesheet" type="text/css" href="css/profile.css" />
			<script type="text/javascript" src="js/ajax.js"></script>
			<script  type="text/javascript" src="js/profile.js"></script>
			
	</head>
	<body>
		<div id="main_body">
			
			
			<%@ include file="header.jsp"%>
			<div id ="menu1">		
				<%@ include file="mainmenu.jsp" %>
			</div>
						
			<div id="main">
				<div id="menu">
					
				
				<form id="personal_form" action="savepersonal.do" method="get">
					<table id="personal_table" border="1">
						<% Candidate candidate=(Candidate)session.getAttribute("user");%>

				
						WELCOME : <span id="wel_nm"><%= candidate.getUserName() %></span>
						<caption>Personal Details</caption>
						<tr>
							<td>
								Name:</td><td><span id="unm_box"><%= candidate.getUserName() %></span>
								<td><span class="edit" id="unm_edit" >edit</span></td>
								<td><span class="cancel" id="unm_cancel">cancel</span></td>
							</td>
						</tr>

						<tr>
							<td>Date Of Birth:</td>
							<td>
								<input type="text " id="dob"  name="dob" >
							</td>
							<td><span class="edit" id="dob_update" >save</span></td>
							<td><span class="cancel" id="dob_cancel">cancel</span></td>
						</tr>
						
						<tr>
							<td>Gender:</td>
							<td>
								<span id="" class="">
									Male:<input type="radio" id="gn_m" name="gender" value="<%= Gender.MALE %>" />
									&nbsp;&nbsp;
									Female:<input type="radio" id="gn_f" name="gender" value="<%= Gender.FEMALE %>" />
								</span>
							</td>
						</tr>
						<tr>
							<td>Marital Status:</td>
							<td>
								<% ArrayList maritalStatus1 = (ArrayList)application.getAttribute("maritalStatus"); %>
								<span id="country_editable" class="nodisplay">
								<select id="status" name="status">
									<% 
										for(int i=0;i<maritalStatus1.size();i++){
									  MaritalStatus maritalStatus = (MaritalStatus)maritalStatus1.get(i);
							
										if(maritalStatus.getMaritalStatusId()==candidate.getMaritalStatus().getMaritalStatusId()){
									%>			
										<option value="<%= maritalStatus.getMaritalStatusId() %>" selected="selected"><%= maritalStatus.getMaritalStatus()  %></option>	
									<% }else{ %>
										<option value="<%= maritalStatus.getMaritalStatusId() %>"><%= maritalStatus.getMaritalStatus() %></option>			
									<% }} %>
								 </select>
							</span>
							</td>
						</tr>
						
						
						<tr>
							<td>
								Nationality:</td><td><input type="text" id="nationality" name="nationality"></td>
						</tr>
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
				</form>
				
				
		</div>
		
	</body>
</html>
