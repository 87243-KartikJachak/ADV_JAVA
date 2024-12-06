<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Candidate</title>
</head>
<body>
	<jsp:useBean id="db" class="com.sunbeam.beans.DeleteCandidateBean" />
	<jsp:setProperty name="vb" property="candId" param="candidate"/>
	${ db.deleteCand() }
	<p>Candidate Deleted Successfully!!</p>
</body>
</html>