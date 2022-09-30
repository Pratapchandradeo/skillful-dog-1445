package UseCaseAdmin;

import java.util.List;
import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Department;
import Exception.DepartmentException;

public class UpdateDepartmentName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Department You want to update : ");
		String Dname = sc.nextLine();
		
		System.out.println("Enter the Department Id wher you want to update :");
		int Did = sc.nextInt();
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			String res = obj.updateDeptName(Did, Dname);
			System.out.println(res);
			List<Department> list =obj.DeptTableView();
			list.forEach(d-> System.out.println(d));
			
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
