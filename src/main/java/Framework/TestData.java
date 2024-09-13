package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestData {
	
	static String urnm;
	static String pwrd;
	
	public void testdatamethod() throws IOException {
	// Caused by: java.lang.ClassNotFoundException: org.apache.xmlbeans.XmlException - You need to add poi-ooxml too in pom.xml
			File ref = new File("C:\\Users\\shalu\\eclipse-workspace\\mavenproject\\testdata\\test2.xlsx");
			FileInputStream ref1 = new FileInputStream(ref);
			XSSFWorkbook ref2 = new XSSFWorkbook(ref1);
			XSSFSheet sheet =ref2.getSheetAt(0);
			urnm= sheet.getRow(0).getCell(0).getStringCellValue();
			pwrd= sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println(urnm);
			System.out.println(pwrd);
			ref2.close();
			ref1.close();	
}
}
