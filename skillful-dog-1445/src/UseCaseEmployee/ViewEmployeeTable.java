package UseCaseEmployee;

import java.util.List;

import Bean.Employee;
import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;

public class ViewEmployeeTable {

	public static void ViewEmployeeTableData() {
		
		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			List<Employee> res =obj.ViewEmployeeTable();
			System.out.println("||-----------------------------------------------------------------------------------------------------------||\n \n");
			res.forEach( e -> {
				
			System.out.println(e);
			System.out.println("_________________________________________________________________________________________________________________________________ \n");
			});
			System.out.println("||-----------------------------------------------------------------------------------------------------------||\n \n");
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
