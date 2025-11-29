/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2.pertemuan2;

/**
 *
 * @author naufa
 */
public class Rpl2Pertemuan2 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Saller saller = new Saller();
        saller.addProduct("nasi gorang");
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();
    }
}
