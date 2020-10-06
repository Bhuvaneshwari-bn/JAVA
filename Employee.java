package encapsulatiion;

public class Employee {
	
	private int id;
	private String name;
	private float totalSal;
	private float basicSal;
	private float HRA;
	private float DA;
	private Addresss address;
	private float salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}

	public Employee() {
		
	}
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, float basicSal) {
		this.id=id;
		this.name=name;
		this.basicSal=basicSal;
		
	}
	
	public Addresss getAddress() {
		return address;
	}

	public void setAddress(Addresss address) {
		this.address = address;
	}

	public void printEmployee() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
		address.printAddress();
	}

	
	void calculateSalary() {
		HRA=(15/100f)*basicSal;
		DA=(20/100f)*basicSal;
		totalSal=basicSal+HRA+DA;
		System.out.println("Basic Salary = "+basicSal);
		System.out.println("HRA = "+HRA);
		System.out.println("DA = "+DA);
		System.out.println("Total Salary = "+totalSal);
	}

}
