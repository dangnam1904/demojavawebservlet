<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search visitor</title>
<link href="css/styles.css" rel="stylesheet">

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
</head>

<body>
	<div id='img'>
		<img src="Image/anh1.jpg" alt="rose flower">
	</div>
	<div class="content">
		<h1 id="title">
			Visitor Information

			<form action="search" method="get">
				<div id="group-form-seach">
					<label style="margin-left:10px;margin-right: 10px; color: black; font-size: 20px;">Fisrt Name</label> 
					<input name="key_search" type="text"> <input type="submit" value="Search"> <span >Type first name and click button search</span>
				</div>
			</form>


		</h1>

		<table class="table table-zebra table-hover">
			<tr>
				<th style="display: none;"></th>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Gender</th>
				<th>Telephone</th>
				<th>You’re in</th>
				<th>Hobbies</th>
				<th>Description</th>
				<th>Amend</th>
			</tr>
			<c:forEach items="${listPersonal}" var="l">
			<tr>
				<td style="display: none;">${l.presonal_id}</td>
				<td>${l.firstname}</td>
				<td>${l.lastname}</td>
				<td>${l.gender}</td>
				<td>${l.mobile}</td>
				<td>${l.nationality }</td>
				<td>${l.hobbies}</td>
				<td>${l.description}</td>
				<td><a href="amend?id=${l.presonal_id }">Amend Personal</td>
			</tr>
			</c:forEach>
			
		</table>
	</div>


</body>
</html>