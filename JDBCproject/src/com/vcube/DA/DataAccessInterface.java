package com.vcube.DA;

import java.sql.SQLException;

import com.vcube.model.Account;
import com.vcube.model.Student;
import com.vcube.model.Test_emp;
import com.vcube.model.Users;

public interface DataAccessInterface {
	//public void displayEmpBySal(double sal1,double sal2 );
   // public void checkLoginCredentials(Users u);
	//public void insertEmployee(Test_emp t);
	//public void selectEmployees();
	//public void updateEmployeeSalById(Test_emp t);
	//public void deleteEmployeeById(Test_emp t);
	//public void displayHighestSal();
	//public void callProcedure(int fromAccNo,int toAccNo,double amount);
	//public void insertStudent(Student s) throws SQLException;
	public void selectAllStudents() throws SQLException;
	

}
