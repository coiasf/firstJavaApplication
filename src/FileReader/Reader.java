/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.File;


/**
 *
 * @author ISAIOC
 */
public class Reader implements ReaderInterface {
    
    private static final String FILENAME = "text.txt";
    
    public  List<String> readFile() throws IOException {
        BufferedReader br = null;
        FileReader fr = null;
        
        try {

            String sCurrentLine;
            List<String> list = new ArrayList<String>();
            
            String filePath = new File("").getAbsolutePath();
            
            br = new BufferedReader(new FileReader(filePath + "/src/docs/"+ FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                list.add(sCurrentLine);
            }
            
            return list;

        } catch (IOException e) {           
            throw e;
        } finally {
            try {
                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {
                throw ex;
            }
        }        
    }        
}
