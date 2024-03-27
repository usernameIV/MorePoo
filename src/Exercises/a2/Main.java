package Exercises.a2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {

        Scanner s = new Scanner(System.in);
        Elevator elvt = new Elevator();

        System.out.println("O prédio entrara em funcionamento");
        elvt.initiate();

        System.out.println("Wich action happens next:");
        System.out.println("1 - Alguem entra no elevador");
        System.out.println("2 - Alguem sai do elevador");
        System.out.println("3 - O elavador sobe");
        System.out.println("4 - O elevador desce");
        int escolha = s.nextInt();
        boolean exit = false;
do {
    try {
        switch (escolha) {
            case 1:
                elvt.enter();
                elvt.menu();
                break;
            default:
                System.out.println("Dumbass");
        }

    }  catch (InputMismatchException e) {
        System.out.println("Thats not an option");
        s.next();
    }
} while (!exit);



    }
}
