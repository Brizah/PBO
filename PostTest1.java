/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;


public class PostTest1 {

    public static void main(String[] args) {
        ArrayList<Produk> products = new ArrayList<>();
        products.add(new Produk("smartphone",500000));
        products.add(new Produk("TV", 800000));
        products.add(new Produk("Kamera", 600000));
        products.add(new Produk("Jam Tangan", 100000));
        
    for (Produk p : products) {
    System.out.println("produk:" + p.nama + ", harga: " + p.harga); 
        }
    }
}

    