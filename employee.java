public class Employee {
	private int year;
	private String name,adr;
	public Employee(String name,int year,String adr) {
		this.name = name;
		this.year = year;
		this.adr = adr;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public String getAddress() {
		return adr;
	}
	

public static void main(String[] args) {
	Employee e1 = new Employee("Robert",1994,"64C-WallsStreet");
	Employee e2 = new Employee("Sam",2000,"68D-WallsStreet");
	Employee e3 = new Employee("John",1999,"26B-WallsStreet");
	System.out.println(e1.getName()+"\t"+e1.getYear()+"\t"+e1.getAddress());
	System.out.println(e2.getName()+"\t"+e2.getYear()+"\t"+e2.getAddress());
	System.out.println(e3.getName()+"\t"+e3.getYear()+"\t"+e3.getAddress());
}

}
