<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rg1" class="com.sunbeam.beans.RegisterBean"/>
		<jsp:setProperty name="rg1" property="firstname" />
		<jsp:setProperty name="rg1" property="lastname"  />
		<jsp:setProperty name="rg1" property="email"  />
		<jsp:setProperty name="rg1" property="passwd"  />
		<jsp:setProperty name="rg1" property="dob"  />
${rg1.registerUser()}
<c:choose>
<c:when test="${result!=0}">
   <p>Registration Successfull</p>
</c:when>
<c:otherwise>
   <p>something went wrong</p>
</c:otherwise>
</c:choose>
</body>
</html>