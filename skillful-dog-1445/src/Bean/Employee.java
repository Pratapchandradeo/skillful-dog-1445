package Bean;

public class Employee {
		
	private int Emp_id;
	private String Emp_Name;
	private int Emp_Dept_id;
	private String Dept_Name;
	private int Emp_salary;
	private String userName;
	private String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_Name, int emp_Dept_id, String dept_Name, int emp_salary, String userName,
			String password) {
		super();
		Emp_id = emp_id;
		Emp_Name = emp_Name;
		Emp_Dept_id = emp_Dept_id;
		Dept_Name = dept_Name;
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

	public int getEmp_Dept_id() {
		return Emp_Dept_id;
	}

	public void setEmp_Dept_id(int emp_Dept_id) {
		Emp_Dept_id = emp_Dept_id;
	}

	public String getDept_Name() {
		return Dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
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
		return "Employee [Emp_id=" + Emp_id + ", Emp_Name=" + Emp_Name + ", Emp_Dept_id=" + Emp_Dept_id + ", Dept_Name="
				+ Dept_Name + ", Emp_salary=" + Emp_salary + ", userName=" + userName + ", password=" + password + "]";
	}

	
	
	
}
