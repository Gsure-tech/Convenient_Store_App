package org.example.models;


import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public static List<Products> productList = new ArrayList<>();
  String path ="/Users/gsure-tech/IdeaProjects/Convienience_Store/src/productslist.csv";
BufferedReader br;
String line ="";
    {
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line= br.readLine())!=null){
                String[] detailed = line.split(",");
                if(detailed[0].equals("Product_Id"))
                continue;
                int productId = Integer.parseInt(detailed[0]);
                String productCategory = detailed[1];
                String productName = detailed[2];
                int quantity = Integer.parseInt(detailed[3]);
                double price = Double.parseDouble(detailed[4]);
                int manufactureYear = Integer.parseInt(detailed[5]);
                int expiryYear = Integer.parseInt(detailed[6]);
                productList.add(new Products(productId,productCategory,productName,quantity,price,manufactureYear,expiryYear));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
// New changes to week 2
}
