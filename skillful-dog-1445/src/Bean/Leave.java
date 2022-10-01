package Bean;

public class Leave {
	
	private int Emp_id;
	private int number_of_day;
	private String Date;
	private String Status;
	
	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(int emp_id, int number_of_day, String date, String status) {
		super();
		Emp_id = emp_id;
		this.number_of_day = number_of_day;
		Date = date;
		Status = status;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public int getNumber_of_day() {
		return number_of_day;
	}

	public void setNumber_of_day(int number_of_day) {
		this.number_of_day = number_of_day;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Leave [Emp_id=" + Emp_id + ", number_of_day=" + number_of_day + ", Date=" + Date + ", Status=" + Status
				+ "]";
	}
	
	
	
	
	
}
