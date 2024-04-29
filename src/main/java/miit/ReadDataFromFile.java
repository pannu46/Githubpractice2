package miit;

import java.io.File;
import java.io.FileReader;

public class ReadDataFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\pannu\\eclipse-workspace\\Gitpractise\\src\\main\\java\\miit\\Compiletime.java");
		
		try {
			FileReader fr = new FileReader(f);
			int character;
			while((character = fr.read())!=-1) {
				System.out.print(character);
			}
			System.out.println("");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exception is handled");

	}

}
