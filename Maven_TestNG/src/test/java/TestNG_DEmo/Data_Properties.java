package TestNG_DEmo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Data_Properties {
 
	public static void main(String[] args) throws Exception {
		FileReader Reader = new FileReader("Properties\\Data.properties");
		Properties p = new Properties();
		p.load(Reader);
		String uname = p.getProperty("username");
		String pwd = p.getProperty("password");
		String url = p.getProperty("url");
				System.out.println(uname);

		System.out.println(pwd);
	
	}
}
