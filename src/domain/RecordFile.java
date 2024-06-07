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
    }//there is a for i miss it has to check it tomorrow
    
    public static void ejercicio3(){
        ArchivoGrabacion grabacion = new ArchivoGrabacion("Fibronaccio.txt");
        grabacion.grabarLinea("0");
        grabacion.grabarLinea("1");
        double anterior1 = 0;
        double anterior 2 = 1;
        double suma;
        for(int i = 2; i < 100; i++){
         suma = anterior1 +anterior2;
         grabacion.grabarLinea(""+suma);
         anterior1 = anterior2;
         anterior2 = suma;
        }
        grabacion.cerrar();
    }
}
