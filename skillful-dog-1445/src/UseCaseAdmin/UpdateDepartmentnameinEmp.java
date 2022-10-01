package UseCaseAdmin;

import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Exception.EmployeeException;

public class UpdateDepartmentnameinEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the new Department Name :");
		String Dname = sc.nextLine();
		
		System.out.println("Enter the Employee id where you want to update Department Name :");
		int Eid = sc.nextInt();
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			String res = obj.UpdateDepartmentNameInEmployeeTable(Dname, Eid);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
