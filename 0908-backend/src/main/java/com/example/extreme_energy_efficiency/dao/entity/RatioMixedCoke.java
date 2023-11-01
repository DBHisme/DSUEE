package com.example.extreme_energy_efficiency.dao.entity;

public class RatioMixedCoke {
    private String name;
    private double coke1;
    private double coke2;

    public RatioMixedCoke(String name, double coke1, double coke2) {
        this.name = name;
        this.coke1 = coke1;
        this.coke2 = coke2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoke1() {
        return coke1;
    }

    public void setCoke1(double coke1) {
        this.coke1 = coke1;
    }

    public double getCoke2() {
        return coke2;
    }

    public void setCoke2(double coke2) {
        this.coke2 = coke2;
    }

    @Override
    public String toString() {
        return "RatioMixedCoke{" +
                "name='" + name + '\'' +
                ", coke1=" + coke1 +
                ", coke2=" + coke2 +
                '}';
    }

}
