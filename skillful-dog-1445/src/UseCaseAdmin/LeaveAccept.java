package UseCaseAdmin;

import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Exception.LeaveException;

public class LeaveAccept {

	public static void LeaveAcceptOp() {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Emp_id you want to accept the Leave :");
		int eid = sc.nextInt();
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			String res = obj.LeaveAccept(eid);
			System.out.println(res);
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
		}

	}

}
