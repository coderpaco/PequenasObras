package domain;

import java.util.ArrayList;

public class SystemClass {
    
    private ArrayList<Foreman> foreman;
    private ArrayList<Owner> owners;
    private ArrayList<Category> categories;
    private ArrayList<ConstructionSite> constructionSites;
    private ArrayList<Expenditures> expenditures;
    
    public SystemClass() {
        this.foreman = new ArrayList<Foreman>();
        this.owners = new ArrayList<Owner>();
        this.categories = new ArrayList<Category>();
        this.constructionSites = new ArrayList<ConstructionSite>();
        this.expenditures = new ArrayList<Expenditures>();
    }
    
    
    // get/set the list with the info in the form, still working on this.
    public void setForemenList(String foremanName, String foremanId, String foremanAddress, int foremanYear){
        Foreman f = new Foreman(foremanName, foremanId, foremanAddress, foremanYear);
        this.foreman.add(f);
        System.out.println(f);
    }
    
    public ArrayList<Foreman> getForemenList(){
        return this.foreman;
    }    
    
    public void setOwnersList(String ownerName, String ownerId, String ownerAddress, String cellphone){
        Owner o = new Owner(ownerName, ownerId, ownerAddress, cellphone);
        this.owners.add(o);
        System.out.println(o);
    }
    
    public ArrayList<Owner> getOwnersList() {
        return this.owners;
    }
    
    public void setCategoriesList(String categoryName, String categoryDescription){
        Category c = new Category(categoryName, categoryDescription);
        this.categories.add(c);
        System.out.println(c);
    }
        
    public ArrayList<Category> getCategoriesList() {
        return this.categories;
    }
    
    public void setConstructionSitesList(Owner csOwner, Foreman csForeman, String csPermitNumber, String csAddress, int csStartMonth, int csStartYear, double csBudget) {
        ConstructionSite cs = new ConstructionSite(csOwner, csForeman, csPermitNumber, csAddress, csStartMonth, csStartYear, csBudget);
        this.constructionSites.add(cs);
        System.out.println(cs);
    }
    
    public ArrayList<ConstructionSite> getConstructionSitesList() {
        return this.constructionSites;
    }
    
    public void setExpendaturesList(ConstructionSite constructionSite, Category category, double amount, int month, int year, String description){
        Expenditures e = new Expenditures(constructionSite, category, amount, month, year, description);
        this.expenditures.add(e);
        System.out.println(e);
    }
    
    public ArrayList<Expenditures> getExpendituresList() {
        return this.expenditures;
    } 

}
