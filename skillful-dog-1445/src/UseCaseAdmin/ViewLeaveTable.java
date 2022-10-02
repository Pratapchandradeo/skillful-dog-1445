package UseCaseAdmin;


import java.util.List;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Leave;
import Exception.LeaveException;

public class ViewLeaveTable {

	public static void ViewLeaveTableData(){
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			List<Leave> rs = obj.viewLeaveTable();
			
			rs.forEach( l -> System.out.println(l));
			
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
