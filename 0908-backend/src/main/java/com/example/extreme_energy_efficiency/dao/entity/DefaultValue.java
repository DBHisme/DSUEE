package com.example.extreme_energy_efficiency.dao.entity;

public class DefaultValue {
    private int ID;
    private String name;
    // actualData
    private double MQuicklime = 38.4;
    private double RatioCoke1 = 58.0;
    private double RatioCoke2 = 42.0;
    private double RatioOre1 = 23.979;
    private double RatioOre2 = 22.422;
    private double RatioOre3 = 22.422;
    private double RatioOre4 = 22.422;
    private double RatioOre5 = 0.0;
    private double RatioOre6 = 2.244;
    private double RatioOre7 = 6.452;

    // param
    private double TFeSinter = 58.5;
    private double MgOSinter = 1.40;
    private double R2Sinter = 1.75;
    private double TSinter = 600.0;
    private double TMaterial = 60.0;
    private double H2O_1 = 7.0;
    private double H2O_2 = 7.5;
    private double ReturnSinter = 19.0;
    private double Loss_air = 40.0;
    private double DeS = 95.0;
    private double MBeddingLayer = 90.0;
    private double TBeddingLayer = 100.0;
    private double RCOG = 70.0;
    private double RBFG = 30.0;
    private double TGas = 400.0;
    private double RCOGas = 1.0;
    private double RFire_GasAir = 6.0;
    private double RTem_GasAir = 12.0;
    private double QFire = 70000.0;
    private double QTem = 10000.0;
    private double TCoke = 25.0;
    private double TFireAir = 25.0;
    private double TTemAir = 300.0;
    private double CoffExcess1 = 1.8;
    private double TVentilation = 25.0;
    private double R_Loss0 = 8.0;
    private double R_Rechot = 20.0 ;

    // ratioConvert
    private double coke       = 0.8821;
    private double coal       = 0.857;
    private double BFG        = 0.0;
    private double COG        = 0.643;
    private double electricity= 0.1129;
    private double water      = 0.235;
    private double N2         = 0.044;
    private double steam      = 0.1057;

    // paramThermList
    private double CMixed = 0.891;
    private double CBeddingLayer = 0.8368;
    private double CWater = 4.184;
    private double CFlue_gas = 1.436;
    private double CAir = 1.302;
    private double CGas = 1.338;
    private double qFeS2 = 6901.018;
    private double qFeO = 1952.06;
    private double qWater = 2487.1;
    private double qCaO = 3189.3;
    private double qMgO = 2516.4;
    private double pAir = 1.288;
    private double pO2 = 1.429;

    public DefaultValue(int ID, String name, double MQuicklime, double RatioCoke1, double RatioCoke2, double RatioOre1, double RatioOre2, double RatioOre3, double RatioOre4, double RatioOre5, double RatioOre6, double RatioOre7, double TFeSinter, double MgOSinter, double R2Sinter, double TSinter, double TMaterial, double H2O_1, double H2O_2, double ReturnSinter, double Loss_air, double DeS, double MBeddingLayer, double TBeddingLayer, double RCOG, double RBFG, double TGas, double RCOGas, double RFire_GasAir, double RTem_GasAir, double QFire, double QTem, double TCoke, double TFireAir, double TTemAir, double CoffExcess1, double TVentilation, double R_Loss0, double R_Rechot, double coke, double coal, double BFG, double COG, double electricity, double water, double N2, double steam, double CMixed, double CBeddingLayer, double CWater, double CFlue_gas, double CAir, double CGas, double qFeS2, double qFeO, double qWater, double qCaO, double qMgO, double pAir, double pO2) {
        this.ID = ID;
        this.name = name;
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
        this.coke = coke;
        this.coal = coal;
        this.BFG = BFG;
        this.COG = COG;
        this.electricity = electricity;
        this.water = water;
        this.N2 = N2;
        this.steam = steam;
        this.CMixed = CMixed;
        this.CBeddingLayer = CBeddingLayer;
        this.CWater = CWater;
        this.CFlue_gas = CFlue_gas;
        this.CAir = CAir;
        this.CGas = CGas;
        this.qFeS2 = qFeS2;
        this.qFeO = qFeO;
        this.qWater = qWater;
        this.qCaO = qCaO;
        this.qMgO = qMgO;
        this.pAir = pAir;
        this.pO2 = pO2;
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

    public double getCMixed() {
        return CMixed;
    }

    public void setCMixed(double CMixed) {
        this.CMixed = CMixed;
    }

    public double getCBeddingLayer() {
        return CBeddingLayer;
    }

    public void setCBeddingLayer(double CBeddingLayer) {
        this.CBeddingLayer = CBeddingLayer;
    }

    public double getCWater() {
        return CWater;
    }

    public void setCWater(double CWater) {
        this.CWater = CWater;
    }

    public double getCFlue_gas() {
        return CFlue_gas;
    }

    public void setCFlue_gas(double CFlue_gas) {
        this.CFlue_gas = CFlue_gas;
    }

    public double getCAir() {
        return CAir;
    }

    public void setCAir(double CAir) {
        this.CAir = CAir;
    }

    public double getCGas() {
        return CGas;
    }

    public void setCGas(double CGas) {
        this.CGas = CGas;
    }

    public double getqFeS2() {
        return qFeS2;
    }

    public void setqFeS2(double qFeS2) {
        this.qFeS2 = qFeS2;
    }

    public double getqFeO() {
        return qFeO;
    }

    public void setqFeO(double qFeO) {
        this.qFeO = qFeO;
    }

    public double getqWater() {
        return qWater;
    }

    public void setqWater(double qWater) {
        this.qWater = qWater;
    }

    public double getqCaO() {
        return qCaO;
    }

    public void setqCaO(double qCaO) {
        this.qCaO = qCaO;
    }

    public double getqMgO() {
        return qMgO;
    }

    public void setqMgO(double qMgO) {
        this.qMgO = qMgO;
    }

    public double getpAir() {
        return pAir;
    }

    public void setpAir(double pAir) {
        this.pAir = pAir;
    }

    public double getpO2() {
        return pO2;
    }

    public void setpO2(double pO2) {
        this.pO2 = pO2;
    }

    @Override
    public String toString() {
        return "DefaultValue{" +
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
                ", TFeSinter=" + TFeSinter +
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
                ", coke=" + coke +
                ", coal=" + coal +
                ", BFG=" + BFG +
                ", COG=" + COG +
                ", electricity=" + electricity +
                ", water=" + water +
                ", N2=" + N2 +
                ", steam=" + steam +
                ", CMixed=" + CMixed +
                ", CBeddingLayer=" + CBeddingLayer +
                ", CWater=" + CWater +
                ", CFlue_gas=" + CFlue_gas +
                ", CAir=" + CAir +
                ", CGas=" + CGas +
                ", qFeS2=" + qFeS2 +
                ", qFeO=" + qFeO +
                ", qWater=" + qWater +
                ", qCaO=" + qCaO +
                ", qMgO=" + qMgO +
                ", pAir=" + pAir +
                ", pO2=" + pO2 +
                '}';
    }
}
