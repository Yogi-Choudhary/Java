package co.in.Inheritance;

public class Student extends Person{
	private String rollNo;
	private int make = 0;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}
}
