package UseCaseAdmin;

import java.util.List;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Employee;

import Exception.EmployeeException;

public class ViewEmployeeTableForAdmin {

	public static void forAdmin() {
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			List<Employee> res =obj.ViewEmployees();
			System.out.println("||------------------------------------------------------------------------------------------------------------------------------|| \n \n");
			res.forEach( e -> 
			{
			System.out.println(e);
			System.out.println("_________________________________________________________________________________________________________________________________ \n");
			});
			System.out.println("||-------------------------------------------------------------------------------------------------------------------------------|| \n \n");
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
