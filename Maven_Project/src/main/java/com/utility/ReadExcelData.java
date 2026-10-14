package com.utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class ReadExcelData {
    public static String getParticularData(int rowValue, int coloumnValue) {
        String data = null;
        try {
            File file = new File("C:\\Users\\acer\\Downloads\\DataDriven_IPT.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet=book.getSheet("sheet1");
            Row row = sheet.getRow(rowValue);
            Cell cell = row.getCell(coloumnValue);
            //Data formatter - to convert all cell values into string format
            DataFormatter dataFormatter = new DataFormatter();
            data = dataFormatter.formatCellValue(cell);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    public static void getAllData() {
        try {
            File file = new File("C:\\Users\\acer\\Downloads\\DataDriven_IPT.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("sheet1");

            int lastRowNoCount = sheet.getLastRowNum();
            System.out.println("Last row number:" + lastRowNoCount);

            int lastCellNoCount = sheet.getRow(0).getLastCellNum();
            System.out.println("Last cell number:" + lastCellNoCount);

            for (int row = 1; row <= lastRowNoCount; row++) {
                Row rows = sheet.getRow(row);

                for (int coloumn = 0; coloumn <= lastCellNoCount; coloumn++) {
                    Cell cell = rows.getCell(coloumn);

                    //Data formatter - to convert all cell values into string format
                    DataFormatter dataFormatter = new DataFormatter();
                    String data = dataFormatter.formatCellValue(cell);
                    System.out.println(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //getParticularData();
        getAllData();
    }
    //}
}
