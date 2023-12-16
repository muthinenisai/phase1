package filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

public class VotingAgeCheckFilter extends HttpFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Inside VotingAgeCheckFilter doFilter");
		
		PrintWriter pw = response.getWriter();

		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr);

		if (age < 18)
			pw.write("You need to be atleast 18 to vote");
		else
			chain.doFilter(request, response);

		pw.close();

	}

}