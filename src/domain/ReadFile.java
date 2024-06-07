/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ReadFile {
    private String line;
    private Scanner entry;
    
    public ReadFile (String nameFile){//constructor
        try{
            entry = new Scanner(Paths.get(nameFile));
        }catch(IOException e){
            System.err.println("Error");
            System.exit(1);
        }
    }
    public boolean hasMoreLines(){ //check if there is more files
        boolean has = false;
        
        line = null;
        
        if(entry.hasNext()){
            line = entry.nextLine();
            has = true;
        }
        
        return has;
    }
    
    public String line(){
        return line;
    }
    
    public void close(){ //close file after using it
        entry.close();
    }
}
