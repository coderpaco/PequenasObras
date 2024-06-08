/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author diego
 */
public class RecordFile {

    private Formatter exit;

    public RecordFile(String nameFile) {
        try {
            exit = new Formatter(nameFile) ;
        } catch (FileNotFoundException e) {
            System.out.println("No se puede crear el archivo");
            System.exit(1);
        } catch (SecurityException e) {//caso que nos de un error de permisos.
            System.out.println("No permissions");
            System.exit(1);
        }
    }
    public void recordLine(String line){
    exit.format("%s%n", line);//take this line and this line make it match with %s get first argument, %n nextline
    }
    public void close(){
        exit.close();
    }
}
    
   