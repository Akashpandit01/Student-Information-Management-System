<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome - Student Information System</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f4f9fb;
        }

       
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #2193b0;
            padding: 14px 20px;
        }

        .nav-links {
            display: flex;
            gap: 20px;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            font-weight: bold;
            padding: 10px 14px;
        }

        .navbar a:hover {
            background-color: #1b7ea8;
            border-radius: 5px;
        }

        /* Dropdown styles */
        .drpdwn {
            position: relative;
            display: inline-block;
        }

        .drpbtn {
            background-color: #2193b0;
            color: white;
            border: none;
            font-size: 16px;
            padding: 10px 14px;
            cursor: pointer;
            font-weight: bold;
        }

        .drpdwn-a {
            display: none;
            position: absolute;
            right: 0;
            background-color: white;
            min-width: 160px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            z-index: 999;
        }

        .drpdwn-a a {
            color: #2193b0;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }

        .drpdwn-a a:hover {
            background-color: #f1f1f1;
        }

        .drpdwn:hover .drpdwn-a {
            display: block;
        }

        .drpdwn:hover .dropbtn {
            background-color: #1b7ea8;
        }


        .wel {
            text-align: center;
            margin-top: 100px;
            padding: 20px;
        }

        .wel h1 {
            font-size: 36px;
            color: #333;
        }

        .wel p {
            font-size: 18px;
            color: #555;
        }
    </style>
</head>
<body>

    <div class="navbar">
        <div class="nav-links">
            <a href="welcompage.jsp">Home</a>
            <a href="#">About Us</a>
        </div>
        <div class="drpdwn">
            <button class="drpbtn">Login</button>
            <div class="drpdwn-a">
                
                <a href="login.jsp">Admin Login</a>
               <!--   <a href="studentLogin.jsp">Student Login</a>-->
            </div>
        </div>
    </div>

    <div class="wel">
        <h1>Welcome to Student Information Management System</h1>
         <!--  <h3 style="text-align:center; color: red; font-family: Arial; background-color: #fff3cd; padding: 10px; border: 1px dashed red;">
    Website Under Construction 
</h3> -->
    </div>

</body>
</html>
