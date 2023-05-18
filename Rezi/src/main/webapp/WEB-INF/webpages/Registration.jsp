<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>

	<div class="m-5">
	
	<!-- <div class="mb-3">
	<ul class="nav nav-pills">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="home">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Add</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Link</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled">Disabled</a>
  </li>
</ul>
	</div> -->
		
	<h3 class="text-center">Register Student</h3>
	<form action="save-student" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Student Name</label>
			<input type="text" class="form-control" id="name" name="stuName" aria-describedby="nameHelp">
			<div id="nameHelp" class="form-text">Enter Full Name of Student.</div>
		</div>
		<div class="mb-3">
			<label for="course" class="form-label">Course</label>
			<input type="text" class="form-control" id="course" name="course" aria-describedby="courseHelp">
			<div id="courseHelp" class="form-text">Enter a valid Course.</div>
		</div>
		<div class="mb-3">
			<label for="rollNo" class="form-label">Roll No.</label>
			<input type="text" class="form-control" id="rollNo" name="rollNo" aria-describedby="rollnoHelp">
			<div id="rollnoHelp" class="form-text">Enter Roll no of Student.</div>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>
	<!-- <form action="save-student" method="post">	
		<label for="stuName">Enter Name </label>
		<input type="text" name="stuName" id="stuName"><br>
		
		<label for="course">Enter Course </label>
		<input type="text" name="course" id="course"><br>
		
		<label for="rollNo">Enter Rollno </label>
		<input type="text" name="rollNo" id="rollNo"><br>
		
		<input type="submit" value="Add">
	</form> -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>