package entity;

import service.IPersonne;

import java.util.Scanner;

public class Employe extends Personne implements IPersonne {
    private String fonction;
    private int salaire;

    public Employe() {
    }
    public Employe(String fonction, int salaire) {
        this.fonction = fonction;
        this.salaire = salaire;
    }
    public String getFonction() {
        return fonction;
    }
    public int getSalaire() {
        return salaire;
    }
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie() {
        saisieP();
        Scanner sc = new Scanner(System.in);
        System.out.println("La Fonction: ");
        fonction=sc.nextLine();
        do {
            System.out.println("Salaire please: ");
            salaire=sc.nextInt();
        }while (salaire<=0);


    }

    @Override
    public void afficher() {
        System.out.println("Nom est : "+this.nom);
        System.out.println("Prenom est : "+this.prenom);
        System.out.println("La fonction est :"+this.fonction);
        System.out.println("Salaire est :"+this.salaire);
    }
}
