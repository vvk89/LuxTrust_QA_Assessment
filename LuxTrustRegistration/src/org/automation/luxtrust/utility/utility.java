package org.automation.luxtrust.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utility {
	public static Object fetchproperty(String key ) throws IOException
	{
      FileInputStream file = new FileInputStream("./config/config.properties");
      Properties property =new Properties();
      property.load(file);
      return property.get(key);
      
      
	}
	
	public static String fetchlocator(String key ) throws IOException
	{
      FileInputStream file = new FileInputStream("./config/Elements.properties");
      Properties property =new Properties();
      property.load(file);
      return property.get(key).toString();
      
      
	}

}
