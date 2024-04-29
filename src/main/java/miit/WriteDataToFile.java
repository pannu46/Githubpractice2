package miit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			String content  = "This is a content i want to add into file";
		File f = new File("C:\\Users\\pannu\\eclipse-workspace\\Gitpractise\\src\\main\\java\\miit\\Writeintofile.txt");
		FileWriter fw= new FileWriter(f);
		fw.write(content);
		fw.flush();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
     System.out.println("Exception is handled");
	}

}
