package co.in.Constructors;

public class ConstructorExample {
	
		String name;
		int id;
		ConstructorExample(){
			this.name = "yoyo";
			this.id = 2;
		}
		public static void main(String[] args) {
			ConstructorExample c = new ConstructorExample();
			System.out.println(c.name);
			System.out.println(c.id);
		}
	
}
