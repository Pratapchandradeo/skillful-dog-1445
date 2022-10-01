package StartAll;

import java.util.Scanner;

import UseCaseAdmin.AddDataIntoDepartment;
import UseCaseAdmin.AddEmployee;
import UseCaseAdmin.GetAllDeptment;
import UseCaseAdmin.UpdateDepartmentIdinEmp;
import UseCaseAdmin.ViewLeaveTable;
import UseCaseEmployee.ViewEmployeeTable;

public class AdminOptions {
	
	public static void Option()
		
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 1:-add new Departments"
							+ "\n 2:- view Departments"
							+ "\n 3:- Register new Employees "
							+ "\n 4:- View Employee List"
							+ "\n 5:- Update the Employee Department"
							+ "\n 6:- View Leave Request"
							+ "\n 7:- Logout");
		System.out.print("\n Enter the Choice :");
		int choice = sc.nextInt();
		while(true)
		{
			switch(choice)
			{
			case 1:
				AddDataIntoDepartment.main(null);
				break;
			case 2:
				GetAllDeptment.main(null);
				break;
			case 3:
				AddEmployee.main(null);
				break;
			case 4:
				ViewEmployeeTable.main(null);
				break;
			case 5:
				UpdateDepartmentIdinEmp.main(null);
				break;
			case 6:
				ViewLeaveTable.main(null);
				LeaveOptions.Options();
				break;
			case 7:
				selectionOption.selection();
				break;
			default :
				System.out.println("Please Enter Valide Choice");
				break;
					
				
			}
		}
		
		
	}

}
