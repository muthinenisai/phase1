package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userid");
		
		
		// Pass the above userid to the other servlet (dashboard servlet)
		//creating a new hidden form field
		
		PrintWriter out = response.getWriter();
        out.println("<form action='dashboard' method='POST'>");
        out.println("<input type='hidden' name='userid' value='"+userId+"'>");
        out.println("<input type='submit' value='submit' >");
        out.println("</form>");
        out.println("<script>document.forms[0].submit();</script>");
        
        out.close();
		
		
		
	}

}
