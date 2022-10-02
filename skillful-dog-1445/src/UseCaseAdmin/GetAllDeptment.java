package UseCaseAdmin;

import java.util.List;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Department;
import Exception.DepartmentException;

public class GetAllDeptment {

	public static void GetAllDeptmentData() {
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			List<Department> dp = obj.DeptTableView();
			System.out.print("+--------+-------------+-------------------+ \n");
			System.out.print("|LEmp_id |   dept_Name |   Dept_location   | \n");
			System.out.print("+--------+-------------+-------------------+ \n");
			for(Department a:dp)
			{
				System.out.println("|    "+a.getid()+"  |       "+a.getDname()+" |         "+a.getLocation()+"      | ");
			}
			System.out.print("+--------+-------------+-------------------+\n");
//			dp.forEach(d -> System.out.println(d));
		} catch (DepartmentException e) {
			e.printStackTrace();
		}

	}

}
