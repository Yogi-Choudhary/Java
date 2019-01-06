package co.in.Constructors;

public class OverloadingExample2 {
	private int rollNum;

	OverloadingExample2() {
		rollNum = 100;
	}

	OverloadingExample2(int rnum) {
		this();
		/*
		 * this() is used for calling the default constructor from parameterized
		 * constructor. It should always be the first statement inside constructor body.
		 */
		rollNum = rollNum + rnum;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public static void main(String args[]) {
		OverloadingExample2 obj = new OverloadingExample2(12);
		System.out.println(obj.getRollNum());
	}
}
