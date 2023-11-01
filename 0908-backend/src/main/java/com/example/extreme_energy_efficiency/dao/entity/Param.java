package com.example.extreme_energy_efficiency.dao.entity;

public class Param {

    private double TFeSinter=58.5;//烧结矿TFe含量
    private double MgOSinter=1.40;//烧结矿MgO含量
    private double R2Sinter=1.75;//烧结矿碱度R2
    private double TSinter=600.0;//烧结矿温度
    private double TMaterial=60.0;//入炉原料温度
    private double H2O_1=7.0;//一次配水比
    private double H2O_2=7.5;//二次配水比
    private double ReturnSinter=19.0;//返矿外配比%
//    private double Loss_air=40.0;//漏风率
    private double Loss_air=30.0;//漏风率
    private double DeS=95.0;//脱硫率
    private double MBeddingLayer=90.0;//铺底料质量
    private double TBeddingLayer=100.0;//铺底料的温度
    private double RCOG=100.0;//点火煤气中COG配比
    private double RBFG=100.0-RCOG;//点火煤气中BFG配比 (100-RCOG)
    private double TGas=400.0;  //烟气温度
    private double RCOGas=1.0;//烟气中CO百分比
    private double RFire_GasAir=6.0;//点火空燃比
    private double RTem_GasAir=12.0;//保温空燃比
    private double QFire=70000.0;//点火煤气强度
    private double QTem=10000.0;//保温煤气强度
    private double TCoke=25.0;//点火+保温煤气温度
    private double TFireAir=25.0;//点火助燃空气温度
    private double TTemAir=300.0;//保温助燃空气温度
    private double CoffExcess1=1.8;//抽风过剩系数
    private double TVentilation=25.0;//烧结空气温
//    private double R_Loss0=8.0;//热损失比例
    private double R_Loss0=28.0;//热损失比例
    private double R_Rechot=20.0;//蒸汽回收效率


    public Param(double TFeSinter, double MgOSinter, double R2Sinter, double TSinter, double TMaterial, double H2O_1, double H2O_2, double ReturnSinter, double Loss_air, double DeS, double MBeddingLayer, double TBeddingLayer, double RCOG, double RBFG, double TGas, double RCOGas, double RFire_GasAir, double RTem_GasAir, double QFire, double QTem, double TCoke, double TFireAir, double TTemAir, double CoffExcess1, double TVentilation, double R_Loss0, double R_Rechot) {
        this.TFeSinter = TFeSinter;
        this.MgOSinter = MgOSinter;
        this.R2Sinter = R2Sinter;
        this.TSinter = TSinter;
        this.TMaterial = TMaterial;
        this.H2O_1 = H2O_1;
        this.H2O_2 = H2O_2;
        this.ReturnSinter = ReturnSinter;
        this.Loss_air = Loss_air;
        this.DeS = DeS;
        this.MBeddingLayer = MBeddingLayer;
        this.TBeddingLayer = TBeddingLayer;
        this.RCOG = RCOG;
        this.RBFG = RBFG;
        this.TGas = TGas;
        this.RCOGas = RCOGas;
        this.RFire_GasAir = RFire_GasAir;
        this.RTem_GasAir = RTem_GasAir;
        this.QFire = QFire;
        this.QTem = QTem;
        this.TCoke = TCoke;
        this.TFireAir = TFireAir;
        this.TTemAir = TTemAir;
        this.CoffExcess1 = CoffExcess1;
        this.TVentilation = TVentilation;
        this.R_Loss0 = R_Loss0;
        this.R_Rechot = R_Rechot;
    }

    public double getTFeSinter() {
        return TFeSinter;
    }

    public void setTFeSinter(double TFeSinter) {
        this.TFeSinter = TFeSinter;
    }

    public double getMgOSinter() {
        return MgOSinter;
    }

    public void setMgOSinter(double mgOSinter) {
        MgOSinter = mgOSinter;
    }

    public double getR2Sinter() {
        return R2Sinter;
    }

    public void setR2Sinter(double r2Sinter) {
        R2Sinter = r2Sinter;
    }

    public double getTSinter() {
        return TSinter;
    }

    public void setTSinter(double TSinter) {
        this.TSinter = TSinter;
    }

    public double getTMaterial() {
        return TMaterial;
    }

    public void setTMaterial(double TMaterial) {
        this.TMaterial = TMaterial;
    }

    public double getH2O_1() {
        return H2O_1;
    }

    public void setH2O_1(double h2O_1) {
        H2O_1 = h2O_1;
    }

    public double getH2O_2() {
        return H2O_2;
    }

