
package tparticle;

/**
 *
 * @author marvi
 */
public class livre extends article{
    
    protected String isbn;
    protected int nbrPage;
        
    
    public livre(String description, double prix, int nbrExemplaire, String isbn, int nbrPage){
        super(description, prix, nbrExemplaire);
        this.isbn = isbn;
        this.nbrPage = nbrPage;
    }
    
    @Override
    public String getNumero() {
        return isbn;
    }
    
    @Override
    public String toString(){
        return super.toString() +" - ISBN : " + isbn + " - " + nbrPage + " pages";
    }
}
