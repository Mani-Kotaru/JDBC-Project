
package com.vcube.controller;

import java.io.IOException;
import java.util.List;

import com.vcube.dao.StudentDAO;
import com.vcube.model.LoginModel;
import com.vcube.model.StudentModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		LoginModel lm=new LoginModel();
		lm.setUsername(username);
		lm.setPassword(password);
		StudentDAO sd=new StudentDAO();
		
		String status=sd.getStudentData(lm);
		
		List<StudentModel> list=sd.getAllStudentsData();
		HttpSession session=request.getSession();
		session.setAttribute("user", username);
		request.setAttribute("info", list);
		
		if(status.equals("success"))
		{    
			
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}

}
