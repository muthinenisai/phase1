package com.simpli;

import java.io.*;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dashboard() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		HttpSession session = request.getSession(false);
		String userId = null;
		if (session.getAttribute("userid") != null)
			userId = (String) session.getAttribute("userid");
		if (userId == null) {
			out.println("No UserId was found in session.<br>");
		} else {
			out.println("UserId obtained from session :" + userId + "<br>");
			out.println("<a href='logout'>Logout of session</a><br>");
		}
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
