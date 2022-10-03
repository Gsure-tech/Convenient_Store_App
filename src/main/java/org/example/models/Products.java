package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private int productId;
    private String productCategory;
    private String productName;
    private int quantity;
    private double price;
    private int manufactureYear;
    private int expiryYear;

    public Products(int productId, String productCategory, String productName, int quantity, double price, int manufactureYear, int expiryYear) {
        this.productId = productId;
        this.productCategory = productCategory;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.manufactureYear = manufactureYear;
        this.expiryYear = expiryYear;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productCategory='" + productCategory + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", manufactureYear=" + manufactureYear +
                ", expiryYear=" + expiryYear +
                '}';
    }
    //    int productId = Integer.parseInt(detailed[0]);
// String productCategory = detailed[1];
// String productName = detailed[2];
// String quantity = detailed[3];
// int price = Integer.parseInt(detailed[4]);
// int manufactureYear = Integer.parseInt(detailed[5 ]);
// int expiryYear = Integer.parseInt(detailed[6]);
// List<Products> productList = new ArrayList<>();

}