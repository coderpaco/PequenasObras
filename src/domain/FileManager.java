/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import domain.Foreman;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class FileManager {
         public static void saveForemanToFile(Foreman foreman) {
        try {
            Formatter formatter = new Formatter("foremen.txt");
            formatter.format("%s;%s;%s;%d%n", foreman.getName(), foreman.getId(), foreman.getAddress(), foreman.getYear());
            formatter.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
      public static void saveOwnerToFile(Owner owner) {
        try {
            Formatter formatter = new Formatter("owners.txt");
            formatter.format("%s;%s;%s;%s%n", owner.getName(), owner.getId(), owner.getAddress(), owner.getCellphone());
            formatter.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }


    public static List<Foreman> loadForemenFromFile() {
        List<Foreman> foremen = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("foremen.txt"))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(";");
                String name = data[0];
                String id = data[1];
                String address = data[2];
                int year = Integer.parseInt(data[3]);
                Foreman foreman = new Foreman(name, id, address, year);
                foremen.add(foreman);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foremen;
    }
      /*   public static ArrayList<Foreman> loadForemenFromFile() {
        ArrayList<Foreman> foremen = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FOREMAN_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) { // Ensure all data is present
                    String name = data[0].trim();
                    String id = data[1].trim();
                    String address = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    Foreman foreman = new Foreman(name, id, address, year);
                    foremen.add(foreman);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading foremen file: " + e.getMessage());
        }
        return foremen;
    }

    public static ArrayList<Owner> loadOwnersFromFile() {
        ArrayList<Owner> owners = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(OWNER_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) { // Ensure all data is present
                    String name = data[0].trim();
                    String id = data[1].trim();
                    String address = data[2].trim();
                    String cellphone = data[3].trim();
                    Owner owner = new Owner(name, id, address, cellphone);
                    owners.add(owner);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading owners file: " + e.getMessage());
        }
        return owners;
    }*/
}
