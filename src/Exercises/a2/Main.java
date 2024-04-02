package Exercises.a2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {

        Scanner s = new Scanner(System.in);
        Elevator elvt = new Elevator();

        System.out.println("The building is opening...");

        elvt.initiate();

        elvt.menu();



    }
}
