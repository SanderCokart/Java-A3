package assignment3.classes;

public class Wegenbelasting {

    public static double berekenWegenbelasting(Auto auto) {
        switch (auto.getBrandstof()) {
            case "benzine":
                if (auto.getGewicht() <= 1000) {
                    return 241.45;
                } else {
                    return 584.89;
                }

            case "diesel":
                if (auto.getGewicht() <= 900) {
                    return 182.24;
                } else {
                    return 499.99;
                }

            case "gas":
                if (auto.getGewicht() <= 1100) {
                    return 309.83;
                } else {
                    return 629.92;
                }

            default:
                return 0.00;
        }
    }
}
