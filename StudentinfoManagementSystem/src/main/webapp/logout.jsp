<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   
    HttpSession session2 = request.getSession(false);

    // If session exists, invalidate it
    if (session2 != null) {
        session2.invalidate();
    }

    // Redirect to login page after logout
    response.sendRedirect("login.jsp");
%>
