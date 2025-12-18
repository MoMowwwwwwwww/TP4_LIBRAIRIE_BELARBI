/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tparticle;

import java.time.LocalDate;

/**
 *
 * @author marvi
 */
public class main {
    public static void main(String[] args) {
        
        // Création de quelques produits
        livre l1 = new livre("livre cool", 50, 2, "345345345",5);
        System.out.println(l1.getNumero());
        System.out.println(l1.toString());
        
        manuel m1 = new manuel("Manuel cool", 500, 1, "3453435345",456,"Java","Année 3");
        System.out.println(m1.getNumero());
        System.out.println(m1.toString());

        magazine magaz1 = new magazine("Magazine cool", 5000, 1, "63435345","mensuel",LocalDate.parse ("2025-11-28"));
        System.out.println(magaz1.getNumero());
        System.out.println(magaz1.toString());
                
    }
        
}