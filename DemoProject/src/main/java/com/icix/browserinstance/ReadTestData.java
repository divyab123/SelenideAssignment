package com.icix.browserinstance;

// This class is for Read Test Data from Excel Sheet from Xls Reader class

public class ReadTestData {
	public static String vUsername;
	public static String vPassword;
	public static String vRequestName;
	public static String vTPname;
	public static String vFormName;
	public static String vComments;

	public static String sheetPath = System.getProperty("user.dir") + "\\src\\test\\resources\\Test_Data\\Product.xlsx";
	public static Xls_Reader xlr = new Xls_Reader(sheetPath);

	public static void ReadData() {
		int i = 0;
		int rCount = xlr.getRowCount("Login SPU");
		for (i = 1; i < rCount; i++) {
			vUsername = xlr.getCellData("Login SPU", "UserName", i + 1);
			vPassword = xlr.getCellData("Login SPU", "Password", i + 1);
		}
	}

	public static void ReadData1() {
		int i = 0;
		int rCount = xlr.getRowCount("Request");
		for (i = 1; i < rCount; i++) {
			vRequestName = xlr.getCellData("Request", "Request Name", 2);
			vTPname = xlr.getCellData("Request", "Trading Partner", i + 1);
			vFormName = xlr.getCellData("Request", "Form Name", i + 1);
			vComments = xlr.getCellData("Request", "Comments", i + 1);
		}
	}
}