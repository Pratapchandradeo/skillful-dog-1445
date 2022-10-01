package AdminDaoImpletation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import AdminDao.AdminDao;
import Bean.Department;
import Bean.Employee;
import Bean.Leave;
import DB_Utlity.DB_Connection;
import Exception.DepartmentException;
import Exception.EmployeeException;
import Exception.LeaveException;
import UseCaseAdmin.GetAllDeptment;

public class AdminDaoImp implements AdminDao{
	
	
	
	
//---------------------------------LogIn-----------------------------------------------------------//
	@Override
	public String LoginAdmin(String username, String password) {
		String message = "Invalid user";
		try(Connection con = DB_Connection.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("select username,password from Admin where username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			String user="",pass="";
			while(rs.next())
			{
				 user = rs.getString("username");
				 pass = rs.getString("password");
			}
				
				
				if(username.equals(user) && password.equals(pass))
				{
					message="Login Successfully ......";
				}
				else
				{
					message="Invalid Username or Password";
				}
		
			
		} catch (SQLException e) {
			e.printStackTrace();;
		}

		return message;
	}
//--end of login----------------

//	---------------------------------------------------------Insert Data into Department ------------------------------------------------
	
	
	@Override
	public String AddNewDepartments(String dept_Name, String Dept_location) throws DepartmentException {
		String message ="Not inserted in to table";
		
		
		try(Connection con =DB_Connection.provideConnection() ) {
			
			PreparedStatement ps1 = con.prepareStatement("select * from Department where dept_Name=?");
			ps1.setString(1, dept_Name);	
			ResultSet rs = ps1.executeQuery();
			
			if(rs.next() ==false)
			{
				PreparedStatement ps = con.prepareStatement("insert into Department(dept_Name,Dept_location) values(?,?)");
				
				ps.setString(1, dept_Name);
				ps.setString(2, Dept_location);
				
				int x = ps.executeUpdate();
				
				if(x>0)
				{
					message = "Added sucessfully.....";
				}
			}
			else
			{
				throw new DepartmentException("Department alerdy exist");
			}
	
		} catch (SQLException e) {
			throw new DepartmentException(e.getMessage());
		}
		return message;
	}

	

//------------------------------------------------------------end Insert --------------------------------------------------------
	
	@Override
	public List<Department> DeptTableView() throws DepartmentException {
		List<Department> li = new ArrayList<>();
		
		
		try(Connection con = DB_Connection.provideConnection()) {
		PreparedStatement ps = 	con.prepareStatement("select * from Department");
		
		ResultSet rs = ps.executeQuery();
			
		while(rs.next())
		{
			int id = rs.getInt("Dept_id");
			String Dname = rs.getString("dept_name");
			String loc = rs.getString("Dept_location");
			
			Department dept = new Department(id, Dname, loc);
			li.add(dept);
		}
		
		} catch (SQLException e) {
			
			throw new DepartmentException(e.getMessage());
			
		}
		
		if(li.size()==0)
		{
			throw new DepartmentException("No Department found......");
		}
		return li;
		
	}
	
	//----------------------------------end -------------------------------
	
	
//---------------------------------------Update department name by id---------------------------------->
	@Override
	public String updateDeptName(int Dept_id,String Dept_name) throws DepartmentException {
			
			String message = "Not Updated";
		
		
		try(Connection con = DB_Connection.provideConnection()) {
		PreparedStatement ps = 	con.prepareStatement("update Department set dept_Name=? where Dept_id=?");
		ps.setString(1, Dept_name);
		ps.setInt(2, Dept_id);
		
		int x = ps.executeUpdate();
			
		if(x>0)
		{
			message="Department get update";
		}
		
		} catch (SQLException e) {
			
			throw new DepartmentException(e.getMessage());
			
		}
		
		
		return message; 
	}
	
////////////////////////////////////////////END///////////////////////////////////////
	
	//---------------------------------------UPdate Department Location ----------------------------------

	@Override
	public String updateDeptLocation(int Dept_id, String Dept_location) throws DepartmentException {
		String message = "Not Updated";
		
		try(Connection con = DB_Connection.provideConnection()) {
			PreparedStatement ps = 	con.prepareStatement(" update Department set dept_location=? where Dept_id=?");
			ps.setString(1, Dept_location);
			ps.setInt(2, Dept_id);
			
			
			int x = ps.executeUpdate();
				
			if(x>0)
			{
				message="Department get update";
			}
			else
			{
				throw new DepartmentException("Invalide Dept id");
			}
			
			} catch (SQLException e) {
				
				throw new DepartmentException(e.getMessage());
				
			}
			
		
		return message;
	}
//////////////////////////////////////////---------------End-----------------------//////////////////////////
	
	//-------------------------------------------Add Employee in table --------------------------------------
	@Override
	public String AddEmployee(Employee employee) throws DepartmentException,EmployeeException{
		String message = "Not Inserted.....";
		
		
		try(Connection con = DB_Connection.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("insert into Employee(Emp_Name,Emp_Dept_id,Emp_salary,Emp_username,Emp_password) values(?,?,?,?,?)");
			ps.setString(1, employee.getEmp_Name());
			ps.setInt(2, employee.getEmp_Dept_id());
			ps.setInt(3, employee.getEmp_salary());
			ps.setString(4, employee.getUserName());
			ps.setString(5, employee.getPassword());
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message="Employee added to the table";
			}

		} catch (SQLException e) {
			message = e.getMessage();
			
		}

		return message;
	}

	
//	---------------------------------------------------Update Department for particular emp -----------------------------------
	
