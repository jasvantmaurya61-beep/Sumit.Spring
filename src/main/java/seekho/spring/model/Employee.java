package seekho.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private static final String Iaddress = null;
	private int id;
	private String name,gender;
	@Autowired
	@Qualifier(value = "add2")
	private IAddress address;
	
	 public Employee() {
		 super();
		id=10;
		 System.out.println("Employee.Employee()");
	}
	

	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Employee.Employee(2)");
	}
	
	
	public IAddress getAddress() {
		return address;
	}

	
	public void setAddress(IAddress address) {
		this.address = address;
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
