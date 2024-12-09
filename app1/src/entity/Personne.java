package entity;

import service.IPersonne;

import java.util.Scanner;

public class Personne implements IPersonne {
    @Override
    public void saisie() {

    }

    @Override
    public void afficher() {

    }

    protected String nom;
    protected String prenom;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void saisieP(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom: ");
        this.nom = clavier.nextLine();
        System.out.println("Veuillez saisir le prenom: ");
        this.prenom = clavier.nextLine();

    }
}