    public void setH2O_2(double h2O_2) {
        H2O_2 = h2O_2;
    }

    public double getReturnSinter() {
        return ReturnSinter;
    }

    public void setReturnSinter(double returnSinter) {
        ReturnSinter = returnSinter;
    }

    public double getLoss_air() {
        return Loss_air;
    }

    public void setLoss_air(double loss_air) {
        Loss_air = loss_air;
    }

    public double getDeS() {
        return DeS;
    }

    public void setDeS(double deS) {
        DeS = deS;
    }

    public double getMBeddingLayer() {
        return MBeddingLayer;
    }

    public void setMBeddingLayer(double MBeddingLayer) {
        this.MBeddingLayer = MBeddingLayer;
    }

    public double getTBeddingLayer() {
        return TBeddingLayer;
    }

    public void setTBeddingLayer(double TBeddingLayer) {
        this.TBeddingLayer = TBeddingLayer;
    }

    public double getRCOG() {
        return RCOG;
    }

    public void setRCOG(double RCOG) {
        this.RCOG = RCOG;
    }

    public double getRBFG() {
        return RBFG;
    }

    public void setRBFG(double RBFG) {
        this.RBFG = RBFG;
    }

    public double getTGas() {
        return TGas;
    }

    public void setTGas(double TGas) {
        this.TGas = TGas;
    }

    public double getRCOGas() {
        return RCOGas;
    }

    public void setRCOGas(double RCOGas) {
        this.RCOGas = RCOGas;
    }

    public double getRFire_GasAir() {
        return RFire_GasAir;
    }

    public void setRFire_GasAir(double RFire_GasAir) {
        this.RFire_GasAir = RFire_GasAir;
    }

    public double getRTem_GasAir() {
        return RTem_GasAir;
    }

    public void setRTem_GasAir(double RTem_GasAir) {
        this.RTem_GasAir = RTem_GasAir;
    }

    public double getQFire() {
        return QFire;
    }

    public void setQFire(double QFire) {
        this.QFire = QFire;
    }

    public double getQTem() {
        return QTem;
    }

    public void setQTem(double QTem) {
        this.QTem = QTem;
    }

    public double getTCoke() {
        return TCoke;
    }

    public void setTCoke(double TCoke) {
        this.TCoke = TCoke;
    }

    public double getTFireAir() {
        return TFireAir;
    }

    public void setTFireAir(double TFireAir) {
        this.TFireAir = TFireAir;
    }

    public double getTTemAir() {
        return TTemAir;
    }

    public void setTTemAir(double TTemAir) {
        this.TTemAir = TTemAir;
    }

    public double getCoffExcess1() {
        return CoffExcess1;
    }

    public void setCoffExcess1(double coffExcess1) {
        CoffExcess1 = coffExcess1;
    }

    public double getTVentilation() {
        return TVentilation;
    }

    public void setTVentilation(double TVentilation) {
        this.TVentilation = TVentilation;
    }

    public double getR_Loss0() {
        return R_Loss0;
    }

    public void setR_Loss0(double r_Loss0) {
        R_Loss0 = r_Loss0;
    }

    public double getR_Rechot() {
        return R_Rechot;
    }

    public void setR_Rechot(double r_Rechot) {
        R_Rechot = r_Rechot;
    }

    @Override
    public String toString() {
        return "Param{" +
                "TFeSinter=" + TFeSinter +
                ", MgOSinter=" + MgOSinter +
                ", R2Sinter=" + R2Sinter +
                ", TSinter=" + TSinter +
                ", TMaterial=" + TMaterial +
                ", H2O_1=" + H2O_1 +
                ", H2O_2=" + H2O_2 +
                ", ReturnSinter=" + ReturnSinter +
                ", Loss_air=" + Loss_air +
                ", DeS=" + DeS +
                ", MBeddingLayer=" + MBeddingLayer +
                ", TBeddingLayer=" + TBeddingLayer +
                ", RCOG=" + RCOG +
                ", RBFG=" + RBFG +
                ", TGas=" + TGas +
                ", RCOGas=" + RCOGas +
                ", RFire_GasAir=" + RFire_GasAir +
                ", RTem_GasAir=" + RTem_GasAir +
                ", QFire=" + QFire +
                ", QTem=" + QTem +
                ", TCoke=" + TCoke +
                ", TFireAir=" + TFireAir +
                ", TTemAir=" + TTemAir +
                ", CoffExcess1=" + CoffExcess1 +
                ", TVentilation=" + TVentilation +
                ", R_Loss0=" + R_Loss0 +
                ", R_Rechot=" + R_Rechot +
                '}';
    }
}
