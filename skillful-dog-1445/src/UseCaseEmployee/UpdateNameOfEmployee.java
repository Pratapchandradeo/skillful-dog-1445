package UseCaseEmployee;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;

public class UpdateNameOfEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter your Employee id :");
		int eid = sc.nextInt();
		
		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			String res = obj.updateEmployeeName(name, eid);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
