package com.example.extreme_energy_efficiency.dao.entity;

public class RatioMixedOre {
    private String name;
    private double ore1;
    private double ore2;
    private double ore3;
    private double ore4;
    private double ore5;
    private double ore6;
    private double ore7;

    public RatioMixedOre(String name, double ore1, double ore2, double ore3, double ore4, double ore5, double ore6, double ore7) {
        this.name = name;
        this.ore1 = ore1;
        this.ore2 = ore2;
        this.ore3 = ore3;
        this.ore4 = ore4;
        this.ore5 = ore5;
        this.ore6 = ore6;
        this.ore7 = ore7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOre1() {
        return ore1;
    }

    public void setOre1(double ore1) {
        this.ore1 = ore1;
    }

    public double getOre2() {
        return ore2;
    }

    public void setOre2(double ore2) {
        this.ore2 = ore2;
    }

    public double getOre3() {
        return ore3;
    }

    public void setOre3(double ore3) {
        this.ore3 = ore3;
    }

    public double getOre4() {
        return ore4;
    }

    public void setOre4(double ore4) {
        this.ore4 = ore4;
    }

    public double getOre5() {
        return ore5;
    }

    public void setOre5(double ore5) {
        this.ore5 = ore5;
    }

    public double getOre6() {
        return ore6;
    }

    public void setOre6(double ore6) {
        this.ore6 = ore6;
    }

    public double getOre7() {
        return ore7;
    }

    public void setOre7(double ore7) {
        this.ore7 = ore7;
    }

    @Override
    public String toString() {
        return "RatioMixedOre{" +
                "name='" + name + '\'' +
                ", ore1=" + ore1 +
                ", ore2=" + ore2 +
                ", ore3=" + ore3 +
                ", ore4=" + ore4 +
                ", ore5=" + ore5 +
                ", ore6=" + ore6 +
                ", ore7=" + ore7 +
                '}';
    }
}
