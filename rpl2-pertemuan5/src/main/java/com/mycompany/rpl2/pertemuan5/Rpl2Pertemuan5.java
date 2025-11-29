/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2.pertemuan5;

import com.mycompany.rpl2.pertemuan5.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author naufa
 */
@SpringBootApplication
public class Rpl2Pertemuan5 implements CommandLineRunner {

    @Autowired
    private MahasiswaController mhsController;
    public static void main(String[] args) {
        SpringApplication.run(Rpl2Pertemuan5.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        mhsController.tampilkanMenu();
    }  
}
