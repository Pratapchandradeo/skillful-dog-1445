package UseCaseAdmin;

import java.util.List;

import AdminDao.AdminDao;
import AdminDaoImpletation.AdminDaoImp;
import Bean.Department;
import Exception.DepartmentException;

public class GetAllDeptment {

	public static void main(String[] args) {
		
		AdminDao obj = new AdminDaoImp();
		
		try {
			List<Department> dp = obj.DeptTableView();
			dp.forEach(d -> System.out.println(d));
		} catch (DepartmentException e) {
			e.printStackTrace();
		}

	}

}
