package Exercises.a1;

import java.util.Random;

public class Dado {

    private int sides;
    private int sideValue;

    public Dado(int sides) {

    }

    public int getSides() {
        return sides;
    }
    public int getSideValue() {
        return sideValue;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }
    public void setSideValue(int sideValue) {

        if(sideValue >= 1 && sideValue <= sides) {
            this.sideValue = sideValue;
        }
        else {
            System.out.println("This value isn't supported...");
        }
    }

    public void roll() {
        Random random = new Random();
        sideValue = random.nextInt(sides) + 1;
        System.out.println(sideValue);
    }




}
