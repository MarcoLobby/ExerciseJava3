package it.DevelHope.ExerciseJava3;

public class House {

    private String address;
    private int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A new House was created, the address is " + address + "and the numbers of floors are " + numberOfFloors);
    };
}
