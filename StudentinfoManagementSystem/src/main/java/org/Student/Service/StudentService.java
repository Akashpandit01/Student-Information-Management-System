package org.Student.Service;

import java.util.*;

import org.Student.Model.StudentModel;

public interface StudentService {
   public boolean  isAddNewStudedent(StudentModel model);
     public List<StudentModel> getAllStudents(); 
     public boolean isdeleteStudenById(int sid);
     public boolean isUpdatestudent(StudentModel smodle );
     public int verifyadmin(String username,String Password);
     public int verifyStudent(String email,String mobile);
}
