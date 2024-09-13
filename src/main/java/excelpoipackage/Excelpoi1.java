package excelpoipackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelpoi1 {
	public static void main(String[] args) throws IOException {
		File ref = new File("C:\\Users\\shalu\\eclipse-workspace\\seleniumwebdriverproject\\testdata\\test1.xls");
		FileInputStream ref1 = new FileInputStream(ref);
		HSSFWorkbook ref2 = new HSSFWorkbook(ref1);
		HSSFSheet sheet = ref2.getSheetAt(0);
		String value= sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(value);
		ref2.close();
		ref1.close();
		
	}

}
