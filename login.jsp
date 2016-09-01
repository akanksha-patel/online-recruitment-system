<html>
	<head>
		<title>Index Page</title>
		<link rel="stylesheet" type="text/css" href="css/header.css" />
		<link rel="stylesheet" type="text/css" href="css/footer.css" />
		<link rel="stylesheet" type="text/css" href="css/mainmenu.css" />
		<link rel="stylesheet" type="text/css" href="css/Home.css" />
		<link rel="stylesheet" type="text/css" href="css/login.css" />
		<script type="text/javascript" src="js/login.js"></script>
	</head>

	<body>
		<div id="main_body">
				<%@ include file="header.jsp" %>
			<div id="menu1">	
				<%@ include file="mainmenu.jsp" %>
			</div>
			<div id="main">
				<% String msg = (String)request.getAttribute("msg"); %>
				<% if(msg!=null){ %>
				<div class="msg" >
					<%= msg %>
				</div>
				<% } %>

			

				<form action="login.do" method="post" id="login_form">
					<table id="login">
						<tr><td id="caption" colspan="3"> Login Here </td></tr>
						<tr>
							<td class="lbl">Email</td>
							<td class="cln">:</td> 
							<td class="txtfldtd"><input type="text" name="email" class="txtfld" id="email" placeholder="Enter your Email" /></td>
						</tr>
						<tr>
							<td class="lbl">&nbsp;</td>
							<td >&nbsp;</td>
							<td class="wmsg" id="email_msg">&nbsp;</td>
						</tr>
						<tr>
							<td class="lbl">Password</td>
							<td class="cln">:</td>
							<td class="txtfldtd"><input type="password" class="txtfld" name="password" id="password" /></td>
						</tr>
						<tr>
							<td class="lbl">&nbsp;</td>
							<td >&nbsp;</td>
							<td class="wmsg" id="password_msg">&nbsp;</td>
						</tr>
						<tr>
							<td class="lbl">&nbsp;</td>
							<td >&nbsp;</td>
							<td id="btn"><input type="submit" name="login" id="sub_btn" value="Login" /></td>
						</tr>
						<tr>
							<td id="warn" colspan="4">* All fields are Maindatory.</td>
						</tr>
					</table>			
				</form>
			</div>
			<%@ include file="footer.jsp"%>
		</div>
	</body>
</html>