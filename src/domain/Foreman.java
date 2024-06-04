package domain;

public class Foreman {
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
    public String toString() {
        return "Foreman{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", year=" + year +
                '}';
    }
}
