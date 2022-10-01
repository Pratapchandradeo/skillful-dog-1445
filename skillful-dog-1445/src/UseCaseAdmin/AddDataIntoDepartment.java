package UseCaseAdmin;

import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Exception.DepartmentException;

public class AddDataIntoDepartment {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Department Name :");
	String Dname = sc.nextLine();
	
	System.out.print("Enter the Location :");
	String Dloca = sc.nextLine();
	
	
	AdminDao obj = new AdminDaoImp();
	try {
		System.out.println(obj.AddNewDepartments(Dname, Dloca));
	} catch (DepartmentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	}

}
