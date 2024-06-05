package domain;

import java.util.Objects;

public class Owner {
    private String name;
    private String id;
    private String address;
    private int cellphone;

    public Owner(String name, String id, String address, int cellphone) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.cellphone = cellphone;
    }

    // getter and setter for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return cellphone == owner.cellphone &&
               Objects.equals(name, owner.name) &&
               Objects.equals(id, owner.id) &&
               Objects.equals(address, owner.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, address, cellphone);
    }
    
    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }

}
