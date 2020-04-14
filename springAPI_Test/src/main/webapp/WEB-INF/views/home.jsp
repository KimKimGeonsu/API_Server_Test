<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<h2>인설트</h2>
<form action="rest/user/insert" method="post" >
<input name="user_id">
<input name="user_Nm">
<input name="user_mail">
<input name="Re">
<input type="submit" value="인설트">
</form>


<h2>업데이트</h2>
<form action="rest/user/update" method="post">
<input name="user_id">
<input name="user_Nm">
<input name="user_mail">
<input name="Re">
<input type="submit" value="업데이트">
</form>
</body>
</html>
