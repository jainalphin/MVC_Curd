package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.duo.RegisterDuo;
import com.model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
		User user = new User();
		user.setFname(fname);
		user.setLname(lname);
		user.setUname(uname);
		user.setPass(pass);
	
		int x = new RegisterDuo().doRegisterData(user);
		if(x > 0)
		{
			request.setAttribute("msg", "record inserted.....");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("msg", "record not inserted.....");
			request.getRequestDispatcher("register.jsp").forward(request,response);
		}
	}

}
