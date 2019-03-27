package assignment2;

import assignment2.classes.Auto;
import assignment2.classes.Vervoermiddel;

public class Main {
    public static void main(String[] args) {
        Vervoermiddel vervoermiddel = new Vervoermiddel();
        Auto auto = new Auto();
        auto.setBrandstof("benzine");
        auto.setGewicht(1100);
        System.out.println(auto.berekenWegenbelasting(auto));
    }
}
