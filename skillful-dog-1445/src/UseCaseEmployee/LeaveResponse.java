package UseCaseEmployee;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exception.LeaveException;

public class LeaveResponse {

	public static void LeaveResponseMsg() {

		EmployeeDao obj = new EmployeeDaoImp();
		
		try {
			String msg = obj.LeaveResponse();
			System.out.println(msg);
		} catch (LeaveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
