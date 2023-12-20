package com.pluralsight.northwindtradersspringboot;

public class Product {
    private int productId;
    private String name;

    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    private String category;
    private double price;

    public Product(int productId, String name, String category, double price) {

        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
