package UseCaseAdmin;

import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Exception.EmployeeException;

public class UpdateDepartmentIdinEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the new Department Id :");
		int Did = sc.nextInt();
		
		System.out.println("Enter the Employee id where you want to update Department Name :");
		int Eid = sc.nextInt();
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			String res = obj.UpdateDepartmentIdInEmployeeTable(Did, Eid);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
