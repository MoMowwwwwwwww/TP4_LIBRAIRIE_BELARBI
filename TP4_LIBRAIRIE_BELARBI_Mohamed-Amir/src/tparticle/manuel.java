    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tparticle;

/**
 *
 * @author marvi
 */
public class manuel extends livre {
    
    private String matiere;
    private String niveau; 
    
    public manuel(String description, double prix, int nbrExemplaire, String isbn, int nbrPage, String matiere, String niveau){
        super(description, prix, nbrExemplaire,isbn, nbrPage);
        this.matiere = matiere;
        this.niveau = niveau;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Matiere " + matiere + " - Niveau :" + niveau;
    }

}
