package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/gpdemo", "/gp" , "/abc/*"})
public class GetPostDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter(); // CTRL +Shift + O

		pw.write(" Recieved a GET request!. "
				+ "Notice that whatever data you submiited in the form feilds, WILL APPEAR in the browser's address bar!! ");

		pw.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter(); // CTRL +Shift + O

		pw.write(" Recieved a POST request!");

		pw.close();
	}

}
