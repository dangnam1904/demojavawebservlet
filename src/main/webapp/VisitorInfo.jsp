<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visitor Information</title>
<link href="css/styles.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="Js/validateform.js"></script>
</head>
<body>
	<div id='img'>
		<img src="Image/anh1.jpg" alt="rose flower">
	</div>
	<div class="content">
		<div class="form">
			<h1 id="title">Visitor Information</h1>
			<form name="formValidateRegister" id="formValidateRegister"
				method="post" action="resgister">
				<div class="group-form">
					<label> First Name</label> <input name="fisrtname" id="fisrtname"
						type="text" style="width: 250px" name="firstname">
					<p class="msg" id="error_fisrtname"></p>
				</div>
				<div class="group-form">
					<label> Last Name</label> <input name="lastname" type="text"
						style="width: 250px" id="lastname" name="lastname">
					<p class="msg" id="error_lastname"></p>
				</div>
				<div class="group-form">
					<label>Gender</label> <select name="gender"
						style="margin-left: 20px;">
						<option>Male</option>
						<option>Female</option>
					</select>
				</div>
				<div class="group-form">
					<label> Telephone</label> <input name="telephone"
						style="width: 250px" id="phone" type="text">
					<p class="msg" id="error_phone"></p>
				</div>
				<div class="group-form">
					<label> Email</label> <input name="email" id="email"
						style="width: 250px; margin-left: 27px;" type="email"
						style="margin-left: 28px;">
					<p class="msg" id="error_email"></p>
				</div>
				<div class="group-form">
					<label>You are in: </label>
					<div class="group_radio_checkbox">
						<input name="Location" value="Europe" checked="checked"
							type="radio"> Europe <input name="Location"
							value="Africa" type="radio"> Africa <br> <input
							name="Location" value="Australia " type="radio">
						Australia <input name="Location" value="Asia" type="radio">
						Asia <input name="Location" value="America" type="radio">
						America
					</div>
				</div>
				<div class="group-form">
					<label> What are your hobbies</label>
					<div class="group_radio_checkbox">
						<input name="check-hobbies" value="Swimming" checked="checked"
							type="checkbox"> Swimming <input name="check-hobbies"
							value="Cooking" type="checkbox">Cooking <input
							name="check-hobbies" value="Shopping" type="checkbox">
						Shopping <input name="check-hobbies" value="Sport" type="checkbox">
						Sport <input name="check-hobbies" value="Dance" type="checkbox">
						Dance <input name="check-hobbies" value="hobbies" type="checkbox">
						Sing
					</div>

				</div>
				<div class="group-form">
					<label>Description</label>
					<textarea name="description" id="description" rows="10" cols="50" style="margin-left: 200px;resize: none"></textarea>
					<p class="msg" id="error_description"></p>

				</div>
				<div class="group-form">
					<input id="submit-from-resgiter" style="margin: 0px 350px;"
						type=submit value="Resgiter">
				</div>
				<label class="block clearfix" style="color: red; margin-left: 300px;"> <%=request.getAttribute("msgregister") != null ? request.getAttribute("msgregister") : " "%></label>
			</form>
		</div>
		
		<div class= "help"> 
		<div id="helpRegister">Click a button Help Resgiter to show help
		</div>
		<button id="helpReg">Help Resgiter</button>  <a id="displayPersonal" href="display"> Display Personal</a>
		</div>
	</div>

</body>
</html>