package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.UserImpl;

/**
 * Servlet implementation class MyUserServlet
 */
@WebServlet(urlPatterns = {"/MyUserServlet","/LoginServlet"})
public class MyUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	UserImpl impl=new UserImpl();
	String userAction=request.getParameter("act");
	HttpSession session=request.getSession();
	if(userAction.equalsIgnoreCase("loginAction")) {
		String username=request.getParameter("username");
		String password=request.getParameter("pass");
		
		String name=impl.login(username,password);
		if(name!=null) {
			session.setAttribute("username", username);		
			session.setAttribute("successMessage", "You are logged in Successfully");	
			response.sendRedirect("Home.jsp");
		}
		else {
			request.setAttribute("errroMessage", "Incorrect Username or Password");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Login.jsp");
			dispatcher.forward(request, response);
		}
	}
	}

}
