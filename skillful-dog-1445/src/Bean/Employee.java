package Bean;

public class Employee {
		
	private int Emp_id;
	private String Emp_Name;
	private String Emp_Dept_Name;
	private int Emp_salary;
	private String userName;
	private String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_Name, String emp_Dept_Name, int emp_salary, String userName,
			String password) {
		super();
		Emp_id = emp_id;
		Emp_Name = emp_Name;
		Emp_Dept_Name = emp_Dept_Name;
		Emp_salary = emp_salary;
		this.userName = userName;
		this.password = password;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getEmp_Dept_Name() {
		return Emp_Dept_Name;
	}

	public void setEmp_Dept_Name(String emp_Dept_Name) {
		Emp_Dept_Name = emp_Dept_Name;
	}

	public int getEmp_salary() {
		return Emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		Emp_salary = emp_salary;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", Emp_Name=" + Emp_Name + ", Emp_Dept_Name=" + Emp_Dept_Name
				+ ", Emp_salary=" + Emp_salary + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
