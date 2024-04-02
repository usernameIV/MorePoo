package Exercises.a2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Elevator {
    Scanner s = new Scanner(System.in);
    Scanner n = new Scanner(System.in);
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
        this.currentFloor = 0;

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
        if (peopleOnElevator == 0) {
                this.isEmpty = true;
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
        boolean exit = false;
        do {
            System.out.println("Wich action happens next:");
            System.out.println("1 - Someone enters the elevator");
            System.out.println("2 - Someone leaves the elevator");
            System.out.println("3 - The elevator goes upwards  ");
            System.out.println("4 - The elevator goes downwards");
            System.out.println("5 - The program shuts down ");
            int escolha = s.nextInt();
            try {
                switch (escolha) {
                    case 1:
                        enter();
                        if (peopleOnElevator < elevatorCapacity) {
                            peopleOnElevator += 1;
                            isEmpty = false;
                        }
                        System.out.println("Current people on the elevator: " + peopleOnElevator);
                        System.out.println("Elevator capacity: " + elevatorCapacity);
                        break;
                    case 2:
                        leave();
                        if (!isEmpty) {
                            peopleOnElevator -= 1;
                        }
                        System.out.println("Current people on the elevator: " + peopleOnElevator);
                        System.out.println("Elevator capacity: " + elevatorCapacity);
                        break;
                    case 3:
                        rise();
                        System.out.println("Current people on the elevator: " + peopleOnElevator);
                        System.out.println("Elevator capacity: " + elevatorCapacity);
                        break;
                    case 4:
                        descend();
                        System.out.println("Current people on the elevator: " + peopleOnElevator);
                        System.out.println("Elevator capacity: " + elevatorCapacity);
                        break;
                    case 5:
                        System.out.println("System is now shutting off................ ");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Dumbass");
                }
            }  catch (InputMismatchException e) {
                System.out.println("Thats not an option");
                n.next();
            }
        } while (!exit);
    }

    public void initiate() {
        System.out.println("Insert now the current data about the building...");
        System.out.println("Insert the capacity of the elevator: ");
        this.elevatorCapacity = s.nextInt();
        System.out.println("Insert numbers of floors: ");
        this.totalFloors = s.nextInt();
    }
    public void enter() {
        if (peopleOnElevator < elevatorCapacity) {
            System.out.println("One person has entered the elevator...");
        }
        if (peopleOnElevator == elevatorCapacity) {
            System.out.println("The elevator has reached it's max capacity...");
        }
    }
    public void leave() {
        if (peopleOnElevator == 0) {
            this.isEmpty = true;
        }
        if (isEmpty) {
            System.out.println("There is no one inside the elevator...");
        }
        if (!isEmpty) {
            System.out.println("One person leaves the elevator...");
        }

    }
    public void rise() {
        if (currentFloor == totalFloors) {
            isOnTop = true;
        }
        else {
            isOnTop = false;
        }
        if (isOnTop) {
            System.out.println("The elevator is on top floor...");
        }
        if (!isOnTop){
            System.out.println("The elevator rises one floor...");
            System.out.println("Current floor: " + (currentFloor += 1));
        }
    }
    public void descend() {
        if (currentFloor == 0) {
            isOnGround = true;
        }
        else {
            isOnGround = false;
        }
        if (isOnGround) {
            System.out.println("The elevator can't go down, it's on bottom floor...");
        }
        if (!isOnGround) {
            System.out.println("The elevator went down one floor...");
            System.out.println("Current floor: " + (currentFloor -= 1));
        }
    }
}
