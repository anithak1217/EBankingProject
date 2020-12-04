<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

</head>

<body>
<br>
<form action="addcus" modeAttribute="cuscre" method="post"">
<table width="600px" height="600px" border=0 align="center" style="background-color:silver;">

	
<tr>
		<td colspan=2  style="font-weight:bold;font-size:20pt;" align="center">Customer Creation Page</td>
		
	</tr>
	<tr>
		<td colspan=2>&nbsp;</td>
		
	</tr>
	<tr>
		<td align="center">Customer Id </td>
		<td><input type="text" name="firstName" ></td>
	</tr>
	<tr>
		<td align="center">First Name </td>
		<td><input type="text" name="firstName" ></td>
	</tr>
	<tr>
		<td align="center"> Last Name </td>
			<td><input type="text" name="lastname" ></td>
	</tr>
	<tr>
		<td align="center">Age</td>
			<td><input type="text" name="age" ></td>
	</tr>
	<tr>
		<td align="center">Gender</td>
		<td><input type="radio" name="g">Male
			<input type="radio" name="g">FeMale
		</td>
	</tr>
	<tr>
		<td align="center">City</td>
			<td><input type="text" name="city" ></td>
	</tr>
	<tr>
		<td align="center">Occupation </td>
			<td><input type="text" name="occ" ></td>
	</tr>
	<tr>
		<td align="center">Contact Number</td>
			<td><input type="text" name="cnum" ></td>
	</tr>
	<tr>
		<td align="center">Account Type</td>
			<td ><select>
			<option value=”se”>SELECT</option>
				<option value=”save”>Savings</option>
				<option value=”curr”>Current</option>
				<option value=”rec”>Recurring</option>
				</select>
			</td>
	</tr>
	<tr>
		<td align="center"><input type="submit" name="Submit" value="clear"></td>
		<td ><input type="submit" name="Submit" value="Proceed"></td>
	</tr>
</table>
</form>
</body>
</html>
<!-- <form:form  action="editCustomer"  modelAttribute="editCustForm">

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
	</form:form> -->


