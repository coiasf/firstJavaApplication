/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author ISAIOC
 */
public interface ReaderInterface {
    public List<String>  readFile() throws IOException;
}
    

