package com.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CollegeServlet
 */
  @WebServlet(
		  urlPatterns = {"/CollegeServlet","/InstituteServlet"},
		  initParams= {
				  @WebInitParam(name="collegeName",value = "IIT"),
				  @WebInitParam(name="contactNumber",value="9898989898")
			} 
		  )
  /*context params can be set only in web.xml*/
public class CollegeServlet extends HttpServlet {
	  ServletConfig config;
	private static final long serialVersionUID = 1L;
       String colName;
       long contactNumber;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollegeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	this.config=config;
    	System.out.println("in init phase......");
    	colName=config.getInitParameter("collegeName");
    	contactNumber=Long.parseLong(config.getInitParameter("contactNumber"));
    	System.out.println(colName+"  "+contactNumber);
    	
    	String comName=config.getInitParameter("companyName");
    	System.out.println("Comany name of CompanyServlet:"+comName);
    	
    	ServletContext context=config.getServletContext();
    	String city=context.getInitParameter("city");
    	System.out.println("Shared Data :"+city);
    	
    	// Initialization parameters cannot be set after the context has been initialized
		//context.setInitParameter("city", "Pune"); 
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(colName+"  "+contactNumber);
		System.out.println(config);
	
		ServletContext context= config.getServletContext();
		System.out.println(context.getInitParameter("city"));
		
		//context.setInitParameter("city", "Pune"); // we can not change after init
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
