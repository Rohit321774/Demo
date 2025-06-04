package Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataInProFiles {
	public static void main(String[] args) throws IOException {
		
	
		FileInputStream fi=new FileInputStream("C:\\Users\\rohit\\git\\rohit\\maven-vtiger-project\\src\\main\\resources\\ExtraExecution\\Data1.properties");
		 
		 Properties pro=new Properties();

		 pro.setProperty("key", "value");
		 pro.setProperty("Username", "Rohit");
		 pro.setProperty("Password", "Rahul");
		 pro.setProperty("Url", "www.com.com");
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\rohit\\git\\rohit\\maven-vtiger-project\\src\\main\\resources\\ExtraExecution\\Data1.properties");
		pro.store(fos,"Data added");
		 System.out.println("DATA ENTERED SuccesFULLY");
	}

}
