package com.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
/*Servlets : Server side Programs, controller between view and model
 * Servlet : life cycle : init, service, destroy given by:  Servlet Interface
 * 
 * HttpServlet : doGet, doPost, doPut, doDelete : newly added in HttpServlet
 * 
 * init : once 
 * Service : multiple times , servlet is ready to accept n request, 
 * service intern calls either doGet, doPost, doPut, doDelete depends on http request coming from view
 * destroy : once : when servers stops, server down
 * */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@WebServlet("/vinaservlet")*/
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DemoServlet() {
       System.out.println("in constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("Servlet init phase.. do the settings that u want to do once");
    	System.out.println("bcz init called only once : on user's 1st request, first");
    }
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Service Phase. it will be called on http GET request");
		System.out.println("it is called on every user get request");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Service Phase. it will be called on http POST request");
		System.out.println("it is called on every user post request");
	}

	
	@Override
	public void destroy() {
		System.out.println("Servlet destroy phase... release the resource that u want to release in the end phase of servlet ");
		System.out.println("it is called once, last");
	}
}