	@Override
	public String UpdateDepartmentIdInEmployeeTable(int Dept_id, int Emp_id) throws EmployeeException {
		String message = "Not inserted...";
		
		try(Connection con = DB_Connection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update employee set Emp_Dept_id=? where Emp_id=?");
			ps.setInt(1, Dept_id);
			ps.setInt(2, Emp_id);
			
			int x =ps.executeUpdate();
			
			if(x>0)
			{
				message="Table Udated Sucessfully...";
				
			}
			else
			{
				throw new EmployeeException("thre is some input miss match");
			}
			
		} catch (SQLException e) {
			
			message=e.getMessage();
		}
		
		
		
		return message;
	}

	
	//--------------------------------------------------View Leave Table ----------------------------------------------
	@Override
	public List<Leave> viewLeaveTable() throws LeaveException {
		List<Leave> li = new ArrayList<>();
		
		

		try(Connection con = DB_Connection.provideConnection()) {
		PreparedStatement ps = 	con.prepareStatement("select * from ELeave");
		
		ResultSet rs = ps.executeQuery();
			
		while(rs.next())
		{
			int id = rs.getInt("LEmp_id");
			int Days = rs.getInt("Number_of_day");
			String Date = rs.getString("Date_for_leave");
			String status = rs.getString("status");
			
			Leave lev = new Leave(id, Days, Date,status);
			li.add(lev);
		}
		if(li.size()==0)
		{
			throw new LeaveException("No Leave request found......");
		}
		} catch (SQLException e) {
			
			throw new LeaveException(e.getMessage());
			
		}
		
		
	
		return li;
	}

	//------------------------------------------ Leave Accept -------------------------------------------
	@Override
	public String LeaveAccept(int LEmp_id) throws LeaveException {
		String message ="Leave Status not updated";
		
		try(Connection con = DB_Connection.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update ELeave set status='Accept' where LEmp_id=?");
			ps.setInt(1, LEmp_id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message="Leave accepted";
			}
			else
			{
				throw new LeaveException("Check the Leave Employee id ");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return message;
	}
//--------------------------------------------------Leave request Deny =--------------------------------------------
	
	@Override
	public String LeaveDeny(int LEmp_id) throws LeaveException {
			String message ="Leave Status not updated";
		
		try(Connection con = DB_Connection.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update ELeave set status='Deny' where LEmp_id=?");
			ps.setInt(1, LEmp_id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message="Leave Deny";
			}
			else
			{
				throw new LeaveException("Check the Leave Employee id ");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return message;
	}

	@Override
	public List<Employee> ViewEmployees() throws EmployeeException {
		List<Employee> li = new ArrayList<>();
		
			try(Connection con = DB_Connection.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("select Emp_id,Emp_Name,Emp_Dept_id,dept_Name,Emp_salary,Emp_username,Emp_password from Employee e INNER JOIN Department d on d.dept_id =e.Emp_Dept_id;");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("Emp_id");
				String Ename = rs.getString("Emp_Name");
				int EDid = rs.getInt("Emp_Dept_id");
				String DeptName = rs.getString("dept_Name");
				int salary = rs.getInt("Emp_salary");
				String username = rs.getString("Emp_username");
//				String password = rs.getString("*********");
				
				Employee emp = new Employee(id, Ename, EDid,DeptName, salary, username, "*******");
				li.add(emp);
			}
		
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		if(li.size()==0)
		{
			throw new EmployeeException("There is no Employee..");
		}
		
		
		
		
		
		
		return li;
	}

	
	
	

	
}
