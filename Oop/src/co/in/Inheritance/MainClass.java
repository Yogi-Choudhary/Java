package co.in.Inheritance;

public class MainClass {
public static void main(String[] args) {
	Shape s = new Shape ();
	
	 s.setColor("red");
	 s.setBorderWidth(5);
	
	 
	 System.out.println("Shape : Color : " + s.getColor());
	 System.out.println("Shape : Border : " + s.getBorderWidth());
	 System.out.println();
	 
	 //Circle Block
	 Circle c = new Circle ();
	 
	 c.setBorderWidth(0);
	 c.setColor("Blue");
	 c.setRadius(3);
	 
	 System.out.println("Circle : " + c.getBorderWidth());
	 System.out.println("Circle : " + c.getColor());
	 System.out.println("Circle : " + c.getRadius());
	 System.out.println(c.area());
	 System.out.println();
	 //Circle Block
	 
	 //Rectangle Block
	 Rectangle r = new Rectangle ();
	 r.setBorderWidth(4);
	 r.setColor("grey");
	 r.setLenght(10);
	 r.setWidth(5);
	 
	 System.out.println("Rectangle : Border : " + r.getBorderWidth());
	 System.out.println("Rectangle : Color : " + r.getColor());
	 System.out.println("Rectangle : Lenght : " + r.getLenght());
	 System.out.println("Rectangle : Width : " + r.getWidth());
	 System.out.println(r.area());
	 System.out.println();
	 
	 //Rectangle Block
	 
	 //Triangle Block
	 Triangle t = new Triangle();
	 t.setColor("Blue");
	 t.setBorderWidth(3);
	 t.setBase(6);
	 t.setHeight(8);
	 
	 
	 System.out.println("Tringle : Color : " + t.getColor());
	 System.out.println("Tringle : Border : " + t.getBorderWidth());
	 System.out.println("Tringle : Base : " + t.getBase());
	 System.out.println("Tringle : Height : " + t.getHeight());
	 System.out.println(t.area());
	 //Triangle Block
	 
	 
}
}
