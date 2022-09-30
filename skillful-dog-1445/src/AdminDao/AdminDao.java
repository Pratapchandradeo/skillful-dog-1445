package AdminDao;

import java.util.List;

import Bean.Department;
import Bean.Employee;
import Bean.Leave;
import Exception.DepartmentException;
import Exception.EmployeeException;
import Exception.LeaveException;

public interface AdminDao {
	
	public String LoginAdmin(String username, String password);
	
	public String AddNewDepartments(String dept_Name, String Dept_location) throws DepartmentException;
	
	public List<Department> DeptTableView()throws DepartmentException;
	public String updateDeptName(int Dept_id,String Dept_name) throws DepartmentException;
	public String updateDeptLocation(int Dept_id,String Dept_location) throws DepartmentException;
	
	public String AddEmployee(Employee employee)throws DepartmentException,EmployeeException;
	
	public String UpdateDepartmentNameInEmployeeTable(String Dept_name,int Emp_id) throws EmployeeException;
	
	public List<Leave> viewLeaveTable()throws LeaveException;
	
	public String LeaveAccept(int LEmp_id) throws LeaveException;
	public String LeaveDeny(int LEmp_id) throws LeaveException;
	
}
