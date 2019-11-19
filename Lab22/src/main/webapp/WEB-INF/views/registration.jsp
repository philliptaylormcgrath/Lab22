<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/darkly/bootstrap.min.css" rel="stylesheet" integrity="sha384-w+8Gqjk9Cuo6XH9HKHG5t5I1VR4YBNdPt/29vwgfZR485eoEJZ8rJRbm3TR32P6k" crossorigin="anonymous">
</head>
<body>
<body>
	<div class="container">
	<div id="requestedInfo">

<h1>${personTest}</h1>
<h1> This is using @RequestParams</h1>
<form action="add-person" method="post" onsubmit= "return validateInput()">
First Name: <input type="text" name = "first" required minlength="2"><br>
Last Name: <input type="text" name = "last"required minlength="2"><br>
Phone Number : <input type="text" name = "phone"required minlength="10"><br>
Email Address : <input type="text" name = "emailAddress"required minlength="7"><br>
Password: <input type="text" name = "password"required minlength="7"><br>

<input class ="btn-primary" type="submit" value ="Submit">

</form>



</div>
</div>
</body>
</html>