package UseCaseAdmin;

import java.util.Scanner;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;

public class CheckLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the userName :");
		String username = sc.nextLine();
		
		System.out.println("Enter the Password :");
		String password = sc.nextLine();
		
		AdminDao ad = new AdminDaoImp();
		String str = ad.LoginAdmin(username, password);
		System.out.println(str);

	}

}
