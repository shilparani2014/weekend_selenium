package testng_Script;

import java.util.Properties;

import org.testng.annotations.Test;

public class Property 
{
@Test
public void test()
{
	Properties p= new Properties();
	p.load(new FileInputStream("./File/p.properties"));
	String url = p.getProperty("url");
	System.out.println(url);
	
}
}
