package com.example.extreme_energy_efficiency.beans.vo;

public class ActualVo {
    private double cokeConsumption;         //焦粉消耗
    private double coalConsumption;         //无烟煤消耗
    private double BFGConsumption;          //BFG
    private double COGConsumption;          //COG
    private double electricityConsumption;  //电耗
    private double waterConsumption;        //水耗
    private double N2Consumption;           //N2介质
    private double steamConsumption;        //回收蒸汽

    public ActualVo(double cokeConsumption, double coalConsumption, double BFGConsumption, double COGConsumption, double electricityConsumption, double waterConsumption, double N2Consumption, double steamConsumption) {
        this.cokeConsumption = cokeConsumption;
        this.coalConsumption = coalConsumption;
        this.BFGConsumption = BFGConsumption;
        this.COGConsumption = COGConsumption;
        this.electricityConsumption = electricityConsumption;
        this.waterConsumption = waterConsumption;
        this.N2Consumption = N2Consumption;
        this.steamConsumption = steamConsumption;
    }

    public ActualVo() {
    }

    public double getCokeConsumption() {
        return cokeConsumption;
    }

    public void setCokeConsumption(double cokeConsumption) {
        this.cokeConsumption = cokeConsumption;
    }

    public double getCoalConsumption() {
        return coalConsumption;
    }

    public void setCoalConsumption(double coalConsumption) {
        this.coalConsumption = coalConsumption;
    }

    public double getBFGConsumption() {
        return BFGConsumption;
    }

    public void setBFGConsumption(double BFGConsumption) {
        this.BFGConsumption = BFGConsumption;
    }

    public double getCOGConsumption() {
        return COGConsumption;
    }

    public void setCOGConsumption(double COGConsumption) {
        this.COGConsumption = COGConsumption;
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(double electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    public double getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(double waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public double getN2Consumption() {
        return N2Consumption;
    }

    public void setN2Consumption(double n2Consumption) {
        N2Consumption = n2Consumption;
    }

    public double getSteamConsumption() {
        return steamConsumption;
    }

    public void setSteamConsumption(double steamConsumption) {
        this.steamConsumption = steamConsumption;
    }

    @Override
    public String toString() {
        return "ActualVo{" +
                "cokeConsumption=" + cokeConsumption +
                ", coalConsumption=" + coalConsumption +
                ", BFGConsumption=" + BFGConsumption +
                ", COGConsumption=" + COGConsumption +
                ", electricityConsumption=" + electricityConsumption +
                ", waterConsumption=" + waterConsumption +
                ", N2Consumption=" + N2Consumption +
                ", steamConsumption=" + steamConsumption +
                '}';
    }
}
