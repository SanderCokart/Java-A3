package assignment3;

import assignment3.classes.Auto;

import static assignment3.classes.Wegenbelasting.berekenWegenbelasting;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setMerk("Audi");
        auto.setType("Convertable");
        auto.setKleur("rood");
        auto.setBrandstof("benzine");
        auto.setGewicht(1998);

        System.out.println("Wegenbelasting is: " + berekenWegenbelasting(auto));
    }
}