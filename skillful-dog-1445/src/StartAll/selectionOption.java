package StartAll;

import java.sql.SQLException;
import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import UseCaseAdmin.CheckLogin;
import UseCaseEmployee.LoginEmployee;

public class selectionOption {

	private AdminDao admin = new AdminDaoImp();
	private EmployeeDao emp = new EmployeeDaoImp();
	
	public static void selection()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n |~| Please select the option to continue |~| \n");
		System.out.print("--------------------");
		System.out.println("\n ~| 1:- Admin      "
						 + "\n ~| 2:- Empoyee    "
						 + "\n !| 3:- Exit  ");
		System.out.println("--------------------");
		System.out.print("Enter your Role by Chooing Number :~~~: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("|------------------------------------------|");
			System.out.println("|   Welcome to Admin panel please Login    |");
			System.out.println("|------------------------------------------|");
			String str =CheckLogin.checkLogin();
			if(str.equals("Login Successfully ......"))
			{
				System.out.println("Login Successfully ...... \n");
				AdminOptions.Option();
			}
			else
			{
				System.out.println("\n Invalid User name Or password\n");
				selectionOption.selection();
			}
			break;
		case 2:
			System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			System.out.println("|   Welcome to Employee panel please Login |");
			System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			String res = LoginEmployee.main(null);
			if(res.equals("Login Successfully ......"))
			{
				EmployeeOptions.options();
			}
			else
			{
				System.out.println("\n Invalid User name Or password\n");
				selectionOption.selection();
			}
			break;
		case 3:
			Exist.Existmsg();
			System.exit(0);
		default:
			System.out.println("Please Enter valide Choice");
		}
	}
}
