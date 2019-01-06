package co.in.Constructors;

public class ChildClass1 {
	ChildClass1() {
		/*
		 * Compile implicitly adds super() here as the first statement of this
		 * constructor.
		 */
		System.out.println("Constructor of child class");
	}

	ChildClass1(int num) {
		/*
		 * Even though it is a parameterized constructor. The compiler still adds the
		 * no-arg super() here
		 */
		System.out.println("arg constructor of child class");
	}

	void display() {
		System.out.println("Hello!");
	}

	public static void main(String args[]) {
		/*
		 * Creating object using default constructor. This will invoke child class
		 * constructor, which will invoke parent class constructor
		 */
		ChildClass1 obj = new ChildClass1();
		// Calling sub class method
		obj.display();
		/*
		 * Creating second object using arg constructor it will invoke arg constructor
		 * of child class which will invoke no-arg constructor of parent class
		 * automatically
		 */
		ChildClass1 obj2 = new ChildClass1(10);
		obj2.display();
	}
}
