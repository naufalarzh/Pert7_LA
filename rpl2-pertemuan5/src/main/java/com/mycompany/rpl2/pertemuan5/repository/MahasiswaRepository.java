/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.rpl2.pertemuan5.repository;

import com.mycompany.rpl2.pertemuan5.model.MahasiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author naufa
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<MahasiswaModel, Long>{
    
}
