package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
       

protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");	
	PrintWriter out = res.getWriter();
	
	String username=req.getParameter("uname");
	String password=req.getParameter("password");
  
	 if(username.equalsIgnoreCase("veera")&&password.equals("123")) {
	
		 
		 out.println("LOGIN SUCCESSFULLY");
		 
		 RequestDispatcher rd=req. getRequestDispatcher("next"); 
		 rd.forward(req , res);
		 
		 
		}else {
		 out.println("LOGIN FAILED");
		//s res.sendRedirect(req.getContextPath()+"/index.html");
	 }

}

}
