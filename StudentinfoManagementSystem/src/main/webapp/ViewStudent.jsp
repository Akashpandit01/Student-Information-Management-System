<%@page import="org.Student.Model.StudentModel"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.Student.Service.*,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
    body {
        background-color: #f8f9fa;
    }
    .table-container {
        margin: 40px auto;
        width: 80%;
        background: #ffffff;
        padding: 20px;
        border-radius: 12px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        overflow-x: auto;
    }
    .table-heading {
        text-align: center;
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 20px;
        color: #343a40;
    }
    .table thead {
        background-color: #343a40;
        color: white;
    }
    .table-hover tbody tr:hover {
        background-color: #f1f1f1;
        cursor: pointer;
    }
    /* Responsive CSS */
    @media (max-width: 768px) {
        .table-container {
            width: 95%;
            padding: 10px;
        }
        .table {
            display: block;
            width: 100%;
            overflow-x: auto;
            white-space: nowrap;
        }
    }
</style>
<script>
function searchStudent() {
    const query = document.getElementById("searchInput").value;

    const xhr = new XMLHttpRequest();
    xhr.open("GET", "SearchStudent?query=" + encodeURIComponent(query), true);
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            document.getElementById("sbody").innerHTML = xhr.responseText;
        }
    };
    xhr.send();
}
</script>

</head>
<body>
<%!
StudentService studentservice=new StudentServiceimpl();
%>
<%@include file="AdminDashboard.jsp" %>
<div class="col py-3">
<div class="table-container">
    <div class="table-heading">Student Details</div>
            <input type="text" id="searchInput" class="form-control" placeholder="Search by student name" onkeyup="searchStudent()" />
    
    <table class="table table-bordered table-striped table-hover">
     <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th scope="col">Sr.No</th>
                            <th scope="col">Full Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Contact</th>
                            <th scope="col">Course</th>
                            <th scope="col">Update</th>
                            <th scope="col">Delete</th>
                        </tr>
                    </thead>
                    <tbody id='sbody'>
                    
                    <%
                    
                    List<StudentModel> list =studentservice.getAllStudents();
                      int count=0;
                    for(StudentModel s:list)
                    {
                    	%>
                    	 <tr>
                            <th scope="row"><%=++count %></th>
                            <td><%=s.getName() %></td>
                            <td><%=s.getEmail() %></td>
                            <td><%=s.getMobile() %></td>
                             <td><%=s.getCourse() %></td>
                              <td><a href="del?studentid=<%=s.getId()%>">Delete</a></td>
                               <td><a href="UpdStud?sid=<%=s.getId()%>&sname=<%=s.getName()%>&email=<%=s.getEmail()%>&course=<%=s.getCourse()%>&contact=<%=s.getMobile()%>">Update</a></td>
                               
                        </tr>
                    	<% 
                    }
                   %>
                       
                        
                    </tbody>
                </table> 
                </div>
        </div>
    </div>
</div>
</body>
</html>