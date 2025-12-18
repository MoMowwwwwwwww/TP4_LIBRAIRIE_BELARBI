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
public class magazine extends article{
    
    private String issn;
    private String periodicite;
    private LocalDate datePublication; 
    
    public magazine(String description, double prix, int nbrExemplaire, String issn, String periodicite, LocalDate datePublication) {
        super(description, prix, nbrExemplaire);
        this.issn = issn;
        this.periodicite = periodicite;
        this.datePublication = datePublication;
    }
    
    @Override
    public String getNumero(){
        return issn;
    }
    
       @Override
    public String toString() {
        return super.toString() + "ISSN " + issn + " - periodicité :" + periodicite + " date de publication " + datePublication;
    }

}
