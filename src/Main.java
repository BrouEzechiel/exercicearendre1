import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        int tentative;
        int essais = 0;
        boolean trouve = false;

        while(!trouve && essais < 10) {
            System.out.println("essayez de deviner le nombre exact");
            tentative = sc.nextInt();
            essais ++;
            if(tentative < randomNum) {
                System.out.println("le nombre déviné est superieur");
            } else if (tentative > randomNum ) {
                System.out.println("le nombre déviné est inferieur");
            } else {
                trouve = true;
                System.out.println("il a gagné en effectuant le "+ essais +" eme essais");
            }
        }
        if (!trouve) {
            System.out.println("Perdu ! Le nombre était : " + randomNum);
        }
        sc.close();
    }
}
