<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  action="editCustomer"  modelAttribute="editCustForm">

	<table>
	<tr>
		<td colspan=2  style="font-weight:bold;font-size:20pt;" align="center">Customer Creation Page</td>
		
	</tr>
	<tr>
		 
		<td><form:hidden path="custid" /></td> 
	</tr>
	<tr>
		<td><form:label path="firstname">First Name</form:label></td>
		<td><form:input path="firstname" /></td> 
	</tr>
	
	<tr>
		<td><form:label path="lastname">Last Name</form:label></td>
		<td><form:input path="lastname" /></td> 
	</tr>
	<tr>
		<td><form:label path="age">Age</form:label></td>
		<td><form:input path="age" /></td> 
	</tr>
	<tr>
		<td><form:label path="gender">Gender</form:label></td>
		<td><form:input path="g" />Female
			<form:input path="g" />Male
		</td> 
	</tr>
	<tr>
		<td><form:label path="city">City</form:label></td>
		<td><form:input path="city" /></td> 
	</tr>
	<tr>
		<td><form:label path="occupation">Occupation</form:label></td>
		<td><form:input path="occupation" /></td> 
	</tr>
	<tr>
		<td><form:label path="contactno">Contact Number</form:label></td>
		<td><form:input path="contactno" /></td> 
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Edit Employee"/>
		</td>
	</table>
	</form:form>
</body>
</html>