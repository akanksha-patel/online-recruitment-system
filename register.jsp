<%@ page import="models.*" %>
<html>
	<head>
		<title>Registration</title>
		<link rel="stylesheet" type="text/css" href="css/header.css" />
		<link rel="stylesheet" type="text/css" href="css/footer.css" />
		<link rel="stylesheet" type="text/css" href="css/mainmenu.css" />
		<link rel="stylesheet" type="text/css" href="css/Home.css" />
		<link rel="stylesheet" type="text/css" href="css/register.css" />
		<script type="text/javascript" src="js/register.js"></script>
	</head>

	<body>
		<div id="main_body">
			<%@ include file="header.jsp" %>
			<div id ="menu1">		
				<%@ include file="mainmenu.jsp" %>
			</div>
			<div id ="main">
				<% String msg = (String)request.getAttribute("msg"); %>
				<% if(msg!=null){ %>
				<div class="msg" >
					<%= "* "+msg %>
				</div>
				<% } %>
			<form action="register.do" method="post" id="register_form">
				<table id="register">
					<tr><td id="cap" colspan="4"> Register Here </td></tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td align="left"><input type="radio" name="register_as" id="candidate" value="<%= UserType.CANDIDATE %>" />Candidate
						<input type="radio" name="register_as" id="company" value="<%= UserType.COMPANY %>" />Company</td>
						<td id="register_msg" class="wmsg">&nbsp;</td>
					</tr>
					<tr>
						<td class="lbl">Name</td>
						<td class="cln">:</td>
						<td class="txtfldtd"><input type="text" class="txtfld" name="name" id="nm" placeholder="Enter your Name" /></td>
						<td id="nm_msg" class="wmsg">&nbsp;</td>
					</tr>
					<tr>
						<td class="lbl">Email</td>
						<td class="cln">:</td>
						<td class="txtfldtd"><input type="text" class="txtfld" name="email" id="eml" placeholder="Enter your Email" /></td>
						<td id="eml_msg" class="wmsg">&nbsp;</td>
					</tr>
					<tr>
						<td class="lbl">Password</td>
						<td class="cln">:</td>
						<td class="txtfldtd"><input type="password" class="txtfld" name="password" id="password" /></td>
							<td class="wmsg" id="password_msg">&nbsp;</td>
					</tr>
					<tr>
						<td class="lbl">Retype Password</td>
						<td class="cln">:</td>
						<td class="txtfldtd"><input type="password" class="txtfld" name="repassword" id="retypepassword" /></td>
						<td class="wmsg" id="retypepassword_msg">&nbsp;</td>
					</tr>
					<tr>
						<td class="lbl">&nbsp;</td>
						<td class="cln">&nbsp;</td>
						<td class="btn"><input type="submit" name="register" id="sub_btn" value="Register" /></td>
						<td class="wmsg">&nbsp;</td>
					</tr>
					<tr>
						<td id="warn" colspan="4">* All fields are Maindatory.</td>
					</tr>
				</table>
			</form>
		</div>
			<%@ include file="footer.jsp"%>
		<div>
	</body>
</html>