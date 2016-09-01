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
				<form id="contact_form" action="contact_details.do" method="get" >
					<table id="contact_table">
						<caption id="cap">Contact Details</caption>
						<tr>
							<td>Local Address</td>
							<td>
								<textarea rows="3" cols="20" id="laddress" name="laddress"></textarea>
							</td>
							<td>Permanent Address</td>
							<td>
								<textarea rows="3" cols="20" id="paddress" name="paddress"></textarea>
							</td>
						</tr>
						
						<tr>
							<td>Pincode</td>
							<td><input type="text" id="lpincode" name="lpincode"/></td>
							<td>Pincode</td>
							<td><input type="text" id="lpincode" name="lpincode"/></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>
								<select id="city" name="city">
									<option>City</option>
								</select>
								<select id="state" name="state">
									<option>State</option>
								</select>
								<select id="Country" name="Country">
									<option>Country</option>
								</select>
							</td>
							<td>&nbsp;</td>
							<td>
								<select id="city" name="city">
									<option>City</option>
								</select>
								<select id="state" name="state">
									<option>State</option>
								</select>
								<select id="Country" name="Country">
									<option>Country</option>
								</select>
							</td>
						</tr>
						<tr>
							<td colspan="4" >&nbsp;</td>
						</tr>
						<tr>
							<td>Primary Email</td>
							<td><input type="text" id="lemail" name="lemail"/></td>
							<td>Secondary Email</td>
							<td><input type="text" id="semail" name="semail"/></td>
						</tr>
						<tr>
							<td>Primary Landline</td>
							<td><input type="text" id="plandline" name="plandline"/></td>
							<td>Secondary Landline</td>
							<td><input type="text" id="slandline" name="slandline" /></td>
						</tr>
						<tr>
							<td>Primary Mobile</td>
							<td><input type="text" id="lmobile" name="lmobile"/></td>
							<td>Secondary MObile</td>
							<td><input type="text" id="smobile" name="smobile"/></td>
						</tr>
							<tr>
								<td colspan="4" >&nbsp;</td>
							</tr>
						<tr>
							
							<td colspan="2" >&nbsp;</td>
							<td colspan="2" >
								<input type="submit" id="save" value="Save" />
								<input type="submit" id="next" value="Next" />
							</td>
					</table>
					</div>	
				<%@ include file="footer.jsp"%>	
			</div>
	</body>
</html>