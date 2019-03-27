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
}
