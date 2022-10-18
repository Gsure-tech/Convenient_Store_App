package org.example.models;


import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public static List<Products> productList = new ArrayList<>();

    public static void setProductList(List<Products> productList) {
        Store.productList = productList;
    }

    public static List<Products> getProductList() {
        return productList;
    }
    // New changes to week 2
}
