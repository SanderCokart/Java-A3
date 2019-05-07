package assignment2;

import assignment2.classes.Auto;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setMerk("Audi");
        auto.setType("Convertable");
        auto.setKleur("rood");
        auto.setBrandstof("benzine");
        auto.setGewicht(1998);

        System.out.println("Wegenbelasting is: " + auto.berekenWegenbelasting());
    }
}