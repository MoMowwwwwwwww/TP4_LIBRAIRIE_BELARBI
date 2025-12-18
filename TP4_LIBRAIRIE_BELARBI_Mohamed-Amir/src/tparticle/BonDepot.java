/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tparticle;

import java.time.LocalDate;

/**
 *
 * @author marvi
 */
public class BonDepot {
    
    private static int compteur = 1; 
    
    private int numeroBon;
    private String telephone;
    private LocalDate dateDepot;
    private int Nbrligne;
    private LigneDepot[] lignes; 
    
    
    
    
    public BonDepot(String telephone, int maxArticle){
        this.numeroBon = compteur++;
        this.telephone = telephone;
        this.dateDepot = LocalDate.now();
        this.lignes = new LigneDepot[maxArticle];
        this.Nbrligne = 0;
    }
            
        
    
}
