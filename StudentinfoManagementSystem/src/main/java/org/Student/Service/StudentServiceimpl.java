package org.Student.Service;

import java.util.List;

import org.Student.Model.StudentModel;
import org.Student.Repository.StudentRepository;
import org.Student.Repository.StudentRepositoryImp;

public class StudentServiceimpl implements StudentService  {
  
	
StudentRepository s=new StudentRepositoryImp();
	@Override
	public boolean isAddNewStudedent(StudentModel model) {
	   
		return s.isaddNewStudent(model);
	}
	@Override
	public List<StudentModel> getAllStudents() {
		
		return s.getAllStudents();
	}
	@Override
	public boolean isdeleteStudenById(int sid) {
	
		return s.isdeleteStudentById(sid)
				;
	}
	@Override
	public boolean isUpdatestudent(StudentModel smodle) {
		// TODO Auto-generated method stub
		return s.isUpdatestudent(smodle);
	}
	@Override
	public int verifyadmin(String username, String Password) {
		
		return s.verifyadmin(username, Password);
	}
	@Override
	public int verifyStudent(String email, String mobile) {
		
		return s.verifyStudent(email, mobile);
	}

}
