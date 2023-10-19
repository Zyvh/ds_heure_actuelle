package fr.nassim;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // 1. Variables
        int heures;
        int minutes;
        int secondes;

        // 2. Interraction utilisateur
        System.out.println("Bonjour !");
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les heures :");
        heures = clavier.nextInt();
        System.out.println("Entrez les minutes :");
        minutes = clavier.nextInt();
        System.out.println("Entrez les secondes :");
        secondes = clavier.nextInt();

        clavier.close();

        int secondesEcoulees = 86400 - secondes;

        // 3. Retour à l'utilisateur
        System.out.println("Il est " + heures + "h " + minutes + "m " + secondes + "s");
        System.out.println("Depuis minuit, il s'est écoulé : " + secondesEcoulees + "s");

        // 4. Condition de salutation
        if (heures < 9) {
            System.out.println("J'espère que vous avez bien dormi !");
        } else if (heures > 19) {
            System.out.println("Bonne soirée !");
        } else {
            System.out.println("Bonne journée !");
        }
    }

}
