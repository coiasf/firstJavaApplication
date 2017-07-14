/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseToExcelExporter;

import java.io.IOException;
import FileReader.Reader;
import FileExcelWriter.Writer;

/**
 *
 * @author ISAIOC
 */
public class DatabaseToExcelExporter implements MainInterface{

    /**
     * @param args the command line arguments
     */   
    
    public static void main(String[] args) {
        // TODO code application logic here 
        Reader test = new Reader();
        Writer write = new Writer();
        try {            
            write.writeToFile(test.readFile());            
        } catch (IOException e){
            System.out.println(e.getMessage());
        }        
    }
    
    public void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
