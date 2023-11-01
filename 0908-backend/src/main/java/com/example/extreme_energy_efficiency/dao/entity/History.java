package com.example.extreme_energy_efficiency.dao.entity;

import java.util.Date;

public class History {
    private int ID;
    private String name;
    private double coke;
    private double ratioCoke;
    private double coal;
    private double ratioCoal;
    private double BFG;
    private double ratioBFG;
    private double COG;
    private double ratioCOG;
    private double electricity;
    private double ratioElectricity;
    private double water;
    private double ratioWater;
    private double N2;
    private double ratioN2;
    private double steam;
    private double ratioSteam;
    private Date updateTime;

    public History(int ID, String name, double coke, double ratioCoke, double coal, double ratioCoal, double BFG, double ratioBFG, double COG, double ratioCOG, double electricity, double ratioElectricity, double water, double ratioWater, double N2, double ratioN2, double steam, double ratioSteam, Date updateTime) {
        this.ID = ID;
        this.name = name;
        this.coke = coke;
        this.ratioCoke = ratioCoke;
        this.coal = coal;
        this.ratioCoal = ratioCoal;
        this.BFG = BFG;
        this.ratioBFG = ratioBFG;
        this.COG = COG;
        this.ratioCOG = ratioCOG;
        this.electricity = electricity;
        this.ratioElectricity = ratioElectricity;
        this.water = water;
        this.ratioWater = ratioWater;
        this.N2 = N2;
        this.ratioN2 = ratioN2;
        this.steam = steam;
        this.ratioSteam = ratioSteam;
        this.updateTime = updateTime;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoke() {
        return coke;
    }

    public void setCoke(double coke) {
        this.coke = coke;
    }

    public double getRatioCoke() {
        return ratioCoke;
    }

    public void setRatioCoke(double ratioCoke) {
        this.ratioCoke = ratioCoke;
    }

    public double getCoal() {
        return coal;
    }

    public void setCoal(double coal) {
        this.coal = coal;
    }

    public double getRatioCoal() {
        return ratioCoal;
    }

    public void setRatioCoal(double ratioCoal) {
        this.ratioCoal = ratioCoal;
    }

    public double getBFG() {
        return BFG;
    }

    public void setBFG(double BFG) {
        this.BFG = BFG;
    }

    public double getRatioBFG() {
        return ratioBFG;
    }

    public void setRatioBFG(double ratioBFG) {
        this.ratioBFG = ratioBFG;
    }

    public double getCOG() {
        return COG;
    }

    public void setCOG(double COG) {
        this.COG = COG;
    }

    public double getRatioCOG() {
        return ratioCOG;
    }

    public void setRatioCOG(double ratioCOG) {
        this.ratioCOG = ratioCOG;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getRatioElectricity() {
        return ratioElectricity;
    }

    public void setRatioElectricity(double ratioElectricity) {
        this.ratioElectricity = ratioElectricity;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getRatioWater() {
        return ratioWater;
    }

    public void setRatioWater(double ratioWater) {
        this.ratioWater = ratioWater;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double n2) {
        N2 = n2;
    }

    public double getRatioN2() {
        return ratioN2;
    }

    public void setRatioN2(double ratioN2) {
        this.ratioN2 = ratioN2;
    }

    public double getSteam() {
        return steam;
    }

    public void setSteam(double steam) {
        this.steam = steam;
    }

    public double getRatioSteam() {
        return ratioSteam;
    }

    public void setRatioSteam(double ratioSteam) {
        this.ratioSteam = ratioSteam;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "History{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", coke=" + coke +
                ", ratioCoke=" + ratioCoke +
                ", coal=" + coal +
                ", ratioCoal=" + ratioCoal +
                ", BFG=" + BFG +
                ", ratioBFG=" + ratioBFG +
                ", COG=" + COG +
                ", ratioCOG=" + ratioCOG +
                ", electricity=" + electricity +
                ", ratioElectricity=" + ratioElectricity +
                ", water=" + water +
                ", ratioWater=" + ratioWater +
                ", N2=" + N2 +
                ", ratioN2=" + ratioN2 +
                ", steam=" + steam +
                ", ratioSteam=" + ratioSteam +
                ", updateTime=" + updateTime +
                '}';
    }
}
