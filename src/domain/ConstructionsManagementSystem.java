package domain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

public class ConstructionsManagementSystem extends Observable{
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
       
       Runtime.getRuntime().addShutdownHook(new Thread(() -> {
           FileManager.saveToFile(foremen, owners, constructionSites, categories, categoriesMap);
           System.out.println("Data saved to data.ser on shutdown.");
       }));
   }
   
   // Métodos para registrar/modificar rubro
   public void registerCategory(String name, String description) {
  if (!categoriesMap.containsKey(name)) {
    Category newCategory = new Category(name, description, 0.0); // Set initial budget to 0.0
    categories.add(newCategory);
    categoriesMap.put(name, newCategory);
    somethingChanged();
       } else {
           Category existingCategory = categoriesMap.get(name);
           existingCategory.setDescription(description);
       }
   }

   public List<Category> obtainCategories() {
       return new ArrayList<>(categories);
   }

   public void somethingChanged(){
        setChanged();
        notifyObservers();
   }
   
   // Métodos para registrar capataz
      public boolean registerForeman(String name, String id, String address, int yearHired) {
        Foreman newForeman = new Foreman(name, id, address, yearHired);
        boolean isUnique = true;
        for (Foreman f : this.obtainForemen()) {
            if (f.equals(newForeman)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            foremen.add(newForeman);
            somethingChanged();
            //saveAllData(); only save on shutdown, so moved this out
        }
        return isUnique;
    }

   public List<Foreman> obtainForemen() {
       return new ArrayList<>(foremen);
   }

   // Métodos para registrar propietario 
   public boolean registerOwner(String name, String id, String address, int cellphone) {
        Owner newOwner = new Owner(name, id, address, cellphone);
        boolean isUnique = true;
        for (Owner o : this.obtainOwners()) {
            if (o.equals(newOwner)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            owners.add(newOwner);
            somethingChanged();
            //saveAllData(); only save on shutdown, so moved this out
        }
        return isUnique;
    }

   public List<Owner> obtainOwners() {
       return new ArrayList<>(owners);
   }
   
       public void setForemen(List<Foreman> foremen) {
        this.foremen = foremen;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public void setConstructionSites(List<ConstructionSite> constructionSites) {
        this.constructionSites = constructionSites;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setCategoriesMap(Map<String, Category> categoriesMap) {
        this.categoriesMap = categoriesMap;
    }
   
   /*
   private void saveAllData() {
        FileManager.saveToFile(foremen, owners);
    }*/

   // Métodos para registrar obra
  public void registerConstructionSite(Owner owner, Foreman foreman, String permitNumber, String address, int startMonth, int startYear, double totalBudget, Map<String, Double> categoryBudgets) {
  ConstructionSite newConstructionSite = new ConstructionSite(owner, foreman, permitNumber, address, startMonth, startYear, totalBudget, categoryBudgets);
  constructionSites.add(newConstructionSite);
  somethingChanged();
}

   public List<ConstructionSite> obtainConstructionSites() {
       return new ArrayList<>(constructionSites);
   }

   // Métodos para registrar gasto
   public void registerExpenditures(ConstructionSite constructionSite, Category category, double amount, int month, int year, String description, Boolean paid) {
       Expenditures newExpenditures = new Expenditures(constructionSite, category, amount, month, year, description, paid);
       constructionSite.addExpenditure(newExpenditures);
       somethingChanged();
     
   }

   // Métodos para registrar pago de gasto
 

   // Métodos para obtener estado de obra
   public String obtainConstructionSiteStatus(ConstructionSite constructionSite) {
       StringBuilder status = new StringBuilder();
       status.append("Owner: ").append(constructionSite.getOwner().getName()).append("\n");
       status.append("Foreman: ").append(constructionSite.getForeman().getName()).append("\n");
       status.append("Start Date: ").append(constructionSite.getStartMonth()).append("/").append(constructionSite.getStartYear()).append("\n");
       status.append("Total Budget: ").append(constructionSite.getTotalBudget()).append("\n");
     //  status.append("Total Spent: ").append(constructionSite.calculateTotalExpenditures()).append("\n");
     //  status.append("Total Given Back: ").append(constructionSite.calculateTotalGivenBack()).append("\n");
      // status.append("Total Not Given Back: ").append(constructionSite.calculateTotalNotGivenBack()).append("\n");
      // status.append("Balance: ").append(constructionSite.calculateBalance()).append("\n");

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
   public void exportData(String filename, int option) { // if option is 0 save via id if 1 or anything else save via name
        RecordFile recordFile = null;
        if(option == 0){
            try {
                System.out.println("saving via ID number creciente");
                recordFile = new RecordFile(filename);
                recordFile.recordLine("Propetarios: ");
                for (Owner owner : owners) {
                    recordFile.recordLine(owner.toString());
                }
                recordFile.recordLine("Capataces: ");
                for (Foreman foreman : foremen) {
                    recordFile.recordLine(foreman.toString());
                }
                System.out.println("Data guardado exitosimente en: " + filename);

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
            } finally {
                if (recordFile != null) {
                    recordFile.close(); // Close the file
                }
            }
        } else{ //if not 0
            try {
                System.out.println("saving via nombre creciente");
                
                //sort owners by ascending order
                Collections.sort(owners, new Comparator<Owner>() {
                @Override
                   public int compare(Owner o1, Owner o2) {
                       return o1.getName().compareTo(o2.getName());
                   }
               });

                // Sort foremen by name in ascending order
                Collections.sort(foremen, new Comparator<Foreman>() {
                @Override
                    public int compare(Foreman f1, Foreman f2) {
                    return f1.getName().compareTo(f2.getName());
                    }
                });
                
                recordFile = new RecordFile(filename);
                recordFile.recordLine("Propetarios: ");
                for (Owner owner : owners) {
                    recordFile.recordLine(owner.toString());
                }
                
                recordFile.recordLine("Capataces: ");
                for (Foreman foreman : foremen) {
                    recordFile.recordLine(foreman.toString());
                }

                System.out.println("Data guardado exitosimente en: " + filename);

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
            } finally {
                if (recordFile != null) {
                    recordFile.close(); // Close the file
                }
            }
        }
    }

    // Method to import data from a text file
    public void importData(String filename) {
        ReadFile readFile = new ReadFile(filename);
        while (readFile.hasMoreLines()) {
            String line = readFile.line();
            // Add logic to parse the line and add the appropriate objects to your lists
            // For example, if the line represents a Foreman:
            if (line.startsWith("Foreman")) {
                Foreman foreman = Foreman.fromString(line);
                foremen.add(foreman);
            }
            if (line.startsWith("Owners")) {
                Owner owner = Owner.fromString(line);
                owners.add(owner);
            }
            if (line.startsWith("Owners")) {
                ConstructionSite site = ConstructionSite.fromString(line);
                constructionSites.add(site);
            }
            if (line.startsWith("Categories")) {
                Category category = Category.fromString(line);
                categories.add(category);
            }
            
        }
        readFile.close();
    }
    
   // Métodos para importación y exportación de datos
   public void importDataConstructionSite(String file) {
       // Implementar la lógica para importar datos de una obra desde un archivo
   }

   public void exportDataPersons(String order) {
       // Implementar la lógica para exportar datos de propietarios y capataces
   }
   
   public void RegisterExpendituresForConstruction(){
       //logic here
   }
   public void registerPaymentExpenditure(ConstructionSite site, Expenditures expenditure) {
  // Register payment logic (assuming implemented)
  expenditure.setPaid(true); // Set expenditure to paid
  notifyObservers(); // Inform observers about the change
}
 
}

