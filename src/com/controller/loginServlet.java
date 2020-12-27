package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.duo.LoginDuo;
import com.model.User;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		User umodel =new User();
		umodel.setUname(request.getParameter("uname"));
		umodel.setUname(request.getParameter("pass"));
		User user1= new LoginDuo().getLogin(umodel);
		if(user1 != null)
		{
			HttpSession session= request.getSession(true);
			session.setAttribute("uid",user1.getId());
			session.setAttribute("uid",user1.getLname());
			session.setAttribute("uid",user1.getUname());
			session.setAttribute("uid",user1.getFname());
			response.sendRedirect("home.jsp");																																																																																																																																																																																																																																																																																																																																																						
			}
		else
		{
			request.setAttribute("msg", "errror in login....");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}	
	}
}
