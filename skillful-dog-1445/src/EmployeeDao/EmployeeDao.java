package EmployeeDao;

import java.util.List;

import Bean.Employee;
import Exception.EmployeeException;
import Exception.LeaveException;

public interface EmployeeDao {
	
	public String EmployeLogin(String username , String password);
	
	public List<Employee> ViewEmployeeable() throws EmployeeException ;
	
	public String updateEmployeeName(String  Emp_Name, int Emp_id)throws EmployeeException;
	
	public String updateEmployeePassword(String  Emp_password, int Emp_id)throws EmployeeException;
	public String updateEmployeeUsername(String  Emp_username, int Emp_id)throws EmployeeException;
	
	public String applyForLeave(int Emp_id,int days,String date) throws LeaveException,EmployeeException;
}
