package com.simplilearn.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter(); 
		 
 	 	HttpSession session= request.getSession(false);  	 	
 	 	if(session!=null) 
 	 	{ 
 	 	 	
 	 		String username=(String) session.getAttribute("key"); 
 	 	
 	 		if(username!=null) 
 	 	{ 
 	 		out.println(" <h1>WELCOME </h1>"+ username ); 
 	 		out.println(" Welcome to Dashboard Page ");
 	 		
 	 		out.print("<a href='logout'>Logout</a>");
 	 		//response.sendRedirect("logout");

 	 	} 
 	 	else 
 	 	{ 
 	 	 	out.print("Kindly Login first"); 
 	 	 	

 	    } 
 	 } 
}
}