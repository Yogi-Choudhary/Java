package co.in.Encapsulation;

import java.sql.Date;

public class Person {
	private String Name = null;
	private String Address = null;
	private Date DateOfBirth = null;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public void setDateOfBirth(int i) {
		// TODO Auto-generated method stub
		
	}

}
