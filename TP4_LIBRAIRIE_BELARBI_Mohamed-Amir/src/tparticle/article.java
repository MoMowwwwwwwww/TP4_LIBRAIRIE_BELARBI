/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tparticle;

/**
 *
 * @author marvi
 */
public abstract class article {
    
    private String description;
    private double prix;
    private int nbrExemplaire;
    
    public int getNbrExemplaire() {
    return nbrExemplaire;
}
    
    public int getprix() {
    return prix;
}
    public article(String description, double prix, int nbrExemplaire){
        this.description = description;
        this.prix = prix;
        this.nbrExemplaire = nbrExemplaire;
    }
    
    public abstract String getNumero();

    public boolean placerApres(article autre){
        
        return this.getNumero().compareTo(autre.getNumero()) > 0;
    }
    
    public void ajouter(int qte){
        nbrExemplaire+=qte;
    }
    
    
    public void retirer(int qte){
        nbrExemplaire-=qte;
    }
    

    @Override
    public String toString(){
        return description + " - Prix " + prix + "€ - Stock : " + nbrExemplaire;
    }
    
}
