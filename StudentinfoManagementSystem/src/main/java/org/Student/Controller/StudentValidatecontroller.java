package org.Student.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.Student.Service.StudentService;
import org.Student.Service.StudentServiceimpl;


@WebServlet("/StudVal")
public class StudentValidatecontroller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		StudentService sservice=new StudentServiceimpl();
		
		
		int result=sservice.verifyStudent(username, password);
		 if(result!=0)
		 {
//			 out.println("Admin log in Success");
			 
			 HttpSession session=request.getSession(true);
			 session.setAttribute("studentid", result);
//			 System.out.println(session.getId());
			   RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
			   r.forward(request, response);
			 
			 
		 }else {
			 out.println("invalid login");
		 }
		  
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
