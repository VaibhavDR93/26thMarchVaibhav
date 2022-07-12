package KiteUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class uitilityProperties
{
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\Selenium_Project\\myProporties.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		
	}

}
