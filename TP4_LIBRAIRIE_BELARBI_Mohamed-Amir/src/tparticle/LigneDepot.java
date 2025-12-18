/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tparticle;

/**
 *
 * @author marvi
 */
public class LigneDepot {
    
    private String numero;
    private int quantite;
    
    private LigneDepot[] lignes;
    private int nbLignes;
    
    
    public LigneDepot(String numero, int quantite){
        this.numero = numero;
        this.quantite = quantite;
        
    }
    
    @Override
    public String toString(){
        return numero + " : " + quantite + " ex. ";
    }
}
