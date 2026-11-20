package com.vcube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vcube.model.LoginModel;
import com.vcube.model.StudentModel;
import com.vcube.utility.DBConnection;

public class StudentDAO implements StudentDAOinterface {

	@Override
	public String insertStudentData(StudentModel sm) {
		
		
		String status="fail";
		DBConnection db=new DBConnection();
		Connection con=db.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setString(1, sm.getUsername());
			ps.setString(2, sm.getFirstname());
			ps.setString(3, sm.getLastname());
			ps.setString(4, sm.getPassword());
		    int n =ps.executeUpdate();
		
			if(n>0)
			{
				status="success";
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return status;
	}


	
	
	
	@Override
	public String getStudentData(LoginModel lm) {
	    String status="fail";
		DBConnection db=new DBConnection();
		Connection con=db.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from student where username=? and password=?");
			ps.setString(1, lm.getUsername());
			ps.setString(2, lm.getPassword());
			ResultSet rs=ps.executeQuery();
			int count=0;
			while(rs.next()) {
				count++;
			}
			if(count>0)
			{
				status="success";
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return status;
	}





	@Override
	public List<StudentModel> getAllStudentsData(){
		List<StudentModel> list=new ArrayList<>();
		DBConnection db=new DBConnection();
		Connection con=db.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				StudentModel sm=new StudentModel();
				sm.setUsername(rs.getString(1));
				sm.setFirstname(rs.getString(2));
				sm.setLastname(rs.getString(3));
				sm.setPassword(rs.getString(4));
				list.add(sm);
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return list;
	}
	 public String  deleteStudentByUsername(String username) {
		
		 
		 String status="fail";
			DBConnection db=new DBConnection();
			Connection con=db.getConnection();
			try {
				PreparedStatement ps=con.prepareStatement("delete from student where username=?");
				ps.setString(1, username);
			    int n =ps.executeUpdate();
			    if(n>0)
				{
					status="success";
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			
			return status;
		  }
	 public StudentModel getStudentDataByUsername(String username)
	 {
		 DBConnection db=new DBConnection();
			Connection con=db.getConnection();
			StudentModel sm=null;
			try {
				PreparedStatement ps=con.prepareStatement("select * from student where username=?");
				ps.setString(1, username);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next()) {
					  sm=new StudentModel();
					sm.setUsername(rs.getString(1));
				    sm.setFirstname(rs.getString(2));
					sm.setLastname(rs.getString(3));
					
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			
			return sm;
	 }
	 public String updateStudentByUsername(StudentModel sm)
	 {  
		 String status="fail";
			DBConnection db=new DBConnection();
			Connection con=db.getConnection();
			try {
				PreparedStatement ps=con.prepareStatement("update student set firstname=?,lastname=? where username=? ");
				
				ps.setString(1, sm.getFirstname());
				ps.setString(2, sm.getLastname());
				ps.setString(3, sm.getUsername());
			    int n =ps.executeUpdate();
			
				if(n>0)
				{
					status="success";
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			
			return status;
		 
		 
	 }
	
}
