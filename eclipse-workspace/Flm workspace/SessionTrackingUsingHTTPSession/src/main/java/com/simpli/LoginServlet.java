package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userId = request.getParameter("userid");
		
		//Create a new HttpSession and put the userid in it.
		HttpSession httpSession = request.getSession();
		
		// request.getSession(true) - here true means, if an http session was created for this user, may be in some other
		// servlet or in this servlet itself some time back, then use that session
		// otherwise create a new session object
		// If request.getSession(false) , means DONT create a new session if there is no session object created anytime before.
		
		httpSession.setAttribute("userId", userId);
		
		
		ShoppingCart sc= new ShoppingCart();
		sc.productNames = new String[]{"Dell", "Phillips TV", "Bajaj 2 wheeler"};
		httpSession.setAttribute("mycart", sc);
		
		
		response.sendRedirect("dashboard");	

	}

}


class ShoppingCart{
	
	String[] productNames;
	
}