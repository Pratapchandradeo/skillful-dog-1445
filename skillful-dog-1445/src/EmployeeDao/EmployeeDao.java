package EmployeeDao;

import java.util.List;

import Bean.Employee;
import Exception.EmployeeException;
import Exception.LeaveException;

public interface EmployeeDao {
	
	public String EmployeLogin(String username , String password);
	
	public List<Employee> ViewEmployeeTable() throws EmployeeException ;
	
	public String updateEmployeeName(String  Emp_Name)throws EmployeeException;
	
	public String updateEmployeePassword(String  Emp_password)throws EmployeeException;
	public String updateEmployeeUsername(String  Emp_username)throws EmployeeException;
	
	public String applyForLeave(int days,String date) throws LeaveException,EmployeeException;
	public String LeaveResponse() throws LeaveException;
}
