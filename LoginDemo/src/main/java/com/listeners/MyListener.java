package com.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements HttpSessionListener, HttpSessionAttributeListener {

    public MyListener() {
        // TODO Auto-generated constructor stub
    }

    public void sessionCreated(HttpSessionEvent se)  { 
       System.out.println("session created.........");
       System.out.println(se.getSession().getId());
    }
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	 System.out.println("session destroyed.........");
   	  	 System.out.println(se.getSession().getId());
    }
    public void attributeAdded(HttpSessionBindingEvent event)  { 
    	System.out.println("Atribute added.........");
    }
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
    	System.out.println("Atribute removed.........");
    }
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
    	 
    }
	
}
