package com.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompanyServlet
 */
/*if no annotations : web.xml : deployment descriptor : servlet, jsp, filters, listeners*/
public class CompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CompanyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	// init parameters of servlets can be get using ServletConfig object
    	String companyNm=config.getInitParameter("companyName");
    	System.out.println(companyNm);
    	String address=config.getInitParameter("headOffice");
    	System.out.println(address);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost");
	}

}
