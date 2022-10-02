package StartAll;

import java.util.Scanner;

import UseCaseAdmin.LeaveAccept;
import UseCaseAdmin.LeaveDeny;

public class LeaveOptions {
	
	public static void Options() {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("*---------------------------------------------*");
		System.out.println("\n |=>| 1:Accept Leave Request"
						 + "\n |=>| 2:Deny Leave Request"
						 + "\n |=>| 3:Go Back"
						 + "\n |=>| 4:LogOut"
						 + "\n |=>| 5:Exit");
		System.out.println("*---------------------------------------------*\n");
		
		System.out.print("\n Enter your Choice : ");
		int choice = sc.nextInt();
		
	
		switch(choice)
		{
		case 1 :
			LeaveAccept.LeaveAcceptOp();
			break;
		case 2:
			LeaveDeny.LeaveDenyMsg();
			break;
		case 3:
			AdminOptions.Option();
			break;
		case 4:
			selectionOption.selection();
			break;
		case 5:
			Exist.Existmsg();
			System.exit(0);
		default:
			System.out.println("Please Enter Valid Choice");
			break;
		}
	}
		
	}

}
