package com.vcube.controller;

import java.io.IOException;
import java.util.List;

import com.vcube.dao.StudentDAO;
import com.vcube.model.StudentModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		StudentModel sm=new StudentModel();
		sm.setUsername(username);
		sm.setFirstname(firstname);
		sm.setLastname(lastname);
		
		StudentDAO sd=new StudentDAO();
		
		String status=sd.updateStudentByUsername(sm);
		List<StudentModel> list=sd.getAllStudentsData();
		request.setAttribute("info", list);
		if(status.equals("success"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		
	}

}
