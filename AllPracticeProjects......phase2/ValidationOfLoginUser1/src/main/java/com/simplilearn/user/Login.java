package com.simplilearn.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter(); 
	 	  
 	 	String uname=request.getParameter("uname"); 
 	 	String pass=request.getParameter("pass"); 
 	 	 
 	 	if (uname.equals("supriya") && pass.equals("4444")) 
 	 	{ 
 	 	 	 
 	 	 	HttpSession session= request.getSession();  	 	 	
 	 	 	session.setAttribute("key", uname);  	 	 	
 	 	 	out.println("USER LOGIN");  	 	 	
 	 	 	response.sendRedirect("dashboard"); 
 	 	} 
 	 	else { 
 	 	 	 
 	 	 	out.println("<h1>Login Failed,Enter correct details</h1>"); 
 	 	 	 
 	 	} 

	}

}
