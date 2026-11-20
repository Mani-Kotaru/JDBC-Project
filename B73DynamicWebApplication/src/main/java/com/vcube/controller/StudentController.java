package com.vcube.controller;

import java.io.IOException;
import java.util.ArrayList;
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


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO sd=new StudentDAO();
		List<StudentModel> list=new ArrayList<>();
		list =sd.getAllStudentsData();
		HttpSession session=request.getSession();
		session.setAttribute("list", list);
		
		 RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		
		
	}

}
