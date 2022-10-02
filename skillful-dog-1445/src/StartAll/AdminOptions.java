package StartAll;

import java.util.Scanner;

import UseCaseAdmin.AddDataIntoDepartment;
import UseCaseAdmin.AddEmployee;
import UseCaseAdmin.GetAllDeptment;
import UseCaseAdmin.UpdateDepartmentIdinEmp;
import UseCaseAdmin.ViewEmployeeTableForAdmin;
import UseCaseAdmin.ViewLeaveTable;
import UseCaseEmployee.ViewEmployeeTable;

public class AdminOptions {
	
	public static void Option()
		
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("*---------------------------------------------*");
		System.out.println(" *| 1:- add new Departments"
						 + "\n *| 2:- view Departments"
						 + "\n *| 3:- Register new Employees "
						 + "\n *| 4:- View Employee List "
						 + "\n *| 5:- Update the Employee Department "
						 + "\n *| 6:- View Leave Request "
						 + "\n *| 7:- Logout"
						 + "\n *| 8:- Exit ");
		System.out.println("*----------------------------------------------------*");
		System.out.print("\n Enter the Choice :~:");
		int choice = sc.nextInt();
		
			switch(choice)
			{
			case 1:
				AddDataIntoDepartment.AddDataIntoDepartmentTable();;
				break;
			case 2:
				GetAllDeptment.GetAllDeptmentData();
				break;
			case 3:
				AddEmployee.AddEmployeeIn();
				break;
			case 4:
				ViewEmployeeTableForAdmin.forAdmin();
				break;
			case 5:
				UpdateDepartmentIdinEmp.UpdateDepartmentIdinEmpTable();
				break;
			case 6:
				ViewLeaveTable.ViewLeaveTableData();
				LeaveOptions.Options();
				break;
			case 7:
				selectionOption.selection();
				break;
			case 8:
				Exist.Existmsg();
				System.exit(0);
				break;
			default :
				System.out.println("Please Enter Valide Choice");
				break;
					
				
			}
		}
		
		
	}

}
