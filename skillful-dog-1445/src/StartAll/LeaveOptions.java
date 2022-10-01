package StartAll;

import java.util.Scanner;

import UseCaseAdmin.LeaveAccept;
import UseCaseAdmin.LeaveDeny;

public class LeaveOptions {
	
	public static void Options() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("/n 1: Accept Leave Request"
							+ "\n 2:Deny Leave Request"
							+ "\n 3:Go Back"
							+ "\n LogOut");
		System.out.print("\n Enter your Choice : ");
		int choice = sc.nextInt();
		
	while(true)
	{
		switch(choice)
		{
		case 1 :
			LeaveAccept.main(null);
			break;
		case 2:
			LeaveDeny.main(null);
			break;
		case 3:
			AdminOptions.Option();
			break;
		case 4:
			selectionOption.selection();
			break;
		default:
			System.out.println("Please Enter Valid Choice");
			break;
		}
	}
		
	}

}
