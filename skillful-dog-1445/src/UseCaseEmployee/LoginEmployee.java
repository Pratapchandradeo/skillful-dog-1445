package UseCaseEmployee;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;

public class LoginEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your username :");
		String username = sc.nextLine();
		
		System.out.println("Enter the password : ");
		String password = sc.nextLine();
		
		EmployeeDao obj = new EmployeeDaoImp();
		String res = obj.EmployeLogin(username, password);
		 
		
		System.out.println(res);
		
		LeaveApplyed.main(null);

	}

}
