package com.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
		System.out.println("Request comes in get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserImpl impl=new UserImpl();
		System.out.println("Request comes in post");	
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
		impl.register(user);
	}

}
