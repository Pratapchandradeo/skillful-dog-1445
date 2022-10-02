package UseCaseEmployee;

import java.util.Scanner;


import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.EmployeeException;
import Exception.LeaveException;

public class LeaveApplyed {

	public static void LeaveApplyedform() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of days you want to Leave : ");
		int days = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the date when you want  leave :(YYYY-mm-dd)");
		String date = sc.nextLine();
		
		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			String res;
			try {
				res = obj.applyForLeave(days, date);
				System.out.println(res);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
		}

	}

}
