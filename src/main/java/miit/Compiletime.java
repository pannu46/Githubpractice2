package miit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Compiletime {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
		File f= new File("C:\\Users\\pannu\\eclipse-workspace\\Gitpractise\\src\\main\\java\\miit\\Non_Exit_File.java");
		FileReader fr = new FileReader(f);
		}
		catch(FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("This is always executed");
		}
		System.out.println("Exception is not handled");

	}

}
