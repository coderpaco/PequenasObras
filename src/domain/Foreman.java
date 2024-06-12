package domain;
import java.io.Serializable;
import java.util.Objects;
public class Foreman implements Serializable{
    private String name;
    private String id;
    private String address;
    private int year;

    public Foreman(String name, String id, String address, int year) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foreman foreman = (Foreman) o;
        return year == foreman.year &&
               Objects.equals(name, foreman.name) &&
               Objects.equals(id, foreman.id) &&
               Objects.equals(address, foreman.address);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, id, address, year);
    }  
    
    @Override
    public String toString() {
        return "Foreman{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", year=" + year +
                '}';
    }
}
