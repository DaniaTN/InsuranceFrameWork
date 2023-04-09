package utilityfunctions;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegistrationExcelUtils {

	static XSSFWorkbook regWorkbook = null;
	static XSSFSheet regSheet = null;

	public static void getRegSheet() {

		try {
			regWorkbook = new XSSFWorkbook(
					"/Users/kaleemahmad/eclipse-workspace/InsuranceProject/src/main/java/utilityfunctions/RegisterationData.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		regSheet = regWorkbook.getSheet("Sheet1");
	}

	public static int getRowCount() {

		getRegSheet();

		int rowcount = regSheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);

		return rowcount;
	}

	public static int getColCount() {

		getRegSheet();
		int colcount = regSheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		return colcount;
	}

	public static String getCellData(int rowno, int colno) {

		getRegSheet();
		String data = regSheet.getRow(rowno).getCell(colno).getStringCellValue();
		return data;

	}
	public static String getCellDataint(int rowno,int colno) {
		getRegSheet();
		int data = (int)regSheet.getRow(rowno).getCell(colno).getNumericCellValue();
		String d= String.valueOf(data);
		
		return d;
		
	}
	public static String getCellDataDate(int rowno,int colno) {
		getRegSheet();
		DateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
		Date date = regSheet.getRow(rowno).getCell(colno).getDateCellValue();
		String date1=dateFormat.format(date);
		return date1;
		
	}

}
