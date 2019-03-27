package assignment3;

import assignment3.classes.Auto;
import assignment3.classes.Vervoermiddel;

public class Main {
    public static void main(String[] args) {
        Vervoermiddel vervoermiddel = new Vervoermiddel();
        Auto auto = new Auto();
        auto.setBrandstof("benzine");
        auto.setGewicht(1100);
        System.out.println(auto.berekenWegenbelasting(auto));
    }
}
