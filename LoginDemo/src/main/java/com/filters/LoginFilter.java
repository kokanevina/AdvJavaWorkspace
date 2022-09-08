package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginServlet")
public class LoginFilter extends HttpFilter implements Filter {
    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void destroy() {
		System.out.println("in filter destroy");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String uname=request.getParameter("username");
		String password=request.getParameter("pass");
		if(uname.trim().equals("") || password.trim().equals("")) {
			request.setAttribute("errroMessage", "both fields required");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Login.jsp");
			dispatcher.forward(request, response);
		}
		else
			chain.doFilter(request, response); // filter or servlet
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("in filter init");
	}

}
