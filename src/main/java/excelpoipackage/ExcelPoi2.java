package excelpoipackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/*
 * Add dependencies in pom.xml - poi and poi-ooxml
 */

public class ExcelPoi2 {
	public static void main(String[] args) throws IOException {	
		// Caused by: java.lang.ClassNotFoundException: org.apache.xmlbeans.XmlException - You need to add poi-ooxml too in pom.xml
		File ref = new File("C:\\Users\\shalu\\eclipse-workspace\\mavenproject\\testdata\\test2.xlsx");
		FileInputStream ref1 = new FileInputStream(ref);
		XSSFWorkbook ref2 = new XSSFWorkbook(ref1);
		XSSFSheet sheet =ref2.getSheetAt(0);
		String value= sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		ref2.close();
		ref1.close();		
			
	}

}
