package Exercises.a1;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {

        Scanner s = new Scanner(System.in);

        Dado dado = new Dado(6);
        Dado dado1 = new Dado(50);

        dado.Roll();
        dado.Roll();
        dado.Roll();
        dado.setSideValue(8);


        dado1.Roll();
        dado1.Roll();
        dado1.Roll();
        dado.setSideValue(55);


    }
}
