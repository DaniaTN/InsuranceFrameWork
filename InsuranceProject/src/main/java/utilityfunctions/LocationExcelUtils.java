package utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LocationExcelUtils {

	static XSSFWorkbook locWorkbook = null;
	static XSSFSheet locSheet = null;

	public static void getLocSheet() {

		try {
			locWorkbook = new XSSFWorkbook(
					"/Users/kaleemahmad/eclipse-workspace/InsuranceProject/src/main/java/utilityfunctions/UpdateLocation.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		locSheet = locWorkbook.getSheet("Sheet1");
	}

	public static int getRowCount() {

		getLocSheet();

		int rowcount = locSheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);

		return rowcount;
	}

	public static int getColCount() {

		getLocSheet();
		int colcount = locSheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		return colcount;
	}

	public static String getCellData(int rowno, int colno) {

		getLocSheet();
		String data = locSheet.getRow(rowno).getCell(colno).getStringCellValue();
		return data;

	}
	public static String getCellDataint(int rowno,int colno) {
		getLocSheet();
		int data = (int)locSheet.getRow(rowno).getCell(colno).getNumericCellValue();
		String d= String.valueOf(data);
		
		return d;
}
}
