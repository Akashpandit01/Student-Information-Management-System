<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Dashboard</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
    <style>
        * {
            margin: 0;
            padding: 0;
            font-family: 'Poppins', sans-serif;
            box-sizing: border-box;
        }

        body {
            background-color: #f4f6f9;
        }

        .container {
            max-width: 800px;
            margin: 50px auto;
            background: #fff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #2c3e50;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #34495e;
            font-weight: 500;
        }

        input[type="text"],
        input[type="email"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #bdc3c7;
            border-radius: 5px;
            font-size: 16px;
        }

        input[disabled] {
            background-color: #ecf0f1;
            color: #7f8c8d;
        }

        .btn {
            background-color: #2980b9;
            color: white;
            border: none;
            padding: 12px 20px;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        .btn:hover {
            background-color: #1c5980;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Student Dashboard</h2>
        <form action="#">
            <div class="form-group">
                <label>Full Name:</label>
                <input type="text" value="Akash Pandit" disabled>
            </div>

            <div class="form-group">
                <label>Roll Number:</label>
                <input type="text" value="2023CS001" disabled>
            </div>

            <div class="form-group">
                <label>Course:</label>
                <input type="text" value="Computer Science" disabled>
            </div>

            <div class="form-group">
                <label>Email:</label>
                <input type="email" value="akash@example.com">
            </div>

            <div class="form-group">
                <label>Mobile Number:</label>
                <input type="text" value="9876543210">
            </div>

            <button type="submit" class="btn">Update Details</button>
        </form>
    </div>

</body>
</html>