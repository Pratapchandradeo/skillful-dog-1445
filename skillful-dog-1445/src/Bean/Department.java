package Bean;

public class Department {
	
	private int id;
	private String Dname;
	private String Location;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String dname, String location) {
		super();
		this.id = id;
		Dname = dname;
		Location = location;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", Dname=" + Dname + ", Location=" + Location + "]";
	}
	
	
	
	

}
