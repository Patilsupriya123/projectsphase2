package com.simplilearn.product;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/save")
public class SaveServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String cost=request.getParameter("price");
		int price=Integer.parseInt(cost);
		String quant=request.getParameter("quantity");
		int quantity=Integer.parseInt(quant);
		SessionFactory factory=HibernetUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Product p= new Product(name, price, quantity);
		session.save(p);
		tx.commit();
		session.close();
		response.getWriter().print("<td><h1 align='center'>Data Added Successfully </h1>  <td>");
        
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}