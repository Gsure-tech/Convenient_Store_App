package org.example.models;


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
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
    }
    }

}
