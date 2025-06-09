package org.Student.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Student.Model.StudentModel;
import org.Student.Service.*;

/**
 * Servlet implementation class SearchStudentController
 */
@WebServlet("/SearchStudent")
public class SearchStudentController extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String query = request.getParameter("query");
	        StudentService studentservice = new StudentServiceimpl();
	        List<StudentModel> list = studentservice.getAllStudents();

	        PrintWriter out = response.getWriter();
	        int count = 0;
	        for (StudentModel s : list) {
	            if (query == null || query.isEmpty() || s.getName().toLowerCase().contains(query.toLowerCase())) {
	                out.println("<tr>");
	                out.println("<th scope='row'>" + (++count) + "</th>");
	                out.println("<td>" + s.getName() + "</td>");
	                out.println("<td>" + s.getEmail() + "</td>");
	                out.println("<td>" + s.getMobile() + "</td>");
	                out.println("<td>" + s.getCourse() + "</td>");
	                out.println("<td><a href='del?studentid=" + s.getId() + "'>Delete</a></td>");
	                out.println("<td><a href='UpdStud?sid=" + s.getId() + "&sname=" + s.getName() + "&email=" + s.getEmail() + "&course=" + s.getCourse() + "&contact=" + s.getMobile() + "'>Update</a></td>");
	                out.println("</tr>");
	            }
	        }
	    }
	}
