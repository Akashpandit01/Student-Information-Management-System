package org.Student.Repository;

import java.util.List;

import org.Student.Model.StudentModel;

public interface StudentRepository {
 public boolean isaddNewStudent(StudentModel model);
 public List<StudentModel> getAllStudents();
 public boolean isdeleteStudentById(int sid);
 public boolean isUpdatestudent(StudentModel smodel);
 public int verifyadmin(String username,String Password);
 public int verifyStudent(String email,String mobile);
 
}
