package com.vcube.DA;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.vcube.model.Account;
import com.vcube.model.Student;
import com.vcube.model.Test_emp;
import com.vcube.model.Users;
import com.vcube.utility.DBConnection;

public class DataAccess implements DataAccessInterface{
	
	Connection con=null;
	DBConnection db=new DBConnection();
	
	
 //	@Override
//	public void displayEmpBySal(double sal1, double sal2) {
//		try {
//			con=db.getConnection();
//			PreparedStatement ps=con.prepareStatement("select * from test_emp where sal between ? and ?");
//			ps.setDouble(1, sal1);
//			ps.setDouble(2, sal2);
//			ResultSet rs=ps.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4)+" : "+rs.getDate(5)+" : "+rs.getDouble(6)
//				                   +" : "+rs.getInt(7)+" : "+rs.getInt(8));
//				System.out.println();
//			}
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//	@Override
//	public void checkLoginCredentials(Users u) {
//		try {
//			con=db.getConnection();
//			PreparedStatement ps=con.prepareStatement("select * from users where username=? and password=?");
//			ps.setString(1, u.getUsername());
//			ps.setString(2, u.getPassword());
//			ResultSet rs=ps.executeQuery();
//			if(rs.next())
//			{
//				System.out.println("Login Successful !!!");
//			}
//			else
//			{
//				System.out.println("Invalid Credentials !!!");
//			}
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
//		
//	}
//	@Override
//	public void insertEmployee(Test_emp t) {
//		
//		try{
//			con=db.getConnection();
//    	PreparedStatement ps=con.prepareStatement("insert into test_emp values(?,?,?,?,?,?,?,?)");
//    	   ps.setInt(1, t.getEmpno());
//    	   ps.setString(2,t.getEname());
//    	   ps.setString(3, t.getJob());
//    	   ps.setInt(4, t.getMgr());
//    	   ps.setDate(5,t.getHiredate());
//    	   ps.setDouble(6,t.getSal());
//    	   ps.setDouble(7, t.getComm());
//    	   ps.setInt(8,t.getDeptno());
//    	   int rows=ps.executeUpdate();
//    	   if(rows>0)
//    	   {
//    		   System.out.println(rows+"row(s) affected!");
//    	   }
//    	   else
//    	   {
//    		   System.out.println("something went wrong !");
//    	   }
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//	@Override
//	public void selectEmployees() {
//		try
//		{
//			con=db.getConnection();
//  	     PreparedStatement ps=con.prepareStatement("select * from test_emp");
//  	     ResultSet rs=ps.executeQuery();
//  	     while(rs.next())
//  	     {
//  	    	System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4)+" : "+rs.getDate(5)+" : "+rs.getDouble(6)
//           +" : "+rs.getInt(7)+" : "+rs.getInt(8));
//                System.out.println();
//  	     }
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
//	}
//	@Override
//	public void updateEmployeeSalById(Test_emp t) {
//		 
//		try {
//			con=db.getConnection();
// 	     PreparedStatement ps=con.prepareStatement("update test_emp set sal=? where empno=?");
// 	     ps.setDouble(1, 3000.40);
// 	     ps.setInt(2, t.getEmpno());
// 	     int n=ps.executeUpdate();
// 	     if(n>0)
// 	     {
// 	    	 System.out.println(n+"row(s) affected!!");
// 	     }
// 	     else
// 	     {
// 	    	 System.out.println("something went wrong !!");
// 	     }
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
//	}
//	@Override
//	public void deleteEmployeeById(Test_emp t) {
//
//        try {
//        	con=db.getConnection();
//    	     PreparedStatement ps=con.prepareStatement("delete from test_emp where empno=?");
//    	     ps.setInt(1, t.getEmpno());
//    	     int n=ps.executeUpdate();
//    	     if(n>0)
//    	     {
//    	    	 System.out.println(n+"row(s) affected!!");
//    	     }
//    	     else
//    	     {
//    	    	 System.out.println("something went wrong !!");
//    	     }
//        }
//        catch(Exception e)
//        {
//        	System.out.println(e);
//        }
//		
//	}
//	@Override
//	public void displayHighestSal() {
//		try
//		{
//			con=db.getConnection();
// 	     PreparedStatement ps=con.prepareStatement("select max(sal) from test_emp");
// 	     ResultSet rs=ps.executeQuery();
// 	       while(rs.next())
// 	      System.out.println(rs.getDouble(1));
//		}
//		catch(Exception e)
//        {
//     	System.out.println(e);
//		}
//		
//	}
//	@Override
//	public void callProcedure(int fromAccNo,int toAccNo,double amount) {
//		try{
//			con=db.getConnection();
//	        CallableStatement cs=con.prepareCall("{call transfer_money(?,?,?)}");
//	        cs.setInt(1,fromAccNo);
//	        cs.setInt(2,toAccNo );
//	        cs.setDouble(3, amount);
	        
//	        int n=cs.executeUpdate();
//	        if(n>0)
//	        {
//	        	System.out.println("money transferred successfully !!");
//	        }
//	        else
//	        {
//	        	System.out.println("insufficient balance or something went wrong !!");
//	        }
//	        if(!cs.execute())
//	        {
//	        	System.out.println("money transferred successfully!");
//	        }
//
//	}catch(Exception e)
//	{
//	   System.out.println(e);
//	}
//	
//	
//	}
//	@Override
//	public void insertStudent(Student s) throws SQLException {
//		con=db.getConnection();
//		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
//		ps.setInt(1, s.getStudent_id());
//		ps.setString(2, s.getStudent_name());
//		ps.setString(3,s.getCourse());
//		ps.setDouble(4,s.getMarks());
//		int n=ps.executeUpdate();
//		if(n>0)
//		{
//			System.out.println(n+"row(s) affected!");
//		}
//		else
//		{
//			System.out.println("something went wrong!!");
//		}
//		
//	}
	@Override
	public void selectAllStudents() throws SQLException {
		con=db.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();
		boolean status=false;
		while(rs.next()) {
			status=true;
			System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getDouble(4));
			System.out.println();
		}
		if(status==false)
		{
			System.out.println("student not found!!");
		}
	}
	
}
