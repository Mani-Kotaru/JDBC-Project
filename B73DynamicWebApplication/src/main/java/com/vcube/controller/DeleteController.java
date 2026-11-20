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
import jakarta.servlet.http.HttpSession;


@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		StudentDAO sd=new StudentDAO();
		
		HttpSession session=request.getSession();
		session.setAttribute("user", username);
		
		String status=sd.deleteStudentByUsername(username);
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
