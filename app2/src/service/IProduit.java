package service;

import entity.Produit;

public interface IProduit {
    public Produit saisieProduit();
    public void afficheProduit(Produit produit);
}
