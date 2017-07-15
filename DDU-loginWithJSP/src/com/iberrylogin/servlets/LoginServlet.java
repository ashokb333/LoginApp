package com.iberrylogin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iberrylogin.dao.VerifyLogin;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

		/*
		 * String iduserlogin="abc"; String password="abc";
		 * 
		 */

		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int status = 0;
		int flag=1;
		status=VerifyLogin.validate(name, pass,flag);
		if (status == 1) {

			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.include(request, response);

		} else if (status == 2) {
			
			RequestDispatcher rd = request.getRequestDispatcher("WrongPass.jsp");
			rd.include(request, response);
			
		} else if (status == 0) {

			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
