<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Voting Result</h2>
	<jsp:useBean id="rb" class="com.sunbeam.beans.ResultBean" />
	${rb.fetchCandidates()}
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Party</th>
				<th>Votes</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${rb.candList}">
				<tr>
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td>${c.party}</td>
					<td>${c.votes}</td>
					<td>
						<a href="editcand.jsp?id=${c.id}">
							<img src="Images/edit.png" alt="Edit" width="20" height="20"/>
						</a>
						<a href="delcand.jsp?id=${c.id}">
							<img src="Images/delete.png" alt="Delete" width="20" height="20"/>
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<p>${param.msg}</p>
	<p>
	<a href="logout.jsp">Sign Out</a>
	</p>	
</body>
</html>