package EmployeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Employee;
import DB_Utlity.DB_Connection;
import Exception.EmployeeException;
import Exception.LeaveException;


public class EmployeeDaoImp implements EmployeeDao {
static int Emp_id;
	
	//-----------------------------------Employee Login ------------------------------------------
	
	
	@Override
	public String EmployeLogin(String username, String password) {
		String message = "Invalid user";
		try(Connection con = DB_Connection.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("select Emp_username,Emp_password,Emp_id from Employee where Emp_username=? AND Emp_password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
//			String user="",pass="";
//			while(rs.next())
//			{
//				 user = rs.getString("Emp_username");
//				 pass = rs.getString("Emp_password");
//			}
//				
				if(rs.next())
				{
//					if(username.equals(user) && password.equals(pass))
//					{
						Emp_id=rs.getInt("Emp_id");
						message="Login Successfully ......";
//					}
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

	
	
	
	
//-----------------------------------------VIew Employee Table -------------------------------------------------------
	@Override
	public List<Employee> ViewEmployeeable() throws EmployeeException {
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
				String password = rs.getString("Emp_password");
				
				Employee emp = new Employee(id, Ename, EDid,DeptName, salary, username, password);
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

	
	
//----------------------------------Update Name -------------------------------------------------------------------
	
	@Override
	public String updateEmployeeName(String Emp_Name) throws EmployeeException {
		String message ="Not update Name";
		
		try(Connection con = DB_Connection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update Employee set Emp_Name=? where Emp_id=?");
			ps.setString(1, Emp_Name);
			ps.setInt(2,Emp_id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message="Name Updated";
			}
			else
			{
				throw new EmployeeException("Employee id invalid");
			}
			
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		return message;
	}


//-------------------------------------------update password ----------------------------------------------------------


	@Override
	public String updateEmployeePassword(String Emp_password) throws EmployeeException {
			String message ="Not update Password";
		
		try(Connection con = DB_Connection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update Employee set Emp_password=? where Emp_id=?");
			ps.setString(1, Emp_password);
			ps.setInt(2,Emp_id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message="password Updated";
			}
			else
			{
				throw new EmployeeException("Employee id invalid");
			}
			
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		return message;
	}



//--------------------------------------username updated ------------------------------------------------

	@Override
	public String updateEmployeeUsername(String Emp_username) throws EmployeeException {
String message ="username Not update ";
		
		try(Connection con = DB_Connection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("update Employee set Emp_username=? where Emp_id=?");
			ps.setString(1, Emp_username);
			ps.setInt(2,Emp_id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message="username Updated";
			}
			else
			{
				throw new EmployeeException("Employee id invalid");
			}
			
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		return message;
	}



	//-----------------------------------------------apply for leave ----------------------------------------------


	@Override
	public String applyForLeave( int days, String date) throws LeaveException {
		String message = "Not inserted..";
		
		try(Connection con =DB_Connection.provideConnection()) {
			PreparedStatement ps1 = con.prepareStatement("select * from Employee where Emp_id=?");
			ps1.setInt(1, Emp_id);
			ResultSet rs = ps1.executeQuery();
			
			
			if(rs.next())
			{
				PreparedStatement ps = con.prepareStatement("insert into ELeave(LEmp_id,Number_of_day,Date_for_leave) values(?,?,?)");
				ps.setInt(1, Emp_id);
				ps.setInt(2, days);
				ps.setString(3, date);
				
				int x =ps.executeUpdate();
				
				if(x>0)
				{
					message="Leave applyed sucessfully";
				}
				
			}
			else
			{
				throw new LeaveException("Envalid Employee Id");
			}
			
			
			
		} catch (SQLException e) {
			throw new LeaveException(e.getMessage());
		}
		
		
		return message;
	}




}
