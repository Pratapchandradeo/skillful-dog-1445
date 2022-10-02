package UseCaseEmployee;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;

public class updatePassword {

	public static void UpdatePassword() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your New Password :");
		String password = sc.nextLine();
		
		
		
		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			String res = obj.updateEmployeePassword(password);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
