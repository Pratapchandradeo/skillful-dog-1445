package UseCaseEmployee;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;

public class UpdateNameOfEmployee {

	public static void updateNameOfEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name :");
		String name = sc.nextLine();
		
		
		
		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			String res = obj.updateEmployeeName(name);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
