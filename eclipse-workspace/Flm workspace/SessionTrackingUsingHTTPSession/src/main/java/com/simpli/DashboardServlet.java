package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		HttpSession httpSession = request.getSession(false);
		
		String userId =null;
				
		if(httpSession!=null) {
			userId = (String) httpSession.getAttribute("userId");
			pw.printf("Welcome %s", userId);
			
		}
		else {
			pw.printf("Welcome %s, there was no http session object <br>", userId);
		}
		
		pw.close();

	}

}