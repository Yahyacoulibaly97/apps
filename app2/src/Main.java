import entity.Produit;
import entity.ProduitImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProduitImpl Pdr = new ProduitImpl();
        Produit p= Pdr.saisieProduit();
        System.out.println("Information du Produit: ");
        Pdr.afficheProduit(p);
    }
}
