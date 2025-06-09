package org.Student.Repository;

import java.util.ArrayList;
import java.util.List;

import org.Student.Config.DBconfig;
import org.Student.Model.StudentModel;

public class StudentRepositoryImp extends DBconfig implements StudentRepository {
	

	@Override
	public boolean isaddNewStudent(StudentModel model) {

		try {
		
			stmt = conn.prepareStatement("insert into student values('0',?,?,?,?)");
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getEmail());
			stmt.setString(3, model.getMobile());
			stmt.setString(4, model.getCourse());
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception e) {
			System.out.print("error" + e);
			return false;
		}

	}

	@Override
	public List<StudentModel> getAllStudents() {

		try {
			List<StudentModel> list = new ArrayList();
			stmt = conn.prepareStatement("select *from student");
			rs = stmt.executeQuery();
			while (rs.next()) {
				StudentModel model = new StudentModel();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setEmail(rs.getString(3));

				model.setMobile(rs.getString(4));
				model.setCourse(rs.getString(5));
				list.add(model);
			}
			return  list.size()>0?list:null;
		} catch (Exception e) {
			System.out.println("error is "+e);
			return null;
		}

	
	}

	@Override
	public boolean isdeleteStudentById(int sid) {
		try {
			stmt =conn.prepareStatement("delete from  student where id=?");
			stmt.setInt(1, sid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}catch (Exception e) {
			System.out.println("exception is "+e);
		}
		return false;
	}

	@Override
	public boolean isUpdatestudent(StudentModel smodel) {
		 
		try {
			
			System.out.println(smodel.getId()+" "+smodel.getEmail()+" "+smodel.getCourse());
			stmt=conn.prepareStatement("update student set fullname=?,email=?,contact=?,course=? where id=?");
			
			stmt.setString(1, smodel.getName());
			stmt.setString(2, smodel.getEmail());
			stmt.setString(3, smodel.getMobile());
			stmt.setString(4, smodel.getCourse());
			 stmt.setInt(5, smodel.getId());
			 int value=stmt.executeUpdate();
			 return value>0?true:false;
			
		} catch (Exception e) {
			System.out.println("error  is "+e);
			return false;
			
		}
		
		
	}

	@Override
	public int verifyadmin(String username, String Password) {
		
		
		try {
			stmt=conn.prepareStatement("select *from  admin where username=? and  password=?");
			
			stmt.setString(1, username);
			stmt.setString(2, Password);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}else {
				return 0;
			}
		} catch (Exception e) {
		System.out.println("error is"+e);	
		return 0;
		}
		
	}

	@Override
	public int verifyStudent(String email, String mobile) {
		try {
			stmt=conn.prepareStatement("select *from  student where email=? and  contact=?");
			
			stmt.setString(1, email);
			stmt.setString(2, mobile);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}else {
				return 0;
			}
		} catch (Exception e) {
		System.out.println("error is"+e);	
		return 0;
		}
		
	}

}
