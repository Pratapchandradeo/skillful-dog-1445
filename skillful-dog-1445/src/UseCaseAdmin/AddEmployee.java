package UseCaseAdmin;


import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Employee;
import Exception.DepartmentException;
import Exception.EmployeeException;

public class AddEmployee {

	public static void AddEmployeeIn() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee name :");
		String name = sc.nextLine();
		System.out.println("Enter the Department id : ");
		int Did = sc.nextInt();
		
		System.out.println("Enter the salary :");
		int salary = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the User Name of Employee :");
		String username = sc.nextLine();
		
		System.out.println("Enter the password of Employee :");
		String pass = sc.nextLine();
		
		AdminDao obj = new AdminDaoImp();
		
		Employee emp = new Employee();
		
		emp.setEmp_Name(name);
		emp.setEmp_Dept_id(Did);
		emp.setEmp_salary(salary);
		emp.setUserName(username);
		emp.setPassword(pass);
	String result;
	
		try {
			result = obj.AddEmployee(emp);
			System.out.println(result);
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	
	


