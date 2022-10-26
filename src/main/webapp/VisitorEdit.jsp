<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visitor Information</title>
<link href="css/styles.css" rel="stylesheet">

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
<script type="text/javascript" src="Js/handelform.js"></script>
</head>
<body>
	<div id='img'>
		<img src="Image/anh1.jpg" alt="rose flower">
	</div>
	<div class="content">
		<h1 id="title">Visitor Information</h1>
		<form name="formValidateRegister" id="formValidateRegister" class="formValidateRegister" method="post" action="">
			<input style="display: none" name="personal_id" value="${pers.presonal_id }" >
			<div class="group-form">
				<label> First Name</label> <input name="fisrtname" value="${pers.firstname }" type="text" style="width: 250px"
					name="firstname">
			</div>
			
			<div class="group-form">
				<label> Last Name</label> 
				<input name="lastname" value="${pers.lastname}"  type="text" style="width: 250px" name="lastname">
			</div>
			<div class="group-form">
				<label>Gender</label> <select value="${pers.gender}"  name="gender" style="margin-left: 20px;">
					<option>Male</option>
					<option>Female</option>
				</select>
			</div>
			<div class="group-form">
				<label> Telephone</label> <input value="${pers.mobile }" name="telephone" style="width: 250px" type="number">
			</div>
			<div class="group-form">
				<label> Email</label> <input name="email"
					style="width: 250px; margin-left: 27px;"  value="${pers.email }" type="email"
					style="margin-left: 28px;">
			</div>
			<div class="group-form">
				<label>You are in: </label>
				<div class="group_radio_checkbox">
					<input name="Location" value="Europe" checked="checked" type="radio"> Europe 
					<input name="Location" value="Africa" type="radio"> Africa <br> 
					<input name="Location" value="Australia " type="radio" style=""> Australia 
					<input name="Location" value="Asia" type="radio"> Asia 
					<input name="Location" value= "America" type="radio"> America
				</div>
			</div>
			<div class="group-form">
				<label> What are your hobbies</label>
				<div class="group_radio_checkbox">
					<input name="check-hobbies" value="Swimming" checked="checked" type="checkbox"> Swimming
					<input name="check-hobbies" value="Cooking" type="checkbox">Cooking 
					<input name="check-hobbies" value="Shopping" type="checkbox"> Shopping
					<input name="check-hobbies" value="Sport" type="checkbox"> Sport 
					<input name="check-hobbies" value="Dance" type="checkbox"> Dance 
					<input name="check-hobbies" value="hobbies" type="checkbox"> Sing
				</div>
			</div>
			<div class="group-form">
				<label>Description</label>
				<textarea name="description" rows="10" cols="50" style="margin-left: 200px";>${pers.description }</textarea>
			</div>
			<div class="group-button">
				<input class="submit-form"  name="submit-form" type="submit" value="Update"  formaction="${pageContext.request.contextPath}/Personal?action=update">
			
				<input class="submit-form" name="submit-form"  type=submit value="Delete" formaction="${pageContext.request.contextPath}//Personal?action=delete">
			
				<input class="submit-form" name="submit-form"  type=submit value="Cancel" formaction="${pageContext.request.contextPath}//Personal?action=cancel">
			</div>
			<label class="block clearfix" style="color: red;margin-left: 300px;"> <%=request.getAttribute("msgregister") != null ? request.getAttribute("msgregister") : " "%>
		</form>

	</div>

</body>
</html>