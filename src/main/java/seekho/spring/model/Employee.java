package seekho.spring.model;


	abstract public class Employee{
	
	
	
	
	private String name;
	private int age;
	private int salary;
	
	 public Employee() {
		 super();
		 System.out.println("Employee.Employee()");
	}
	
	
	
	Address address;

	public abstract Address applyAddress();
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}


	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
	
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}

	
	

}

