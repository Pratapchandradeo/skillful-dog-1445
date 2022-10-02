package StartAll;

import java.util.Scanner;

import UseCaseEmployee.LeaveApplyed;
import UseCaseEmployee.LeaveResponse;
import UseCaseEmployee.ViewEmployeeTable;

public class EmployeeOptions {
	
	public static void options() {
		Scanner sc = new Scanner(System.in);
		boolean run=true;
	 while(true)
		{
		 System.out.println("*---------------------------------------------*");
			System.out.println("\n |~|1:- View Employee Details "
							 + "\n |~|2:- Update Employee Details "
							 + "\n |~|3:- Apply for leave"
							 + "\n |~|4:- Leave Response "
							 + "\n |~|5:- LogOut "
							 + "\n |~|6:- Exit ");
			System.out.println("*---------------------------------------------*\n");
			System.out.print("\n Enter Your choice : ");
			int choice = sc.nextInt();
			System.out.println("\n");
			switch(choice)
			{
				case 1:
					ViewEmployeeTable.ViewEmployeeTableData();;
					break;
				case 2:
					UpdateEmployeeOptions.options();
					break;
				case 3:
					LeaveApplyed.LeaveApplyedform();
					break;
				case 4:
					LeaveResponse.LeaveResponseMsg();
					break;
				case 5:
					selectionOption.selection();
					break;
				case 6:
					Exist.Existmsg();
					System.exit(0);
					break;
				default:
					System.out.println("Please Enter a valide choice");
					break;
					
			}
		}
	}
}
