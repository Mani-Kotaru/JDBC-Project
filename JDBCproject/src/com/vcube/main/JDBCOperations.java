package com.vcube.main;


import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

import com.vcube.DA.DataAccess;
import com.vcube.model.Student;
import com.vcube.model.Test_emp;
import com.vcube.model.Users;

public class JDBCOperations {

	public static void main(String[] args) throws SQLException {
//      try {
//    	  DataAccess da=new DataAccess();
//    	  da.displayEmpBySal(2000,5000 );
//      }
//      catch(Exception e)
//      {
//    	  System.out.println(e);
//      }
		Scanner sc=new Scanner(System.in);
//		  try {
//	    	  DataAccess da=new DataAccess();
//	    	  
//	    	  System.out.println("enter username : ");
//	    	  String uname=sc.next();
//	    	  System.out.println("enter password : ");
//	    	  String pswd=sc.next();
//	    	  
//	    	  Users u=new Users();
//	    	  u.setUsername(uname);
//	    	  u.setPassword(pswd);
//	    	 da.checkLoginCredentials(u);
//	      }
//	      catch(Exception e)
//	      {
//	    	  System.out.println(e);
//	      }
//		try {
//			 DataAccess da=new DataAccess();
//			 Test_emp t=new Test_emp();
//			 t.setEmpno(103);
//			 t.setEname("Priya");
//			 t.setJob("Data Engineer");
//			 t.setMgr(107);
//			 Date date= Date.valueOf("2024-10-8");
//			 t.setHiredate(date);
//			 t.setSal(3000.80);
//			 t.setComm(250.78);
//			 t.setDeptno(10);
//			 da.insertEmployee(t);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
////		
//		try {
//			DataAccess da=new DataAccess();
//			 Test_emp t=new Test_emp();
//			 t.setEmpno(102);
//			 t.setEname("mani");
//			 t.setJob("analyst");
//			 t.setMgr(107);
//			 Date date= Date.valueOf("1989-12-23");
//			 t.setHiredate(date);
//			 t.setSal(66550);
//			 t.setComm(250.78);
//			 t.setDeptno(10);
//			
//			
//			da.deleteEmployeeById(t);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
//		DataAccess da=new DataAccess();
//		da.displayHighestSal();
//	System.out.println("enter from account no : ");
//	 int fromAccNo=sc.nextInt();
//	System.out.println("enter to account no : ");
//	 int toAccNo=sc.nextInt();
//	 System.out.println("enter amount to transfer : ");
//	 double amount=sc.nextDouble();
//	 DataAccess da=new DataAccess();
//	   da.callProcedure(fromAccNo, toAccNo, amount);
		
//		Student s=new Student();
//		s.setStudent_id(105);
//		s.setStudent_name("Uma");
//		s.setCourse("JFS");
//		s.setMarks(85);
//		DataAccess da=new DataAccess();
//		da.insertStudent(s);
		DataAccess da=new DataAccess();
		da.selectAllStudents();
	}

}
