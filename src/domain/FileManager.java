/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import domain.Foreman;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class FileManager {
      public static void saveForemanToFile(Foreman foreman) {
        try (FileWriter fileWriter = new FileWriter("foremen.txt", true); Formatter formatter = new Formatter(fileWriter)) {
            formatter.format("%s;%s;%s;%d%n", foreman.getName(), foreman.getId(), foreman.getAddress(), foreman.getYear());
        } catch (IOException e) {
            e.printStackTrace();
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
}
