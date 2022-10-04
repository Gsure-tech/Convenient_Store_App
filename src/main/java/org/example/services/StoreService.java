package org.example.services;
import org.example.models.Products;
import org.example.models.Store;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoreService {
    // public static void main(String[] args) {
    public static void load() {


        String path = "/Users/gsure-tech/IdeaProjects/week-two-sq012-Gsure-tech/src/ProductList - Sheet1.csv";
        BufferedReader br;
        String line = "";
        {
            try {
                br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null) {
                    String[] detailed = line.split(",");
                    if (detailed[0].equals("ProductId"))
                        continue;
                    int productId = Integer.parseInt(detailed[0]);
                    String productCategory = detailed[1];
                    String productName = detailed[2];
                    int quantity = Integer.parseInt(detailed[3]);
                    double price = Double.parseDouble(detailed[4]);
                    int manufactureYear = Integer.parseInt(detailed[5]);
                    int expiryYear = Integer.parseInt(detailed[6]);
                    Store.productList.add(new Products(productId, productCategory, productName, quantity, price, manufactureYear, expiryYear));

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //System.out.println(Store.productList);
        //}

    }
}