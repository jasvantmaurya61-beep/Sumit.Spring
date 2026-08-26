package seekho.spring.model;

public class child extends parent {
	
	private int age;

	private int salary;
	
	
	
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
		
		return "child [age=" + age + ", salary=" + salary + ", getCompanyName()=" + getCompanyName() + ", getEmpId()="
				+ getEmpId() + "]";
	}

}
