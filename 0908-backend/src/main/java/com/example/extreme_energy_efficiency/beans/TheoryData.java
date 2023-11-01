package com.example.extreme_energy_efficiency.beans;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class TheoryData {

    private double TFe=58.5;
    private double R2=1.8;
    private double Tsolid_start=25.0;
    private double Tsolid_end=600.0;
    private double Tgas_start=120.0;
    private double Tgas_end=25.0;

//    public TheoryData() {
//    }

    public TheoryData(double TFe, double R2, double Tsolid_start, double Tsolid_end, double Tgas_start, double Tgas_end) {
        this.TFe = TFe;
        this.R2 = R2;
        this.Tsolid_start = Tsolid_start;
        this.Tsolid_end = Tsolid_end;
        this.Tgas_start = Tgas_start;
        this.Tgas_end = Tgas_end;
    }

    public double getTFe() {
        return TFe;
    }

    public void setTFe(double TFe) {
        this.TFe = TFe;
    }

    public double getR2() {
        return R2;
    }

    public void setR2(double r2) {
        R2 = r2;
    }

    public double getTsolid_start() {
        return Tsolid_start;
    }

    public void setTsolid_start(double tsolid_start) {
        Tsolid_start = tsolid_start;
    }

    public double getTsolid_end() {
        return Tsolid_end;
    }

    public void setTsolid_end(double tsolid_end) {
        Tsolid_end = tsolid_end;
    }

    public double getTgas_start() {
        return Tgas_start;
    }

    public void setTgas_start(double tgas_start) {
        Tgas_start = tgas_start;
    }

    public double getTgas_end() {
        return Tgas_end;
    }

    public void setTgas_end(double tgas_end) {
        Tgas_end = tgas_end;
    }

    @Override
    public String toString() {
        return "TheoryData{" +
                "TFe=" + TFe +
                ", R2=" + R2 +
                ", Tsolid_start=" + Tsolid_start +
                ", Tsolid_end=" + Tsolid_end +
                ", Tgas_start=" + Tgas_start +
                ", Tgas_end=" + Tgas_end +
                '}';
    }
}
