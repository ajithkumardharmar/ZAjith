package durgasoft.Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fs = new FileInputStream("D:\\javaTest.properties");
		p.load(fs);
		System.out.println(p);
		String name = p.getProperty("name");
		System.out.println(name);
		p.setProperty("Role", "JavaDeveloper");
		FileOutputStream fo = new FileOutputStream("D:\\javaTest.properties");
		p.store(fo, "Update by Ajith");
		
	}
}
