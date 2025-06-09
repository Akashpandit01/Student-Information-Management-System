package org.Student.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Student.Model.StudentModel;
import org.Student.Service.StudentService;
import org.Student.Service.StudentServiceimpl;

@WebServlet("/UpdStud")
public class UpdateStudentConreller extends HttpServlet {   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
//		out.println("<h1>Update Machine Controller</h1>");
		 
		int sid=Integer.parseInt(request.getParameter("sid"));
		String name=request.getParameter("sname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("contact");
		String course=request.getParameter("course");
		
		RequestDispatcher r = request.getRequestDispatcher("AdminDashboard.jsp");
	    r.include(request, response);

		out.println("<div class='col py-3'>");
		out.println("<h2 class='mb-4 text-center'>Update Student Details</h2>");
		out.println("<form action='FinalStudentUpdate' method='post' class='border p-4 shadow rounded control'>");
		out.println("<input type='hidden' class='form-control' id='sid' name='sid' value='" + sid + "' required>");
		out.println("<div class='mb-3'>");
		out.println("<label for='name' class='form-label'>Full Name</label>");
		out.println("<input type='text' class='form-control' id='name' name='name' value='" + name + "' required>");
		out.println("</div>");

		out.println("<div class='mb-3'>");
		out.println("<label for='email' class='form-label'>Email address</label>");
		out.println("<input type='email' class='form-control' id='email' name='email' value='" + email +"' required>");
		out.println("</div>");

		out.println("<div class='mb-3'>");
		out.println("<label for='course' class='form-label'>Course</label>");
		out.println("<input type='text' class='form-control' id='course' name='course' value='" + course +"' required>");
		out.println("</div>");

		out.println("<div class='mb-3'>");
		out.println("<label for='mobile' class='form-label'>Mobile Number</label>");
		out.println("<input type='text' class='form-control' id='mobile' name='mobile' value='" + mobile + "' required>");
		out.println("</div>");

		out.println("<button type='submit'  name='s' class='btn btn-primary w-100'>Update</button>");
		out.println("</form>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		
   
    	 
     }
		
		
		
		
		
	
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
