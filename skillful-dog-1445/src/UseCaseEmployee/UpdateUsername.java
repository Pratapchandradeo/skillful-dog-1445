package UseCaseEmployee;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;

public class UpdateUsername {

	public static void updateUsername() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your New username :");
		String username = sc.nextLine();
		
		
		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			String res = obj.updateEmployeeUsername(username);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}


	}

}
