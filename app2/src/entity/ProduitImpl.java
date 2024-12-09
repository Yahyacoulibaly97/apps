package entity;

import service.IProduit;

import java.util.Scanner;

public class ProduitImpl implements IProduit {
    @Override
    public Produit saisieProduit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le ref produit: ");
        String ref = sc.nextLine();
        System.out.println("saisir le Libelle du produit: ");
        String libelle = sc.nextLine();
        System.out.println("Saisir la quantite de produit: ");
        double quantite = sc.nextDouble();
        System.out.println("Saisir la prix du produit: ");
        int prix = sc.nextInt();
        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void afficheProduit(Produit produit) {
        System.out.println("Ref:"+produit.getRef());
        System.out.println("Libelle:"+produit.getLibelle());
        System.out.println("Quantite:"+produit.getQuantite());
        System.out.println("Prix:"+produit.getPrix());

    }
}
