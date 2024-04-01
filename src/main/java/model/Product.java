package model;

public class Product {
    private String name;
    private double price;
    private String description;


    // Getter 1
    public String getName() {
        return name;
    }

    // Setter 1
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter 2
    public double getPrice() {
        return price;
    }

    // Setter 2
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    // Getter 3
    public String getDescription() {
        return description;
    }

    // Setter 3
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }
}
