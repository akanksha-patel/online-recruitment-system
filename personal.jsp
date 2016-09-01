<html>
	<head>
		<title>Index Page</title>
		<link rel="stylesheet" type="text/css" href="css/header.css" />
		<link rel="stylesheet" type="text/css" href="css/footer.css" />
		<link rel="stylesheet" type="text/css" href="css/index.css" />
		<link rel="stylesheet" type="text/css" href="css/candimenu.css" />
		<link rel="stylesheet" type="text/css" href="css/personal.css" />
	</head>

	<body >
		<%@ include file="header.jsp" %>
				
		<%@ include file="candimenu.jsp" %>
					
		<div id="main">
			<table  class="personal">
				<tr><td>Name :</td><td><input type="text" name="fullname" /></td></tr>
				<tr><td>Date Of Birth :</td><td><input type="text" name="dob" /></td></tr>
				<tr><td>Marital Status :</td><td><input type="text" name="marital" /></td></tr>
				<tr><td>Nationality :</td><td><input type="text" name="nationality" /></td></tr>
				<tr><td>&nbsp;</td>
					<td><input type="submit" name="reset" value="Reset" />&nbsp;&nbsp;<input type="submit"			name="next" value="Next" />
					</td>
				</tr>
			</table>
				
		</div>
			
		<%@ include file="footer.jsp"%>
		
	</body>
</html>