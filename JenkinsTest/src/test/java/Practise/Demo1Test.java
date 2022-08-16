package Practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Demo1Test

{
	@Test
	public void demo1Test() throws Throwable 
	{
		FileInputStream fis=new FileInputStream("./CommonFile.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		System.out.println("Welcome to Jenkins");
		System.out.println(url);
	
		
	}

}
