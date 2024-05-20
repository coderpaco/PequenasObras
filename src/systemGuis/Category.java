package systemGuis;

public class Category {
    // class atributes
  private String name;
  private String description;

  // Constructor to initialize atributes
  public Category(String name, String description) {
      this.name = name;
      this.description = description;
  }

  // getter and setter for each atribute.
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getDescription() {
      return description;
  }

  public void setDescription(String description) {
      this.description = description;
  }

  @Override
  public String toString() {
      return "Foreman{" +
              "name='" + name + '\'' +
              ", description='" + description + '\'' +
              '}';
  }
}