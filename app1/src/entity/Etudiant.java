package entity;

import service.IPersonne;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne {
    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, double moyenne, String matricule) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String generateMtricule(){
       String mat;
       mat="Mat-"+this.nom.charAt(0)+this.prenom.charAt(0);
       return mat.toUpperCase();
    }
    @Override
    public void  saisie(){
        saisieP();
        matricule=generateMtricule();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Saisir la moyenne");
            moyenne=sc.nextDouble();
        }while (moyenne < 0 || moyenne > 20);
    }
    @Override
    public void afficher(){
        System.out.println("Matricule:"+this.matricule.toUpperCase());
        System.out.println("Nom:"+this.nom);
        System.out.println("Prenom:"+this.prenom);
        System.out.println("Moyenne:"+this.moyenne);
    }
}
