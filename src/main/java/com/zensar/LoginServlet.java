package com.zensar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
//    @Override 
//    protected void doGet(HttpServletRequest request,HttpServletResponse response) 
//    throws IOException,ServletException{
//        this.doPost(request,response);
//    }
//	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Testing!!");
		String user=request.getParameter("uname");
		String password=request.getParameter("password");
		if(user.equals("Zensar") && password.equals("Zensar"))
			response.getWriter().print("<h2> Authentication Successfull</h2>");
		else
			response.getWriter().print("<h2> Authentication Failed</h2>");
	}

}
