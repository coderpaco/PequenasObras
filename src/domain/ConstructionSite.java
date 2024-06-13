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
              '}';
  }
}