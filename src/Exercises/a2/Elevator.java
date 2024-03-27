package Exercises.a2;

import java.util.Scanner;

public class Elevator {
    Scanner s = new Scanner(System.in);

    private int currentFloor;
    private int totalFloors;
    private int elevatorCapacity;
    private int peopleOnElevator;
    private boolean isEmpty;
    private boolean isFull;
    private boolean isOnGround;
    private boolean isOnTop;


    public Elevator() {

        this.isEmpty = true;
        this.isFull = false;
        this.peopleOnElevator = 0;
        this.elevatorCapacity = 0;

    }
    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getElevatorCapacity() {
        return elevatorCapacity;
    }

    public void setElevatorCapacity(int elevatorCapacity) {
        this.elevatorCapacity = elevatorCapacity;
    }

    public int getPeopleOnElevator() {
        return peopleOnElevator;
    }

    public void setPeopleOnElevator(int peopleOnElevator) {
        this.peopleOnElevator = peopleOnElevator;
    }

    // Getters e Setters dos booleans --


    public boolean isEmpty() {
        if (peopleOnElevator >= 1) {
            this.isEmpty = false;
        }
        return this.isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isOnGround() {
        return isOnGround;
    }

    public void setOnGround(boolean onGround) {
        isOnGround = onGround;
    }

    public boolean isOnTop() {
        return isOnTop;
    }

    public void setOnTop(boolean onTop) {
        isOnTop = onTop;
    }

    //Methods

    public void menu() {
        System.out.println("Wich action happens next:");
        System.out.println("1 - Alguem entra no elevador");
        System.out.println("2 - Alguem sai do elevador");
        System.out.println("3 - O elavador sobe");
        System.out.println("4 - O elevador desce");
        int escolha = s.nextInt();
    }

    public void initiate() {
        System.out.println("Insert now the current data about the building...");
        System.out.println("Insert the capacity of the elevator: ");
        this.elevatorCapacity = s.nextInt();
        System.out.println("Insert numbers of floors: ");
        this.totalFloors = s.nextInt();
    }
    public void enter() {
        if (this.isEmpty && !this.isFull) {
            peopleOnElevator += 1;
            System.out.println("One person entered the elevator...");
            this.isEmpty = false;
            if (peopleOnElevator >= elevatorCapacity) {
                this.isFull = true;
            }
        }


    }
    public void leave() {
        if (peopleOnElevator >= 1) {
            System.out.println("One person leave the elevator...");
        }
        if (isEmpty) {
            System.out.println("There is no one is on the elevator...");
        }
    }
    public void rise() {
        if (isOnTop) {
            System.out.println("The elevator is on top floor...");
        }
        else {
            System.out.println("The elevator rises one floor...");
        }
    }
    public void descend() {
        if (isOnGround) {
            System.out.println("The elevator can't go down, it's on bottom floor...");
        }
        else {
            System.out.println("The elevator went down one floor...");
        }
    }
}
