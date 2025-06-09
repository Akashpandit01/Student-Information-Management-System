package org.Student.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Student.Model.StudentModel;
import org.Student.Service.*;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/newstudent")
public class StudentController extends HttpServlet {
	StudentService studentService=new StudentServiceimpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
//		out.println("<h1>I Am machine controller</h1>");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String course=request.getParameter("course");
		String mobile=request.getParameter("mobile");
	     StudentModel model=new StudentModel();
	     model.setName(name);
	     model.setCourse(course);
	     model.setEmail(email);
	     model.setMobile(mobile);
	     
	     boolean b=studentService.isAddNewStudedent(model);
	     if(b)
	     {
	    	 out.println("<h1>Register Successfully........</h1>");
	     }else {
	    	 out.println("<h1>some proble is there........</h1>"); 
	     }
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
