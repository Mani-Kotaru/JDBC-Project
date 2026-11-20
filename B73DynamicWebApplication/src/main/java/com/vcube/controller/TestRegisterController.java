package com.vcube.controller;

import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.model.StudentModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/TestRegisterController")
public class TestRegisterController extends HttpServlet {
	//private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String password=request.getParameter("password");
		StudentModel sm=new StudentModel();
		sm.setUsername(username);
		sm.setFirstname(firstname);
		sm.setLastname(lastname);
		sm.setPassword(password);
		StudentDAO sd=new StudentDAO();
		String status=sd.insertStudentData(sm);
		request.setAttribute("user", username);
		if(status.equals("success"))
		{
//			RequestDispatcher rd=request.getRequestDispatcher("testLogin.jsp");
//			rd.forward(request, response);
			response.sendRedirect("testLogin.jsp");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("testIndex.jsp");
			rd.forward(request, response);
		}
	}

}
