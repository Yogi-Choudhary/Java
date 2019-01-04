package co.in.Exception;

import java.io.FileWriter;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
	      FileWriter file = new FileWriter("//Desktop/Data1.txt");
	      file.write("Guru99");
	      file.close();
	    }
}
