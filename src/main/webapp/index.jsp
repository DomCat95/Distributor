
<%@page import="it.unipa.apsw.finalproj.model.User"%>
<%@page import="it.unipa.apsw.finalproj.controller.LoginCtrl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>CoffeDoooom</title>
	<%@ include file="/fragments/f_bootstrap_css_import.html" %>
	<link rel="stylesheet" href="/Distributor/commons/style.css">
</head>
<body>
	<% 
		String username = "";
		User user = (User)session.getAttribute(LoginCtrl.LOGGED_USER_KEY);
		boolean loggedIn = user!=null;
		if(loggedIn){
			username = user.getName()+" "+user.getSurname();
		}
	%>
	
	<%@ include file="/fragments/f_navbar.jsp" %>

	<h1>Hello here</h1>
	


	<%@ include file="/fragments/f_login_modal.html" %>
	
	<!-- DATA HIDDEN FORM -->
	<form action="none" hidden="true">
		<input type="hidden" id="h-i-logged-in" name="loggedIn" value="<%=loggedIn%>">
		<input type="hidden" id="h-i-username" name="username" value="<%=username%>">
	</form>
	
	<!-- SCRIPTS -->
	<%@ include file="/fragments/f_bootstrap_script_import.html" %>
	<script type="text/javascript" src="/Distributor/commons/script.js"></script>
</body>
</html>