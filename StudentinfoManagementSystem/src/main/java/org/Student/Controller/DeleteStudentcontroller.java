package org.Student.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Student.Service.StudentService;
import org.Student.Service.StudentServiceimpl;

/**
 * Servlet implementation class DeleteStudentcontroller
 */
@WebServlet("/del")
public class DeleteStudentcontroller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");	
	    PrintWriter out=response.getWriter();
	    int sid=Integer.parseInt(request.getParameter("studentid"));
//	    out.println("selected student is"+sid);
	    StudentService Sservice=new StudentServiceimpl();
	    boolean b=Sservice.isdeleteStudenById(sid);
	    
	    if(b)
	    {
	    	RequestDispatcher r=request.getRequestDispatcher("ViewStudent.jsp");
	    	r.forward(request, response);
	    }else {
	    	out.print("<h1>Some Problem is There</h1>");
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
