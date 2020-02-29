package february02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		//openFile("abc.txt");
		myException("chrom");
	}
	
	public static void openFile(String path) throws FileNotFoundException {
		File fh = new File(path);
		FileInputStream io = new FileInputStream(fh);
	}
	
	public static void myException(String browserName) throws Exception {
		if (browserName.equals("chrome")) {
			System.out.println("Browser chrome");
		} else if(browserName.equals("firefox")) {
			System.out.println("Browser firefox");
		} else {
			throw new Exception("Invalid browser name");
		}
		
	}

}
