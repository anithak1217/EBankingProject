<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="detailModification" modelAttribute="modifyaus" method="get">

<table width="600px" height="200px" border=0 align="center" style="background-color:silver;margin-top:10%;text-align:center;">
<tr><td><h2>Customer Detail Modification</h2></td></tr>
<tr><td>Enter Customer Id :</td><td><input type="text" name="id" ></td></tr>
<tr><td><input type="submit" name="Submit" value="Submit"></td></tr>
</table>
</form>
</body>
</html>