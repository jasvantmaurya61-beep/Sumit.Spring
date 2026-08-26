package seekho.spring.model;

public class Employee {
	
	
	public void xmllnitMethod(){
		System.out.println("Employee XML Init Method Called");
		
	}

	public void xmlDestroyMehod(){
		System.out.println("Employee XML Init Method Called");
		
	}
	
	
	private int id;
	private String name,gender;
	
	private Address address;
	
	 public Employee() {
		 super();
		 System.out.println("Employee.Employee()");
	}
	
	
	public Employee(int id, String name, String gender ,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		System.out.println("Employee.Employee(2)");
	}
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee.getName()");
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		System.out.println("Employee.getGender()");
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	
	

}
