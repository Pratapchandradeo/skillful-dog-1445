package UseCaseAdmin;

import java.util.List;
import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Department;
import Exception.DepartmentException;

public class UpdateLocation {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Department Id Where you want to update the location : ");
		int Did = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the location you want to update :");
		String location = sc.nextLine();
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			String res = obj.updateDeptLocation(Did, location);
			System.out.println(res);
			List<Department> list =obj.DeptTableView();
			list.forEach(d-> System.out.println(d));
			
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
