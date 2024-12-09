import entity.Employe;
import entity.Etudiant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employe E=new Employe();
        Etudiant E1=new Etudiant();
        System.out.println("Employe: ");
        E.saisie();
        System.out.println("Info Pour Employe");
        E.afficher();
        System.out.println("**************************************************************");
        System.out.println("Etudiant: ");
        E1.saisie();
        System.out.println("Info pour Etudiant");
        E1.afficher();

    }
}