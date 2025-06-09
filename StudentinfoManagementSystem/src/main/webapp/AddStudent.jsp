<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="CSS/Style.css" rel="stylesheet"/>
<body>
<%@include file="AdminDashboard.jsp" %>
<div class="col py-3">
          <h2 class="mb-4 text-center">Student Registration Form</h2>
    
    <form action="newstudent" method="post" class="border p-4 shadow rounded  control">
      
      <div class="mb-3">
        <label for="name" class="form-label">Full Name</label>
        <input type="text" class="form-control" id="name" name="name" required>
      </div>
      
      <div class="mb-3">
        <label for="email" class="form-label">Email address</label>
        <input type="email" class="form-control" id="email" name="email" required>
      </div>
      
      <div class="mb-3">
        <label for="course" class="form-label">Course</label>
        <input type="text" class="form-control" id="course" name="course" required>
      </div>
      
      <div class="mb-3">
        <label for="mobile" class="form-label">Mobile Number</label>
        <input type="text" class="form-control" id="mobile" name="mobile" required>
      </div>
      
      <button type="submit" class="btn btn-primary w-100">Register</button>
    </form>
        </div>
    </div>
</div>
</body>
</html>