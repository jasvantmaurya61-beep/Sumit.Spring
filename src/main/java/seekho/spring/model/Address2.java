package seekho.spring.model;

import org.springframework.stereotype.Component;

@Component(value = "add2")

public class Address2 implements IAddress{

	public Address2() {
		System.out.println("Address.Address");
	}
  private String city= "Budaun" ;
  private String state = "UP";
  
  
  
  
  public String getCity() {
	return city;
  }
 
  public void setCity(String city) {
	this.city = city;
  }
  public String getState() {
	return state;
  }
  public void setState(String state) {
	this.state = state;
  }
  @Override
  public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
  }
  
}
