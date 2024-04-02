package Exercises.a1;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {

        Scanner s = new Scanner(System.in);

        Dado dado = new Dado(6);
        Dado dado1 = new Dado(50);

        dado.roll();
        dado.roll();
        dado.roll();
        dado.setSideValue(5);


        dado1.roll();
        dado1.roll();
        dado1.roll();
        dado1.setSideValue(29);


    }
}
