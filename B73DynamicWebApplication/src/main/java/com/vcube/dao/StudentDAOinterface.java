package com.vcube.dao;

import java.util.List;

import com.vcube.model.LoginModel;
import com.vcube.model.StudentModel;

public interface StudentDAOinterface {
	  public String insertStudentData(StudentModel lm);
      public String getStudentData(LoginModel lm);
      public List<StudentModel> getAllStudentsData();
      public String  deleteStudentByUsername(String username);
      public StudentModel getStudentDataByUsername(String username);
      public String updateStudentByUsername(StudentModel sm);
}
