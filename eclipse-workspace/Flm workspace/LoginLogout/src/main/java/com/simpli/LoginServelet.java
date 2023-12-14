package com.simpli;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServelet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userid");
		HttpSession session = request.getSession();
		session.setAttribute("userid", userId);

		response.sendRedirect("dashboard");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
