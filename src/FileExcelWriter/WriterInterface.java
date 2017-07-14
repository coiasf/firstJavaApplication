/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileExcelWriter;

import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author ISAIOC
 */
public interface WriterInterface {

    /**
     *
     * @param data
     * @throws FileNotFoundException
     */
    public void writeToFile(List<String> data) throws FileNotFoundException;
}
