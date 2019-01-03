package Bank;

public class TestPerson {
public static void main(String[] args) {
	Person p = null; //declare an object 
	p = new Person (); //Instantiate
	
	//set values
	p.setName("yogi");
	p.setAddress("MG Road");
	//p.setDateOfBirth(15/08/97);
	
	//Get values
	System.out.println("Name : " + p.getName());
	System.out.println("Address : " + p.getAddress());
	
}
}
