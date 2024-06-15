package domain;
import domain.Category;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConstructionSite implements Serializable{
  // Atributos de la clase
  private Owner owner;
  private Foreman foreman;
  private String permitNumber;
  private String address;
  private int startMonth;
  private int startYear;
  private double totalBudget;
  private List<Expenditures> expenditures;
  private List<Category> categories;

  // Constructor para inicializar los atributos
  public ConstructionSite(Owner owner, Foreman foreman, String permitNumber, String address, int startMonth, int startYear, double totalBudget) {
      this.owner = owner;
      this.foreman = foreman;
      this.permitNumber = permitNumber;
      this.address = address;
      this.startMonth = startMonth;
      this.startYear = startYear;
      this.totalBudget = totalBudget;
      this.expenditures = new ArrayList<>();
      this.categories = new ArrayList<>();
  }

  // Métodos getter y setter para cada atributo
  public Owner getOwner() {
      return owner;
  }

  public void setOwner(Owner owner) {
      this.owner = owner;
  }

  public Foreman getForeman() {
      return foreman;
  }

  public void setForeman(Foreman foreman) {
      this.foreman = foreman;
  }

  public String getPermitNumber() {
      return permitNumber;
  }

  public void setPermitNumber(String permitNumber) {
      this.permitNumber = permitNumber;
  }

  public String getAddress() {
      return address;
  }

  public void setAddress(String address) {
      this.address = address;
  }

  public int getStartMonth() {
      return startMonth;
  }

  public void setStartMonth(int startMonth) {
      this.startMonth = startMonth;
  }

  public int getStartYear() {
      return startYear;
  }

  public void setStartYear(int startYear) {
      this.startYear = startYear;
  }

  public double getTotalBudget() {
      return totalBudget;
  }

  public void setTotalBudget(double totalBudget) {
      this.totalBudget = totalBudget;
  }

  public List<Expenditures> getExpenditures() {
      return expenditures;
  }
    public List<Category> getCategories(){
        return categories;
    }
  // Método para agregar un gasto a la lista de gastos
  public void addExpenditure(Expenditures expenditure) {
      this.expenditures.add(expenditure);
  }
    public List<Expenditures> getUnpaidExpenditures() {
        List<Expenditures> unpaidExpenditures = new ArrayList<>();
        for (Expenditures expenditure : expenditures) {
            if (!expenditure.isPaid()) {
                unpaidExpenditures.add(expenditure);
            }
        }
        return unpaidExpenditures;
    }

    public List<Expenditures> getPaidExpenditures() {
        List<Expenditures> paidExpenditures = new ArrayList<>();
        for (Expenditures expenditure : expenditures) {
            if (expenditure.isPaid()) {
                paidExpenditures.add(expenditure);
            }
        }
        return paidExpenditures;
    }


  //Métodos para calcular los totales
  public double calculateTotalExpenditures() {
      double totalExpenditure = 0;
      for (Expenditures expenditure : expenditures) {
          totalExpenditure += expenditure.getAmount();
      }
      return totalExpenditure;
  }

  public double calculateTotalGivenBack() {
      double totalGivenBack = 0;
      for (Expenditures expenditure : expenditures) {
          if (expenditure.isPaid()) {
              totalGivenBack += expenditure.getAmount();
          }
      }
      return totalGivenBack;
  }

  public double calculateTotalNotGivenBack() {
      double totalNotGivenBack = 0;
      for (Expenditures expenditure : expenditures) {
          if (!expenditure.isPaid()) {
              totalNotGivenBack += expenditure.getAmount();
          }
      }
      return totalNotGivenBack;
  }

  public double calculateBalance() {
      return totalBudget - calculateTotalExpenditures();
  }

  // Método para obtener los rubros con gastos
  public List<Category> obtainCategoriesWithExpenditures() {
      List<Category> categoriesWithExpenditures = new ArrayList<>();
      for (Expenditures expenditure : expenditures) {
          if (!categoriesWithExpenditures.contains(expenditure.getCategory())) {
              categoriesWithExpenditures.add(expenditure.getCategory());
          }
      }
      return categoriesWithExpenditures;
  }

  // Método para obtener los gastos por rubro
  public List<Expenditures> obtainExpendituresPerCategory(Category category) {
      List<Expenditures> expendituresPerCategory = new ArrayList<>();
      for (Expenditures expenditure : expenditures) {
          if (expenditure.getCategory().equals(category)) {
              expendituresPerCategory.add(expenditure);
          }
      }
      return expendituresPerCategory;
  }

  @Override
  public String toString() {
      return "ConstructionSite{" +
              "owner=" + owner +
              ", foreman=" + foreman +
              ", permitNumber='" + permitNumber + '\'' +
              ", address='" + address + '\'' +
              ", startMonth=" + startMonth +
              ", startYear=" + startYear +
              ", totalBudget=" + totalBudget +
              ", expenditures=" + expenditures +
              ", categories=" + categories +
              '}';
  }
    public static ConstructionSite fromString(String str) {
        str = str.replace("ConstructionSite{", "").replace("}", "");

        String[] parts = str.split(", ");
        Owner owner = null;
        Foreman foreman = null;
        String permitNumber = null;
        String address = null;
        int startMonth = 0;
        int startYear = 0;
        double totalBudget = 0;
        List<Expenditures> expenditures = new ArrayList<>();
        List<Category> categories = new ArrayList<>();

        for (String part : parts) {
            if (part.startsWith("owner=")) {
                String ownerStr = part.substring("owner=".length());
                owner = Owner.fromString(ownerStr);
            } else if (part.startsWith("foreman=")) {
                String foremanStr = part.substring("foreman=".length());
                foreman = Foreman.fromString(foremanStr);
            } else if (part.startsWith("permitNumber='")) {
                permitNumber = part.substring("permitNumber='".length(), part.length() - 1);
            } else if (part.startsWith("address='")) {
                address = part.substring("address='".length(), part.length() - 1);
            } else if (part.startsWith("startMonth=")) {
                startMonth = Integer.parseInt(part.substring("startMonth=".length()));
            } else if (part.startsWith("startYear=")) {
                startYear = Integer.parseInt(part.substring("startYear=".length()));
            } else if (part.startsWith("totalBudget=")) {
                totalBudget = Double.parseDouble(part.substring("totalBudget=".length()));
            } else if (part.startsWith("expenditures=[")) {
                String expendituresStr = part.substring("expenditures=[".length(), part.length() - 1);
                if (!expendituresStr.isEmpty()) {
                    String[] expendituresParts = expendituresStr.split("}, Expenditures\\{");
                    for (String expenditureStr : expendituresParts) {
                        expenditureStr = "Expenditures{" + expenditureStr + "}";
                        Expenditures expenditure = Expenditures.fromString(expenditureStr);
                        expenditures.add(expenditure);
                    }
                }
            } else if (part.startsWith("categories=[")) {
                String categoriesStr = part.substring("categories=[".length(), part.length() - 1);
                if (!categoriesStr.isEmpty()) {
                    String[] categoriesParts = categoriesStr.split(", ");
                    for (String categoryStr : categoriesParts) {
                        Category category = Category.fromString(categoryStr);
                        categories.add(category);
                    }
                }
            }
        }

        ConstructionSite site = new ConstructionSite(owner, foreman, permitNumber, address, startMonth, startYear, totalBudget);
        site.expenditures.addAll(expenditures);
        site.categories.addAll(categories);
        return site;
    }    
}  