package UseCaseAdmin;

import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Exception.DepartmentException;

public class AddDataIntoDepartment {

	public static void AddDataIntoDepartmentTable() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Department Name :");
	String Dname = sc.nextLine();
	
	System.out.print("Enter the Location :");
	String Dloca = sc.nextLine();
	
	
	AdminDao obj = new AdminDaoImp();
	try {
		String res = obj.AddNewDepartments(Dname, Dloca);
		System.out.println(res);
	} catch (DepartmentException e) {
		System.out.println(e.getMessage());
	}
	
	

	}

}
