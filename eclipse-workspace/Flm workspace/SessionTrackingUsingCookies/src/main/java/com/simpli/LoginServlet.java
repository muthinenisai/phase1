package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userid");
		
		Cookie c1 = new Cookie("userId", userId);
		c1.setMaxAge(30); // remove this cookie after 30 secs. If 0 secs it means delete immediately, after access in the browser
		
		response.addCookie(c1);
		
		response.sendRedirect("dashboard");
	}

}
