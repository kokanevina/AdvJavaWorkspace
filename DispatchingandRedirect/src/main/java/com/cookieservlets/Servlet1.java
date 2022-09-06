package com.cookieservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.UserImpl;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserImpl impl=new UserImpl();
		PrintWriter pw=response.getWriter();
		String userAction=request.getParameter("act");
		if(userAction.equalsIgnoreCase("loginAction")) {
			String username=request.getParameter("username");
			String password=request.getParameter("pass");
			
			String name=impl.login(username,password);
			String key1="firstName";String key2="username";
			if(name!=null) {
				Cookie ck1=new Cookie(key1,name );
				Cookie ck2=new Cookie(key2, username);
				System.out.println(ck1.getMaxAge()); //-1 : cookies will be deleted when browsing session ends			
				ck1.setMaxAge(60); // in sec
				ck2.setMaxAge(60*60*24*30); // set for 1 month			
				System.out.println(ck1.getMaxAge());
				System.out.println(ck2.getMaxAge());			
				response.addCookie(ck1);
				response.addCookie(ck2);  // cookies stored at browser side			
				response.sendRedirect("Servlet2"); // fresh new request + cookie
			}
			else {
				String message="error";
			    int test[]= {12,45};
			    HttpSession ss=request.getSession();
			    ss.setAttribute("myArray", test);
				//InvalidServlet : url + data : url rewriting
				//? : end or url and start of data key=value
				//+ : strings attached with + url  %
				//& : multiple key value pairs attached with &
				response.sendRedirect("ErrorServlet/InvalidServlet?uname="+username+"&errorMessage="+message);// fresh new get request		
			}			
		}
	}

}
