package com.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
	String companyNm;
    public CompanyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	// init parameters of servlets can be get using ServletConfig object
    	 companyNm=config.getInitParameter("companyName");
    	System.out.println(companyNm);
    	String address=config.getInitParameter("headOffice");
    	System.out.println(address);
    	
    	ServletContext context=config.getServletContext();
    	String city=context.getInitParameter("city");
    	System.out.println("Shared Data: "+city);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
		System.out.println(companyNm);
		ServletContext context=getServletConfig().getServletContext();
		String ct= context.getInitParameter("city");
		System.out.println(ct);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost");
	}

	@Override
	public void destroy() {
		System.out.println(companyNm);
	}
}
