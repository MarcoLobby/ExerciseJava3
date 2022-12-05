package it.DevelHope.ExerciseJava3;

public class Start {
    public static void main(String[] args) {
        System.out.println("----------------");
        System.out.println("We are creating the Houses");
        System.out.println("----------------");

        House house1, house2;
        house1 = new House("Corso Dei Mille, n°300 ", 3);
        System.out.println("----------------");
        house2 = new House("Via Artemide, n°39 ", 4);

        System.out.println("----------------");
        System.out.println("Created two new houses");
    }
}
