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
        Foreman foreman = new Foreman(foremanName, foremanId, foremanAddress, foremanYear);
        System.out.println(foreman);
    }
    
    public ArrayList<Foreman> getForemenList(){
        return this.foreman;
    }    
    
    
}
