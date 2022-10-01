package StartAll;

import java.sql.SQLException;
import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import UseCaseAdmin.CheckLogin;

public class selectionOption {

	private AdminDao admin = new AdminDaoImp();
	private EmployeeDao emp = new EmployeeDaoImp();
	
	public static void selection()
	{
		System.out.println("Please select the option to continue");
		System.out.println("\n 1:- Admin"
						+ "\n 2:- Empoyee ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Welcome to Admin panel please Login");
			String str =CheckLogin.checkLogin();
			if(str.equals("Login Successfully ......"))
			{
				AdminOptions.Option();
			}
			else
			{
				System.out.println("\n Invalid User name Or password\n");
			}
		}
	}
}
