package domain;
import domain.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructionsManagementSystem {
   // Atributos de la clase
   private List<Foreman> foremen;
   private List<Owner> owners;
   private List<ConstructionSite> constructionSites;
   private List<Category> categories;
   private Map<String, Category> categoriesMap;

   // Constructor para inicializar los atributos
   public ConstructionsManagementSystem() {
       this.foremen = new ArrayList<>();
       this.owners = new ArrayList<>();
       this.constructionSites = new ArrayList<>();
       this.categories = new ArrayList<>();
       this.categoriesMap = new HashMap<>();
   }
   
   // Métodos para registrar/modificar rubro
   public void registerCategory(String name, String description) {
       if (!categoriesMap.containsKey(name)) {
           Category newCategory = new Category(name, description);
           categories.add(newCategory);
           categoriesMap.put(name, newCategory);
       } else {
           Category existingCategory = categoriesMap.get(name);
           existingCategory.setDescription(description);
       }
   }

   public List<Category> obtainCategories() {
       return new ArrayList<>(categories);
   }

   
   // Métodos para registrar capataz
   public boolean registerForeman(String name, String id, String address, int yearHired) {
       Foreman newForeman = new Foreman(name, id, address, yearHired);
       boolean isUnique = true;
       for (Foreman f : this.obtainForemen()){
           System.out.println(f);
           if (f.equals(newForeman)){
               isUnique = false; //return false bc it exists
           }
       }
       if (isUnique){
            foremen.add(newForeman);
            System.out.println(this.obtainForemen());
            FileManager.saveForemanToFile(newForeman);
       }
       return isUnique;
   }

   public List<Foreman> obtainForemen() {
       return new ArrayList<>(foremen);
   }

   // Métodos para registrar propietario 
   public boolean registerOwner(String name, String id, String address, String cellphone) {
       Owner newOwner = new Owner(name, id, address, cellphone);
       boolean isUnique = true;
       for (Owner o: this.obtainOwners()){
           if (o.equals(newOwner)){
               isUnique = false;
           }
       }
       if (isUnique){
           owners.add(newOwner);
           FileManager.saveOwnerToFile(newOwner);
       }
       return isUnique;
   }

   public List<Owner> obtainOwners() {
       return new ArrayList<>(owners);
   }

   // Métodos para registrar obra
   public void registerConstructionSite(Owner owner, Foreman foreman, String permitNumber, String address, int startMonth, int startYear, double totalBudget) {
       ConstructionSite newConstructionSite = new ConstructionSite(owner, foreman, permitNumber, address, startMonth, startYear, totalBudget);
       constructionSites.add(newConstructionSite);
   }

   public List<ConstructionSite> obtainConstructionSites() {
       return new ArrayList<>(constructionSites);
   }

   // Métodos para registrar gasto
   public void registerExpenditures(ConstructionSite constructionSite, Category category, double amount, int month, int year, String description) {
       Expenditures newExpenditures = new Expenditures(constructionSite, category, amount, month, year, description);
       constructionSite.addExpenditure(newExpenditures);
   }

   // Métodos para registrar pago de gasto
   public void registerPaymentExpenditure(ConstructionSite constructionSite, Expenditures expenditures) {
       expenditures.setPaid(true);
   }

   // Métodos para obtener estado de obra
   public String obtainConstructionSiteStatus(ConstructionSite constructionSite) {
       StringBuilder status = new StringBuilder();
       status.append("Owner: ").append(constructionSite.getOwner().getName()).append("\n");
       status.append("Foreman: ").append(constructionSite.getForeman().getName()).append("\n");
       status.append("Start Date: ").append(constructionSite.getStartMonth()).append("/").append(constructionSite.getStartYear()).append("\n");
       status.append("Total Budget: ").append(constructionSite.getTotalBudget()).append("\n");
       status.append("Total Spent: ").append(constructionSite.calculateTotalExpenditures()).append("\n");
       status.append("Total Given Back: ").append(constructionSite.calculateTotalGivenBack()).append("\n");
       status.append("Total Not Given Back: ").append(constructionSite.calculateTotalNotGivenBack()).append("\n");
       status.append("Balance: ").append(constructionSite.calculateBalance()).append("\n");

       status.append("Categories with Expenditures: \n");
       for (Category category : constructionSite.obtainCategoriesWithExpenditures()) {
           status.append("  - ").append(category.getName()).append("\n");
       }

       status.append("Expenditures by Category: \n");
       for (Category category : constructionSite.obtainCategoriesWithExpenditures()) {
           status.append("  Category: ").append(category.getName()).append("\n");
           for (Expenditures expenditures : constructionSite.obtainExpendituresPerCategory(category)) {
               status.append("    - Expenditure: ").append(expenditures.getAmount()).append(", Paid: ").append(expenditures.isPaid()).append(", Description: ").append(expenditures.getDescription()).append("\n");
           }
       }

       return status.toString();
   }

   // Métodos para importación y exportación de datos
   public void importDataConstructionSite(String file) {
       // Implementar la lógica para importar datos de una obra desde un archivo
   }

   public void exportDataPersons(String order) {
       // Implementar la lógica para exportar datos de propietarios y capataces
   }
}
