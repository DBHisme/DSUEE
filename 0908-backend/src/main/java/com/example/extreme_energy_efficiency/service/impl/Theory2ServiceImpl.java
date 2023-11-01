package com.example.extreme_energy_efficiency.service.impl;


import com.example.extreme_energy_efficiency.beans.TheoryData;
import com.example.extreme_energy_efficiency.beans.vo.ActualVo;
import com.example.extreme_energy_efficiency.dao.Theory2EntityMapper;
import com.example.extreme_energy_efficiency.dao.Theory3EntityMapper;
import com.example.extreme_energy_efficiency.service.TheoryService;
import com.googlecode.aviator.AviatorEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@Service
public class Theory2ServiceImpl implements TheoryService {
    double MCQuality;

    @Autowired
    private Theory2EntityMapper theory2EntityMapper;
    @Autowired
    private Theory3EntityMapper theory3EntityMapper;

    public ActualVo calculate(TheoryData theoryData){
        double TFe = theoryData.getTFe();
        double Tsolid_start=theoryData.getTsolid_start();
        double Tsolid_end=theoryData.getTsolid_end();
        double R2=theoryData.getR2();

//         步骤1：铁平衡方程获得矿石质量：More = 1000 * TFe / 100 * (160 / 112)

        String formula =theory2EntityMapper.getFormulas("M001").getFormulas();
        System.out.println("2:"+formula);
        double More = (double) AviatorEvaluator.execute(formula.replaceAll("TFe", String.valueOf(TFe)));

        System.out.println("More:2Theory"+More);
        // 步骤2：根据碱度方程求解熔剂质量 MCao、MSiO2
//        String formula2 =theory2EntityMapper.getFormulas("M017").getFormulas();
//        double MSiO2 = (double) AviatorEvaluator.execute(formula2.replaceAll("TFe", String.valueOf(TFe)));
////        System.out.println("MSiO2  "+MSiO2);
////        System.out.println("MSiO2  "+MSiO2/1000);
//        double MCaCO3=MSiO2*1.8*100/56;

        // 步骤2：根据碱度方程求解熔剂质量 MCaCO3、MSiO2
        String formula2 =theory2EntityMapper.getFormulas("M017").getFormulas();
        Map<String,Object> MSio2=new HashMap<>();
        MSio2.put("TFe", TFe);
        MSio2.put("R2", R2);
        double MSiO2 = (double) AviatorEvaluator.execute(formula2,MSio2);
        System.out.println("MSiO2：看看看看"+MSiO2);
        double MCaCO3=R2*MSiO2*100/56;



        // 步骤3：根据热平衡计算烟气质量 Mgas 和焦炭质量 MC
        // 3.1 气体平衡


        // 热收入
//      燃烧热
//        String formulaFireHeat=theory2EntityMapper.getFormulas("M008").getFormulas();


//      Fe2O3显热
        String formula3=theory2EntityMapper.getFormulas("M009").getFormulas();
        Map<String,Object> env=new HashMap<>();
        env.put("More", More);
        env.put("x", Tsolid_start);
        double Fe2O3显热=(double) AviatorEvaluator.execute(formula3, env);
        if(Fe2O3显热<=0.0){
            Fe2O3显热=0.0;
        }
        System.out.println("Theory2  Fe2O3显热  "+Fe2O3显热);

//      CaCO3显热
        String formula4=theory2EntityMapper.getFormulas("M010").getFormulas();
        Map<String,Object> env2=new HashMap<>();
        env2.put("MCaCO3", MCaCO3);
        env2.put("x", Tsolid_start);
        double CaCO3显热=(double) AviatorEvaluator.execute(formula4, env2);
        if(CaCO3显热<=0.0){
            CaCO3显热=0.0;
        }
        System.out.println("Theory2  CaCO3显热  "+CaCO3显热);


//        SiO2显热
        String formula5=theory2EntityMapper.getFormulas("M011").getFormulas();
        if(Tsolid_start>=1996&&Tsolid_start<=3000){
            formula5=theory2EntityMapper.getFormulas("M022").getFormulas();
        }
        Map<String,Object> env3=new HashMap<>();
        env3.put("MSiO2", MSiO2);
        env3.put("x", Tsolid_start);
        double SiO2显热=(double) AviatorEvaluator.execute(formula5, env3);
        if(Tsolid_start<298||Tsolid_start>3000){
            SiO2显热=0.0;
        }
        if(SiO2显热<=0.0){
            SiO2显热=0.0;
        }
        System.out.println("Theory2  SiO2显热  "+SiO2显热);


//        气体显热
//        String formulaMO2_in=theory2EntityMapper.getFormulas("N012").getFormulas();



        // 热支出
        String formulaNo13=theory2EntityMapper.getFormulas("M013").getFormulas();

        Map<String,Object> envN013=new HashMap<>();
        envN013.put("More", More);
        envN013.put("y", Tsolid_end);
        double heatFe2O3Out=(double) AviatorEvaluator.execute(formulaNo13, envN013);
        if(heatFe2O3Out<=0.0){
            heatFe2O3Out=0.0;
        }
        System.out.println("Theory2  heatFe2O3Out  "+heatFe2O3Out);


        //CaO显热
        String formulaN014=theory2EntityMapper.getFormulas("M014").getFormulas();
        if(Tsolid_end>=2888&&Tsolid_end<=6000){
            formulaN014=theory2EntityMapper.getFormulas("M023").getFormulas();
        }
        Map<String,Object> envN014=new HashMap<>();
//        double MCaO
        envN014.put("MCaO", MCaCO3/56.0*100.0);
        envN014.put("y", Tsolid_end);
        double heatCaOOut=(double) AviatorEvaluator.execute(formulaN014, envN014);
        if(Tsolid_end<298||Tsolid_end>6000){
            heatCaOOut=0.0;
        }
        if(heatCaOOut<=0.0){
            heatCaOOut=0.0;
        }
        System.out.println("Theory2  heatCaOOut  "+heatCaOOut);



        //SiO2显热
        String formulaN015=theory2EntityMapper.getFormulas("M015").getFormulas();
        if(Tsolid_end>=1996&&Tsolid_end<=3000){
            formulaN015=theory2EntityMapper.getFormulas("M024").getFormulas();
        }
        Map<String,Object> envN015=new HashMap<>();
        envN015.put("MSiO2", MSiO2);
        envN015.put("y", Tsolid_end);
        double heatSiO2Out=(double) AviatorEvaluator.execute(formulaN015, envN015);
        if(Tsolid_end<298||Tsolid_end>3000){
            heatSiO2Out=0.0;
        }
        if(heatSiO2Out<=0.0){
            heatSiO2Out=0.0;
        }
        System.out.println("Theory2  heatSiO2Out  "+heatSiO2Out);



//        String formulaN016=theory2EntityMapper.getFormulas("N016").getFormulas();



//        计算MC
//        热收入
//        原料显热
        double Sensible_heat_of_raw_material=Fe2O3显热+CaCO3显热+SiO2显热;
//        热支出
        double Sintered_cake_sensible_heat=heatFe2O3Out+heatCaOOut+heatSiO2Out;

        double remainder=Sintered_cake_sensible_heat-Sensible_heat_of_raw_material;

        String testMC = "(756*MCaCO3*y*y + 34217316*MCaCO3*y + 109606183344*MCaCO3 - 63000000000*a + 63000000000*b)/(47775*x*x + 746744650*x - 47775*y*y - 858123400*y + 2082954851250)";
        Map<String, Object> envTestMC = new HashMap<>();
        envTestMC.put("a", Sensible_heat_of_raw_material);
        envTestMC.put("b", Sintered_cake_sensible_heat);
        envTestMC.put("x", Tsolid_start);
        envTestMC.put("y", Tsolid_end);
        envTestMC.put("MCaCO3", MCaCO3);
        double MC =(double) AviatorEvaluator.execute(testMC,envTestMC);
        System.out.println("Theory2  testMC  "+ MC);

        // 水耗计算
        String formulaH2O_OUT=theory3EntityMapper.getFormulas("B018").getFormulas();
        System.out.println(formulaH2O_OUT);
        Map<String,Object> envN018=new HashMap<>();
        envN018.put("TFe", TFe);
        double H2O_OUT=(double) AviatorEvaluator.execute(formulaH2O_OUT, envN018);

        // 氮气计算
        String formulaN2_OUT=theory2EntityMapper.getFormulas("M018").getFormulas();
        Map<String,Object> envN020=new HashMap<>();
        envN018.put("MC", MCQuality);
        double N2_OUT=(double) AviatorEvaluator.execute(formulaN2_OUT, envN020);

        // 蒸汽计算
        // 蒸汽计算:（烟气显热+烧结饼显热）*1000/q水*1.0*（-1）
        // 气体显热表
        String formulaGasHeat = "4.184*((a+0.5*b * (T+273+273) + c/(( T+273)*273))/22.4)*((T+273)-273)";
        double MCO2_out = MC /12 *44 + MCaCO3 *44 /100;
        double MN2_out = MC /12 /0.21 *0.79 *28;
        // CO2显热
        Map<String, Object> envCO2 = new HashMap<>();
        envCO2.put("a", 10.55);
        envCO2.put("b", 0.00216);
        envCO2.put("c", -204000.0);
        double CO2_Heat = (double) AviatorEvaluator.execute(formulaGasHeat, envCO2);
        // H2显热
        Map<String, Object> envH2 = new HashMap<>();
        envH2.put("a", 6.52);
        envH2.put("b", 0.00078);
        envH2.put("c", 12000.0);
        double H2_Heat = (double) AviatorEvaluator.execute(formulaGasHeat, envH2);
        // H2O显热
        Map<String, Object> envH2O = new HashMap<>();
        envH2O.put("a", 7.17);
        envH2O.put("b", 0.00256);
        envH2O.put("c", 8000.0);
        double flueGas = MCO2_out/44 *CO2_Heat + MN2_out/28*H2_Heat;
        double steam = (flueGas+Sintered_cake_sensible_heat) *1000 /2487.1 *1.0 *(-1);

        ActualVo actualVo = new ActualVo();
        actualVo.setCokeConsumption(MC);
        actualVo.setWaterConsumption(H2O_OUT);
        actualVo.setN2Consumption(N2_OUT);
        actualVo.setSteamConsumption(steam);

        actualVo.setCoalConsumption(0.0);
        actualVo.setElectricityConsumption(0.0);
        actualVo.setBFGConsumption(0.0);
        actualVo.setCOGConsumption(0.0);

        return actualVo;

    }

    public String getN2(TheoryData theoryData) {
        double TFe = theoryData.getTFe();
        double Tsolid_start=theoryData.getTsolid_start();
        double Tsolid_end=theoryData.getTsolid_end();

        String formulaN2_OUT=theory2EntityMapper.getFormulas("M018").getFormulas();
        Map<String,Object> envN018=new HashMap<>();
        envN018.put("MC", MCQuality);
        double N2_OUT=(double) AviatorEvaluator.execute(formulaN2_OUT, envN018);
        DecimalFormat df = new DecimalFormat("#.##");
        String N2_spent = df.format(N2_OUT);
        return N2_spent;
    }



}
