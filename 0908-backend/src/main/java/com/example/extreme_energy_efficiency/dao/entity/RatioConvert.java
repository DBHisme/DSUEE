package com.example.extreme_energy_efficiency.dao.entity;

import lombok.Data;

@Data
public class RatioConvert {
    private double coke = 0.8821;
    private double coal = 0.857;
    private double BFG = 0.0;
    private double COG = 0.643;
    private double electricity = 0.1229;
    private double water = 0.235;
    private double N2 = 0.044;
    private double steam = 0.1057;

    public RatioConvert(double coke, double coal, double BFG, double COG, double electricity, double water, double N2, double steam) {
        this.coke = coke;
        this.coal = coal;
        this.BFG = BFG;
        this.COG = COG;
        this.electricity = electricity;
        this.water = water;
        this.N2 = N2;
        this.steam = steam;
    }

    public double getCoke() {
        return coke;
    }

    public void setCoke(double coke) {
        this.coke = coke;
    }

    public double getCoal() {
        return coal;
    }

    public void setCoal(double coal) {
        this.coal = coal;
    }

    public double getBFG() {
        return BFG;
    }

    public void setBFG(double BFG) {
        this.BFG = BFG;
    }

    public double getCOG() {
        return COG;
    }

    public void setCOG(double COG) {
        this.COG = COG;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double n2) {
        N2 = n2;
    }

    public double getSteam() {
        return steam;
    }

    public void setSteam(double steam) {
        this.steam = steam;
    }

    @Override
    public String toString() {
        return "ConvertRatio{" +
                "coke=" + coke +
                ", coal=" + coal +
                ", BFG=" + BFG +
                ", COG=" + COG +
                ", electricity=" + electricity +
                ", water=" + water +
                ", N2=" + N2 +
                ", steam=" + steam +
                '}';
    }
}
