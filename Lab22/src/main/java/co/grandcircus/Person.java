package co.grandcircus;

import org.springframework.stereotype.Component;

@Component
public class Person {

	String firstName;
	String lastName;
	String phone;
	String password;
	String emailAddress;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person(String firstName, String lastName, String phone, String password, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.password = password;
		this.emailAddress = emailAddress;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person firstName = " + firstName + ", lastName = " + lastName + ", phone = " + phone + ", password = "
				+ password + ", emailAddress = " + emailAddress;
	}
	
	
	
	
	
	
	
	
	
}
