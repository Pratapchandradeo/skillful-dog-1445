package StartAll;

import java.util.Scanner;

import UseCaseEmployee.UpdateNameOfEmployee;
import UseCaseEmployee.UpdateUsername;
import UseCaseEmployee.updatePassword;

public class UpdateEmployeeOptions {
	
	public static void options()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("*---------------------------------------------*");
			System.out.println("\n |         Employee Update Section             | ");
			System.out.println("*---------------------------------------------*\n");
			System.out.println("\n |:-)| 1:- Update Name "
							 + "\n |:-)| 2:- Update UserName "
							 + "\n |:-)| 3:- Update Password "
							 + "\n |:-)| 4:- Go Back "
							 + "\n |:-)| 5:- Logout"
							 + "\n |:-)| 6:- Exit");
			System.out.println("*---------------------------------------------*\n");
			System.out.print("\n Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					UpdateNameOfEmployee.updateNameOfEmployee();
					break;
				case 2:
					UpdateUsername.updateUsername();
					break;
				case 3:
					updatePassword.UpdatePassword();
					break;
				case 4:
					EmployeeOptions.options();
					break;
				case 5:
					selectionOption.selection();
					break;
				case 6:
					Exist.Existmsg();
					System.exit(0);
				default:
					System.out.println("Please Enter the Valid choice ");
					
			}
		}
	}

}
