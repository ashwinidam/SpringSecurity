<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/SpringSecurity/login/save"
method="post" modelAttribute="logbn"> 
			UserName : <form:input path="userName" value="${logbn.userName }"/> <br><br>
			Password : <form:input type="password" path="password" value="${logbn.password }"/><br><br>
			EmailId : <form:input path="emailId" value="${logbn.emailId }"/><br><br>
			ContactNo : <form:input path="contactNo" value="${logbn.contactNo }"/> <br><br>
			FullName : <form:input path="fullName" value="${logbn.fullName }"/><br><br>
			
			<input type="submit" value="submit">
			
			
			<a href="/SpringSecurity/login/home/gitu/gita">Login Home</a>
			
</form:form>

<! ${allUserBn}  >
<table>
		<tr>
				<th>UserName</th>
				<th>Email-Id</th>
				<th>ContactNo</th>
				<th>Full Name</th>
			<th>Action</th>	
		</tr>
			
			<c:forEach items="${allUserBn}" var="emp">
					<tr>
							<td><c:out value="${emp.logKey.username}"></c:out></td>
							<td><c:out value="${emp.emailId}"></c:out></td>
							<td><c:out value="${emp.contactNo}"></c:out></td>
							<td><c:out value="${emp.fullName}"></c:out></td>
							<td>
								<a href="/SpringSecurity/login/update/${emp.logKey.username}">EDIT</a>
								<a href="/SpringSecurity/login/delete/${emp.logKey.username}">DELETE</a>							
							
							</td>
					</tr>
			</c:forEach>
</table>
</body>
</html>