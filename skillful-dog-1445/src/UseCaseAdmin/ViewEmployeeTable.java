package UseCaseAdmin;

import java.util.List;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Employee;

import Exception.EmployeeException;

public class ViewEmployeeTable {

	public static void main(String[] args) {
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			List<Employee> res =obj.ViewEmployees();
			res.forEach( e -> System.out.println(e));
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
