package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.UserImpl;
import com.pojo.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request);
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String userAction=request.getParameter("act");
		UserImpl impl=new UserImpl();
		if(userAction.equalsIgnoreCase("registerAction"))
		{
			String name=request.getParameter("myName");	
			int age=Integer.parseInt(request.getParameter("age"));
			long contact=Long.parseLong(request.getParameter("contact"));
			String emailId=request.getParameter("emailid");
			String username=request.getParameter("uname");
			String password=request.getParameter("pass");
			String gender=request.getParameter("gender");
			String location=request.getParameter("loc");
			String interestedCourses[]=request.getParameterValues("course");
		 	List<String> courseList=  Arrays.asList(interestedCourses);	
			User user=new User();
			user.setAge(age); user.setContact(contact);
			user.setCourseList(courseList);
			user.setEmailId(emailId);user.setGender(gender);
			user.setLocation(location);user.setName(name);
			user.setPassword(password); user.setUsername(username);	
			System.out.println(user);
			
			boolean b=impl.register(user);
			if(b)
				pw.print("You are registered successfully.......");
			else
				pw.print("Something went wrong.....");
		}// registerAction
		else if(userAction.equalsIgnoreCase("loginAction")) {
			
			String username=request.getParameter("username");
			String password=request.getParameter("pass");
			
			String name=impl.login(username,password);
			if(name!=null) {
				RequestDispatcher dispatcher=request.getRequestDispatcher("WelcomeServlet"); // urlpattern
				request.setAttribute("firstName", name); // setting new value in same request as parameter
				dispatcher.forward(request, response); // forwarding same req to another servlet
				pw.print("Welcome "+name); // S1 response
			}
			else
				pw.print("Something went wrong");
			
			
			
		}
		else if (userAction.equalsIgnoreCase("changePasswordAction")) {
			// change password
		}
	}

}
