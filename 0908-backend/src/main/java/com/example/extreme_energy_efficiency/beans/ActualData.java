package com.example.extreme_energy_efficiency.beans;

public class ActualData {
    private double MQuicklime;
    private double RatioCoke1; //粉焦
    private double RatioCoke2; //无烟煤
    private double RatioOre1; //匀矿A
    private double RatioOre2; //匀矿B
    private double RatioOre3; //匀矿C
    private double RatioOre4; //匀矿D
    private double RatioOre5; //OG泥
    private double RatioOre6; //小球
    private double RatioOre7; //烧结粉

//    public ActualData() {
//        this.MQuicklime=38.4;
//        this.RatioCoke1 = 58.0;
//        this.RatioCoke2 = 42.0;
//        this.RatioOre1 = 23.979;
//        this.RatioOre2 = 22.442;
//        this.RatioOre3 = 22.442;
//        this.RatioOre4 = 22.442;
//        this.RatioOre5 = 0.0;
//        this.RatioOre6 = 2.244;
//        this.RatioOre7 = 6.452;
//    }

    public ActualData(double MQuicklime, double RatioCoke1, double RatioCoke2, double RatioOre1, double RatioOre2, double RatioOre3, double RatioOre4, double RatioOre5, double RatioOre6, double RatioOre7) {
        this.MQuicklime = MQuicklime;
        this.RatioCoke1 = RatioCoke1;
        this.RatioCoke2 = RatioCoke2;
        this.RatioOre1 = RatioOre1;
        this.RatioOre2 = RatioOre2;
        this.RatioOre3 = RatioOre3;
        this.RatioOre4 = RatioOre4;
        this.RatioOre5 = RatioOre5;
        this.RatioOre6 = RatioOre6;
        this.RatioOre7 = RatioOre7;
    }

    public double getMQuicklime() {
        return MQuicklime;
    }

    public void setMQuicklime(double MQuicklime) {
        this.MQuicklime = MQuicklime;
    }

    public double getRatioCoke1() {
        return RatioCoke1;
    }

    public void setRatioCoke1(double ratioCoke1) {
        RatioCoke1 = ratioCoke1;
    }

    public double getRatioCoke2() {
        return RatioCoke2;
    }

    public void setRatioCoke2(double ratioCoke2) {
        RatioCoke2 = ratioCoke2;
    }

    public double getRatioOre1() {
        return RatioOre1;
    }

    public void setRatioOre1(double ratioOre1) {
        RatioOre1 = ratioOre1;
    }

    public double getRatioOre2() {
        return RatioOre2;
    }

    public void setRatioOre2(double ratioOre2) {
        RatioOre2 = ratioOre2;
    }

    public double getRatioOre3() {
        return RatioOre3;
    }

    public void setRatioOre3(double ratioOre3) {
        RatioOre3 = ratioOre3;
    }

    public double getRatioOre4() {
        return RatioOre4;
    }

    public void setRatioOre4(double ratioOre4) {
        RatioOre4 = ratioOre4;
    }

    public double getRatioOre5() {
        return RatioOre5;
    }

    public void setRatioOre5(double ratioOre5) {
        RatioOre5 = ratioOre5;
    }

    public double getRatioOre6() {
        return RatioOre6;
    }

    public void setRatioOre6(double ratioOre6) {
        RatioOre6 = ratioOre6;
    }

    public double getRatioOre7() {
        return RatioOre7;
    }

    public void setRatioOre7(double ratioOre7) {
        RatioOre7 = ratioOre7;
    }

    @Override
    public String toString() {
        return "ActualData{" +
                "MQuicklime=" + MQuicklime +
                ", RatioCoke1=" + RatioCoke1 +
                ", RatioCoke2=" + RatioCoke2 +
                ", RatioOre1=" + RatioOre1 +
                ", RatioOre2=" + RatioOre2 +
                ", RatioOre3=" + RatioOre3 +
                ", RatioOre4=" + RatioOre4 +
                ", RatioOre5=" + RatioOre5 +
                ", RatioOre6=" + RatioOre6 +
                ", RatioOre7=" + RatioOre7 +
                '}';
    }
}
