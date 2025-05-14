import java.util.Random;
import java.util.Scanner;

// Programme principal qui implémente un jeu de devinette de nombre
public class Main {
    public static void main(String[] args) {
        // Initialisation des outils nécessaires
        Scanner sc = new Scanner(System.in);  // Pour lire les entrées du joueur
        Random rand = new Random();           // Pour générer un nombre aléatoire

        // Génération d'un nombre aléatoire entre 1 et 100
        int randomNum = rand.nextInt(100) + 1;

        // Variables pour le jeu
        int tentative;      // Stocke la tentative du joueur
        int essais = 0;     // Compteur d'essais
        boolean trouve = false;  // Indicateur si le nombre a été trouvé

        // Boucle principale du jeu
        // Continue tant que le nombre n'est pas trouvé ET qu'il reste des essais (max 10)
        while(!trouve && essais < 10) {
            System.out.println("Essayez de deviner le nombre exact (entre 1 et 100)");
            tentative = sc.nextInt();  // Lecture de la tentative du joueur
            essais++;                 // Incrémentation du compteur d'essais

            // Vérification de la tentative par rapport au nombre cible
            if(tentative < randomNum) {
                System.out.println("Le nombre à deviner est supérieur");
            } else if (tentative > randomNum) {
                System.out.println("Le nombre à deviner est inférieur");
            } else {
                // Cas où le joueur a trouvé le nombre
                trouve = true;
                System.out.println("Bravo ! Vous avez gagné en " + essais + " essai(s)");
            }
        }

        // Message si le joueur a épuisé tous ses essais sans trouver
        if (!trouve) {
            System.out.println("Perdu ! Le nombre était : " + randomNum);
        }

        sc.close();  // Fermeture du scanner pour libérer les ressources
    }
}