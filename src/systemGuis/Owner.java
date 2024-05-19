package systemGuis;

public class Owner {
  // class atributes
  private String name;
  private String id;
  private String adress;
  private int cellPhone;

  // Constructor to initialize atributes
  public Owner(String name, String id, String adress, int cellPhone) {
      this.name = name;
      this.id = id;
      this.adress = adress;
      this.cellPhone = cellPhone;
  }

  // getter and setter for each atribute.
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

  public String getAdress() {
      return adress;
  }

  public void setAdress(String adress) {
      this.adress = adress;
  }

  public int getCellPhone() {
      return cellPhone;
  }

  public void setCellPhone(int cellPhone) {
      this.cellPhone = cellPhone;
  }

  @Override
  public String toString() {
      return "Foreman{" +
              "name='" + name + '\'' +
              ", id='" + id + '\'' +
              ", adress='" + adress + '\'' +
              ", yearHired=" + cellPhone +
              '}';
  }
}