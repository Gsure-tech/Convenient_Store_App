package org.example.models;

public class Products {
    private int product_id;
    private String productName;
    private double price;
    private String manufactureDate;
    private String expiryDate;

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", manufactureDate='" + manufactureDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    public Products() {
    }

    public Products(int product_id, String productName, double price,
                    String manufactureDate, String expiryDate) {
        this.product_id = product_id;
        this.productName = productName;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
