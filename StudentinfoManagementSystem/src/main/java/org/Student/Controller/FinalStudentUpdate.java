package org.Student.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Student.Model.StudentModel;
import org.Student.Service.StudentService;
import org.Student.Service.StudentServiceimpl;

/**
 * Servlet implementation class FinalStudentUpdate
 */
@WebServlet("/FinalStudentUpdate")
public class FinalStudentUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 
		int sid=Integer.parseInt(request.getParameter("sid"));
		    	 String name=request.getParameter("name");
		    	 String email=request.getParameter("email");
		    	 String course=request.getParameter("course");
		    	 String mobile=request.getParameter("mobile");
		    	 StudentModel smodel=new StudentModel();
		    	 smodel.setId(sid);
		    	 smodel.setName(name);
		    	 smodel.setEmail(email);
		    	 smodel.setMobile(mobile);
		    	 smodel.setCourse(course);
		    	 StudentService sservice=new StudentServiceimpl();
		    	 boolean b=sservice.isUpdatestudent(smodel);
		    	 if(b)
		    	 {
		    		RequestDispatcher r=request.getRequestDispatcher("ViewStudent.jsp");
		    		 r.forward(request, response);
		    	 }else {
		    		out.println("<h1>Student data Not Updated</h1>");
		    	 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
