/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2.pertemuan2;

/**
 *
 * @author naufa
 */
public class Saller extends User{
    private String product;
    
    public void addProduct(String productName){
        System.out.println("Saller menggunakan produk : " + productName);
        this.product = productName;
    }
}
