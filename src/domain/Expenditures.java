package domain;

import domain.ConstructionSite;
import domain.Category;

public class Expenditures {
    // Atributos de la clase
    private ConstructionSite constructionSite;
    private Category category;
    private double amount;
    private int month;
    private int year;
    private String description;
    private boolean paid;

    // Constructor para inicializar los atributos
    public Expenditures(ConstructionSite constructionSite, Category category, double amount, int month, int year, String description) {
        this.constructionSite = constructionSite;
        this.category = category;
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.description = description;
        this.paid = false; // Por defecto, el gasto no está pagado
    }

    // Métodos getter y setter para cada atributo
    public ConstructionSite getConstructionSite() {
        return constructionSite;
    }

    public void setConstructionSite(ConstructionSite constructionSite) {
        this.constructionSite = constructionSite;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Expenditures{" +
                "constructionSite=" + constructionSite +
                ", category=" + category +
                ", amount=" + amount +
                ", month=" + month +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", paid=" + paid +
                '}';
    }
}