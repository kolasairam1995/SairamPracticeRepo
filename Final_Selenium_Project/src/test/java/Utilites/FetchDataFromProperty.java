package Utilites;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import ConstantsData.ConstantData;

public class FetchDataFromProperty {
	
	
	public static Properties getDataFromProperty() throws IOException
	{		
		FileReader reader = new FileReader(ConstantData.Global_Prop_path);
		Properties prop = new Properties();
		prop.load(reader);
		return prop;	
	}
	
	
	
	
	
	
	
	

}
