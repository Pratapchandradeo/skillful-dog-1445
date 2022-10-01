package UseCaseEmployee;

import java.util.List;

import Bean.Employee;
import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;

public class ViewEmployeeTable {

	public static void main(String[] args) {
		
		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			List<Employee> res =obj.ViewEmployeeable();
			res.forEach( e -> System.out.println(e));
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
