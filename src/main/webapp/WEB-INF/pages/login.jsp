
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>  
.error{color:red}  
</style> 
</head>
<body>

<sf:form action="loginSuccessForm"  modelAttribute="custlogin"  method="get">
<table width="500px" height="300px" align="center" style="background-color:silver; padding:10px 30px; margin-top:10%">
<tr>
 <td>&nbsp;</td>
</tr>
<tr>
 <td style="font-weight:bold;font-size:20pt;" align="center">Member Login</td>
</tr>
<tr><td>UserName:</td>
	<td><input type="text" name="uname"/> </td>
</tr>
<tr><td>Password:</td>
	<td><input type="password" name="pwd"/>	</td>
</tr>  
	<tr><td colspan="2"> <input type="submit" value="submit" /></td></tr>  
</table>
</sf:form>
</body>
</html>