/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tparticle;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author marvi
 */
public class Etablissement {
        
    private String nom;
    private article[] article;
    private BonDepot[] BonDepot;
    
    
    private int nbArticles;
    private int nbDepot;  
    
    
    private int maxArticles;  
    private int maxDepot;  

    public Etablissement(String nom) {
        this.nom = nom;

        this.article = new article[maxArticles];
        this.nbArticles = 0;
        
        this.BonDepot = new BonDepot[maxDepot];
        this.nbDepot = 0;
    }
    
    private void insererTrie(article a){
        int i =nbArticles - 1;
        while ( i >= 0 && a.placerApres(article[i])){
            article[i + 1] = article[i];
            
            i--;   
        }
        article[i + 1] = a;
        nbArticles++;
        
    }
    
    public void ajouterLivre(String description, double prix, int stock, String isbn, int pages){
        insererTrie(new livre(description, prix, stock, isbn, pages));
}
    public void ajouterManuel(String description, double prix, int stock,
                          String isbn, int pages, String matiere, String niveau){
    insererTrie(new manuel(description, prix, stock, isbn, pages, matiere, niveau));
}

    public void ajouterMagazine(String description, double prix, int stock,
                            String issn, String periodicite, LocalDate datePublication){
    insererTrie(new magazine(description, prix, stock, issn, periodicite, datePublication));
}
    
    public article rechercher(String numero){
        for (int i =0; i < nbArticles; i++){
            if(article[i].getNumero().equals(numero)){
                return article[i];
            }
        } 
        return null;
    }
    
    public article listerArticle(){
        for (int i =0; i < nbArticles; i++){
            return article[i];
        }
    }
    
    public void listerBonsDepot() {
    for (int i = 0; i < nbDepot; i++) {
        System.out.println(BonDepot[i]);
    }
}
    
    public void lister() {
    article[] t = new article[nbArticles];
    for (int i = 0; i < nbArticles; i++) {
        t[i] = article[i];
    }

    for (int i = 1; i < t.length; i++) {
        article x = t[i];
        int j = i - 1;
        while (j >= 0 && t[j].getNbrExemplaire() > x.getNbrExemplaire()) {
            t[j + 1] = t[j];
            j--;
        }
        t[j + 1] = x;
    }

    for (int i = 0; i < t.length; i++) {
        System.out.println(t[i] + " prix=" + t[i].getprix());
    }
}







@Override
    public String toString() {
    String boutique = "Boutique: " + nom + " | Articles: ";
    for (int i = 0; i < nbArticles; i++) boutique += article[i] + " ";
    boutique += "| Bons: ";
    for (int i = 0; i < nbDepot; i++) boutique += BonDepot[i] + " ";
    return boutique;
}
        
}
