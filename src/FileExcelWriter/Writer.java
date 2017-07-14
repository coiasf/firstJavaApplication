/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileExcelWriter;
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;

/**
 *
 * @author ISAIOC
 */
public class Writer implements WriterInterface{
    
    /**
     *
     * @param data
     * @throws java.io.FileNotFoundException
     */  
    
    public void writeToFile(List<String> data) throws FileNotFoundException {
        
        String[] headerColumns = {"Name","Age","Sex","ID","Adress"};
        
        try {
            String filePath = new File("").getAbsolutePath();
            FileOutputStream fos = new FileOutputStream(filePath + "/src/docs/data2excel.xls");


            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet =  workbook.createSheet();
            //create sheet header
            HSSFRow worksheetHeader =  worksheet.createRow(0);

            int headerCellCounter = 0;
            for (String column: headerColumns) {
                HSSFCell headerCell = worksheetHeader.createCell(headerCellCounter);
                headerCell.setCellValue(column);
                headerCellCounter++;
            }
            
            int rowDataCounter = 1;
            for (String column: data){
                HSSFRow row =  worksheet.createRow(rowDataCounter);
                String rowData[] = column.split("\t");
                int rowCellCounter = 0;
                for (String cellData:rowData){
                    HSSFCell cell = row.createCell(rowCellCounter);
                    cell.setCellValue(cellData);
                    rowCellCounter++;
                }
                rowDataCounter++;
            }
            
            
            workbook.write(fos);
            fos.flush();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
