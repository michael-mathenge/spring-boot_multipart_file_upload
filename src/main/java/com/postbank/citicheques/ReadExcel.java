//package com.postbank.citicheques;;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Iterator;
//
//public class ReadExcel {
//
//    public static void main(String[] args) {
//        File file = new File("C:\\Temp\\sampledata.xlsx");
//
//        FileInputStream fis;
//
//        {
//            try {
//                fis = new FileInputStream(file);
//                try {
//                    XSSFWorkbook workbook = new XSSFWorkbook(fis);
//                    XSSFSheet worksheet = workbook.getSheetAt(0);
//
//                    Iterator<Row> rowItr = worksheet.iterator();
//                    while (rowItr.hasNext()){
//                        Row row = rowItr.next();
//
//                        Iterator<Cell> cellIter = row.cellIterator();
//                        while (cellIter.hasNext()){
//                            Cell cell = cellIter.next();
//
//                            switch(cell.getCellType()){
//                                case STRING:
//                                    System.out.print(cell.getStringCellValue() +"\t");
//                                    break;
//
//                                case NUMERIC:
//                                    System.out.print(cell.getNumericCellValue() +"\t");
//                                    break;
//
//                                default:
//                                    break;
//                            }
//                        }
//                        System.out.println("");
//                    }
//                    workbook.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    // open file
//
//    // Input Stream
//
//    // workbook
//
//    // iterate over each row
//
//    // iterate over each cell of current row
//
//    // close workbook
//}
