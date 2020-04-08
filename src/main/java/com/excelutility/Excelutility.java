package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.stepdefinition.CrosswordDefinition_Books;

public class Excelutility {
	 final static Logger LOG = LogManager.getLogger(CrosswordDefinition_Books.class.getName());

	public String user_Name(int a)throws IOException{
	FileInputStream fil = new FileInputStream(new File("Book1.xlsx"));//To give Excel address
	LOG.info("To give the excel address");
	XSSFWorkbook workbook = new XSSFWorkbook (fil);//To get the excel file from workbook
	LOG.info("to get the excel file from the workbook");
	XSSFSheet sheet = workbook.getSheet("Sheet1");//To get data from the sheet1
	LOG.info("to get data from the sheet1");
	int count = sheet.getLastRowNum();
	System.out.println(count);
	
	XSSFRow row = sheet.getRow(a);
	XSSFCell cell = row.getCell(0);//To get data from cell 0
	LOG.info("Getting data from cell 0");
	String un =  cell.getStringCellValue();//To get value from cell and store in un
	LOG.info("to get value form the cell and stored in un");
	
	return un;
	
	}
	public String user_Emailid(int b)throws IOException{
		FileInputStream fil = new FileInputStream(new File("Book1.xlsx"));//To give excel address
		LOG.info("To give the excel address");
		XSSFWorkbook workbook = new XSSFWorkbook (fil);//To get the excel file from workbook
		LOG.info("to get the excel file from the workbook");
		XSSFSheet sheet = workbook.getSheet("Sheet1");//To get data from the Sheet1
		LOG.info("to get data from the sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);
		
		XSSFRow row = sheet.getRow(b);
		XSSFCell cell1 = row.getCell(1);//To get data from cell1
		LOG.info("Getting data from cell 1");
		String mail =  cell1.getStringCellValue();//To get value from cell and store in string mail
		LOG.info("to get value form the cell and stored in mail");
		
		return mail;
	}
	
	public String user_Password(int c)throws IOException{
		FileInputStream fil = new FileInputStream(new File("Book1.xlsx"));//To give the excel address
		LOG.info("To give the excel address");
		XSSFWorkbook workbook = new XSSFWorkbook (fil);//to get the excel file from the workbook
		LOG.info("to get the excel file from the workbook");
		XSSFSheet sheet = workbook.getSheet("Sheet1");//to get data from the sheet1
		LOG.info("to get data from the sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);
		
		XSSFRow row = sheet.getRow(c);
		XSSFCell cell2 = row.getCell(2);//to get data from the sheet1
		LOG.info("to get data from the sheet1");
		String pwd =  cell2.getStringCellValue();//to get value form the cell and stored in string pwd
		LOG.info("to get value form the cell and stored in pwd");
		
		return pwd;
	}
	public String user_Confirmpassword(int d)throws IOException{
		FileInputStream fil = new FileInputStream(new File("Book1.xlsx"));//To give the excel address
		LOG.info("To give the excel address");
		XSSFWorkbook workbook = new XSSFWorkbook (fil);//to get the excel file from the workbook
		LOG.info("to get the excel file from the workbook");
		XSSFSheet sheet = workbook.getSheet("Sheet1");//to get data from the sheet1
		LOG.info("to get data from the sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);
		
		XSSFRow row = sheet.getRow(d);
		XSSFCell cell3 = row.getCell(3);//To get data from cell 3
		LOG.info("Getting data from cell 3");
		String confirmpassword =  cell3.getStringCellValue();//to get value form the cell and store in string confirmpassword
		LOG.info("to get value form the cell and stored in confirmpassword");
		
		return confirmpassword;
	}
	public String user_Birthdetails(int e)throws IOException{
		FileInputStream fil = new FileInputStream(new File("Book1.xlsx"));//To give the excel address
		LOG.info("To give the excel address");
		XSSFWorkbook workbook = new XSSFWorkbook (fil);//to get the excel file from the workbook
		LOG.info("to get the excel file from the workbook");
		XSSFSheet sheet = workbook.getSheet("Sheet1");//to get data from the sheet1
		LOG.info("to get data from the sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);
		
		XSSFRow row = sheet.getRow(e);
		XSSFCell cell4 = row.getCell(4);//To get data from cell 4
		LOG.info("Getting data from cell 4");
		String DOB =  cell4.getStringCellValue();//to get value form the cell and stored in DOB
		LOG.info("to get value form the cell and stored in DOB");
		return DOB;
}
}
