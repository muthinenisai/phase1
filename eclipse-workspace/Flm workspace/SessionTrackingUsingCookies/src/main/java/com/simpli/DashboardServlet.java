package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();

		Cookie[] cookies = req.getCookies();

		// Extract all the cookies
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {

				pw.printf("Cookie name %s, Cookie value %s <br>", cookies[i].getName(), cookies[i].getValue());
				
				if(cookies[i].getName().equals("userId")) {
					pw.printf("Welcome " + cookies[i].getValue()); 
				}
			}
		} else {
			pw.printf("No cookies found!");
		}

		pw.close();
	}

}
