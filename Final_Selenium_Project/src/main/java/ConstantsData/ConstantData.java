package ConstantsData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConstantData {	
	
	public static final String Global_Prop_path="src/main/java/Global.properties";

	public static final String Excel_path = "E:/ReadExcel.xlsx";
 
	public static final String Screenshots_path = "target/Failed_Screenshots/" +
	LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"))+"Test.png";
	
	
	

	
	
	
	

}
