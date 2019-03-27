package assignment3.classes;

public class Auto extends Vervoermiddel {
    private int gewicht;
    private double belasting;
    private String brandstof;

    public double getBelasting() {
        return belasting;
    }

    public void setBelasting(double tax) {
        this.belasting = tax;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int weight) {
        this.gewicht = weight;
    }

    public String getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }


    public double berekenWegenbelasting(Auto auto) {
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
