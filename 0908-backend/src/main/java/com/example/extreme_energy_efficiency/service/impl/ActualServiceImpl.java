package com.example.extreme_energy_efficiency.service.impl;

import com.example.extreme_energy_efficiency.beans.ActualData;
import com.example.extreme_energy_efficiency.dao.entity.Param;
import com.example.extreme_energy_efficiency.beans.vo.ActualVo;
import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import com.example.extreme_energy_efficiency.dao.entity.RatioConvert;
import com.example.extreme_energy_efficiency.service.ActualService;
import com.googlecode.aviator.AviatorEvaluator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ActualServiceImpl implements ActualService {
    @Override
    public ActualVo calculate(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList) {
        actualData.setRatioCoke1(actualData.getRatioCoke1()/100);
        actualData.setRatioCoke2(actualData.getRatioCoke2()/100);
        actualData.setRatioOre1(actualData.getRatioOre1()/100);
        actualData.setRatioOre2(actualData.getRatioOre2()/100);
        actualData.setRatioOre3(actualData.getRatioOre3()/100);
        actualData.setRatioOre4(actualData.getRatioOre4()/100);
        actualData.setRatioOre5(actualData.getRatioOre5()/100);
        actualData.setRatioOre6(actualData.getRatioOre6()/100);
        actualData.setRatioOre7(actualData.getRatioOre7()/100);



        // 1.2-实时预测模型参数管理
        Map<String, Double> envActualParam = new HashMap<>();
        envActualParam.put("TFeSinter", param.getTFeSinter());
        envActualParam.put("MgOSinter", param.getMgOSinter());
        envActualParam.put("R2Sinter", param.getR2Sinter());
        envActualParam.put("TSinter", param.getTSinter());
        envActualParam.put("TMaterial", param.getTMaterial());
        envActualParam.put("H2O_1", param.getH2O_1());
        envActualParam.put("H2O_2", param.getH2O_2());
        envActualParam.put("ReturnSinter", param.getReturnSinter());
        envActualParam.put("Loss_air", param.getLoss_air());
        envActualParam.put("DeS", param.getDeS());
        envActualParam.put("MBeddingLayer", param.getMBeddingLayer());
        envActualParam.put("TBeddingLayer", param.getTBeddingLayer());
        envActualParam.put("RCOG", param.getRCOG());
        envActualParam.put("RBFG", param.getRBFG());
        envActualParam.put("TGas", param.getTGas());
        envActualParam.put("RCOGas", param.getRCOGas());
        envActualParam.put("RFire_GasAir", param.getRFire_GasAir());
        envActualParam.put("RTem_GasAir", param.getRTem_GasAir());
        envActualParam.put("QFire", param.getQFire());
        envActualParam.put("QTem", param.getQTem());
        envActualParam.put("TCoke", param.getTCoke());
        envActualParam.put("TFireAir", param.getTFireAir());
        envActualParam.put("TTemAir", param.getTTemAir());
        envActualParam.put("CoffExcess1", param.getCoffExcess1());
        envActualParam.put("TVentilation", param.getTVentilation());
        envActualParam.put("R_Loss0", param.getR_Loss0());
        envActualParam.put("R_Rechot", param.getR_Rechot());
        System.out.println(param);
        // 各种物质的Quicklime、Limestone、Dolomite含量

        Map<String, Double> sParaMap = new HashMap<>();
        sParaMap.put("TFeQuicklime", 0.0);
        sParaMap.put("TFeLimestone", 0.0);
        sParaMap.put("TFeDolomite", 0.0);

        sParaMap.put("Fe2O3Quicklime", 0.0);
        sParaMap.put("Fe2O3Limestone", 0.0);
        sParaMap.put("Fe2O3Dolomite", 0.0);

        sParaMap.put("MgOQuicklime", 0.2);
        sParaMap.put("MgOLimestone", 0.645);
        sParaMap.put("MgODolomite", 20.445);

        sParaMap.put("CaOQuicklime", 87.14);
        sParaMap.put("CaOLimestone", 52.485);
        sParaMap.put("CaODolomite", 30.933);

        sParaMap.put("SiO2QuickLime", 0.01);
        sParaMap.put("SiO2Limestone", 2.3);
        sParaMap.put("SiO2Dolomite", 1.855);

        sParaMap.put("CQuicklime", 0.0);
        sParaMap.put("CLimestone", 0.0);
        sParaMap.put("CDolomite", 0.0);

        sParaMap.put("LossQuicklime", 10.03);
        sParaMap.put("LossLimestone", 41.948);
        sParaMap.put("LossDolomite", 46.794);

        sParaMap.put("H2OQuicklime", 0.0);
        sParaMap.put("H2OLimestone", 3.523);
        sParaMap.put("H2ODolomite", 4.076);

        sParaMap.put("FeOQuicklime", 0.0);
        sParaMap.put("FeOLimestone", 0.0);
        sParaMap.put("FeODolomite", 0.0);

        sParaMap.put("Al2O3Quicklime", 0.0);
        sParaMap.put("Al2O3Limestone", 1.065);
        sParaMap.put("Al2O3Dolomite", 0.318);

        sParaMap.put("FeS2Quicklime", 0.082);
        sParaMap.put("FeS2Limestone", 0.017);
        sParaMap.put("FeS2Dolomite", 0.01);

        sParaMap.put("RestQuicklime", 2.548);
        sParaMap.put("RestLimestone", 1.54);
        sParaMap.put("RestDolomite", 0.0);

//        sParaMap.put("QFire", 70000.0);
//        sParaMap.put("QTem", 10000.0);

        // 1.2 - 2 热力学参数

        for (ParamTherm paramTherm : paramThermList){
            sParaMap.put(paramTherm.getName(), paramTherm.getValue());
            System.out.println(paramTherm.getName() + "   " + paramTherm.getValue());
        }

//        sParaMap.put("CMixed", 0.891);           //混合料的平均比热容
//        sParaMap.put("CBeddingLayer", 0.8368);   //铺底料的平均比热容
//        sParaMap.put("CWater", 4.184);           //水的平均比热容
//        sParaMap.put("CFlue_gas", 1.436);        //烟气的平均比热容
//        sParaMap.put("CAir", 1.302);             //空气的平均比热容
//        sParaMap.put("CGas", 1.338);             //煤气的平均比热容
//        sParaMap.put("qFeS2", 6901.018);         //生成1kgFeS2放热
//        sParaMap.put("qFeO", 1952.06);           //生成1kgFeO吸热
//        sParaMap.put("qWater", 2487.1);          //生成1kgH2O吸热
//        sParaMap.put("qCaO", 3189.3);            //生成1kgCaO吸热
//        sParaMap.put("qMgO", 2516.4);            //生成1kgMgO吸热
//        sParaMap.put("pAir", 1.288);             //空气密度
//        sParaMap.put("pO2", 1.429);              //氧气密度

        // 经计算的过程变量
//        double FeOSinter;
        // 结果
        double MMixedOre;

        // 步骤2 - 初始化
        double MMixedCoke = 50.0;
        double MLimestone = 50.0;
        double MDolomite = 50.0;

        // 判定条件
        boolean flag1;
        boolean flag2;
        boolean flag3;

        double VFireGas;
        double VTemGas;
        double H2OMixedCoke;
        double H2OMixedOre;
        double V_LossAir;
        double V_SinterAir;
        double QFire;

        int counter = 0;

        do {
            double MTemp1 = MLimestone;
            double MTemp2 = MDolomite;

            // 1.3-公式
            Map<String, String> formulaMap = new HashMap<>();
//            double H2OOre1 = ActualVo.get()
            formulaMap.put("H2OMixedOre", "7.96*ROre1 + 7.82*ROre2 + 7.89*ROre3 + 7.99*ROre4 + 0.99*ROre5 + 0*ROre6 + 0*ROre7");
            formulaMap.put("H2OMixedCoke", "(5.5*RCoke1 + 4.92*RCoke2)");
//            System.out.println();
            formulaMap.put("TFeMixedOre", "(61*ROre1 + 61.09*ROre2 + 60.84*ROre3 + 60.95*ROre4 + 40.36*ROre5 + 58.73*ROre6 + 56.03*ROre7)");
            formulaMap.put("TFeMixedCoke", "(0.847*RCoke1 + 0.6*RCoke2)");
            formulaMap.put("Fe2O3MixedOre", "(85.341*ROre1 + 84.867*ROre2 + 85.121*ROre3+84.776*ROre4+53.437*ROre5+76.097*ROre6+0.886*ROre7)");
            formulaMap.put("Fe2O3MixedCoke", "(0.0*RCoke1 + 0.0*RCoke2)");

            // 写了一半...稍后从数据库中取
            formulaMap.put("MgOMixedOre", "(0.19*ROre1 + 0.21*ROre2 + 0.21*ROre3 + 0.21*ROre4 + 1.13*ROre5 + 1.51*ROre6 + 0.0*ROre7)");
            formulaMap.put("MgOMixedCoke", "(0.257*RCoke1+0.112*RCoke2)");

            formulaMap.put("CaOMixedOre", "(0.46*ROre1 + 0.71*ROre2 + 0.62*ROre3+0.63*ROre4+7.87*ROre5+7.87*ROre6+0.0*ROre7)");
            formulaMap.put("CaOMixedCoke", "(1.374*RCoke1+0.518*RCoke2)");
            formulaMap.put("SiO2MixedOre", "(4.25*ROre1 + 4.27*ROre2 + 4.28*ROre3+4.26*ROre4+4.87*ROre5+5.11*ROre6+1.73*ROre7)");
            formulaMap.put("SiO2MixedCoke", "(9.706*RCoke1+6.271*RCoke2)");

            formulaMap.put("CMixedCoke", "(76.899*RCoke1+82.121*RCoke2)");
            formulaMap.put("CMixedOre", "(0.0*ROre1 + 0.0*ROre2 + 0.0*ROre3+0.0*ROre4+26.39*ROre5+0.0*ROre6+0.0*ROre7)");
            formulaMap.put("FeS2MixedCoke", "(0.226*RCoke1+0.154*RCoke2)");
            formulaMap.put("FeS2MixedOre", "(0.036*ROre1 + 0.039*ROre2 + 0.039*ROre3+0.043*ROre4+0.548*ROre5+0.021*ROre6+0.186*ROre7)");
            formulaMap.put("FeOMixedCoke", "(1.211*RCoke1+0.858*RCoke2)");
            formulaMap.put("FeOMixedOre", "(1.6*ROre1 + 2.14*ROre2 + 1.59*ROre3 + 2.04*ROre4 + 3.47*ROre5 + 7.01*ROre6 + 71.13*ROre7)");


            // 步骤3 所需参数公式
            String formulaH2OMixedOre = formulaMap.get("H2OMixedOre");
            String formulaH2OMixedCoke = formulaMap.get("H2OMixedCoke");
            String formulaTFeMixedOre = formulaMap.get("TFeMixedOre");
            String formulaTFeMixedCoke = formulaMap.get("TFeMixedCoke");
            String formulaFe2O3MixedOre = formulaMap.get("Fe2O3MixedOre");
            String formulaFe2O3MixedCoke = formulaMap.get("Fe2O3MixedCoke");

            // 步骤4 所需参数公式
            String formulaMgOMixedOre = formulaMap.get("MgOMixedOre");
            String formulaMgoMixedCoke = formulaMap.get("MgOMixedCoke");

            // 步骤5 所需参数公式
            String formulaCaOMixedOre = formulaMap.get("CaOMixedOre");
            String formulaCaOMixedCoke = formulaMap.get("CaOMixedCoke");
            String formulaSiO2MixedOre = formulaMap.get("SiO2MixedOre");
            String formulaSiO2MixedCoke = formulaMap.get("SiO2MixedCoke");


            // 从前端获取来的参数
            Map<String, Object> envActual = new HashMap<>();
            envActual.put("RCoke1", actualData.getRatioCoke1());
            envActual.put("RCoke2", actualData.getRatioCoke2());
            envActual.put("ROre1", actualData.getRatioOre1());
            envActual.put("ROre2", actualData.getRatioOre2());
            envActual.put("ROre3", actualData.getRatioOre3());
            envActual.put("ROre4", actualData.getRatioOre4());
            envActual.put("ROre5", actualData.getRatioOre5());
            envActual.put("ROre6", actualData.getRatioOre6());
            envActual.put("ROre7", actualData.getRatioOre7());
//            envActual.put("H2OOre1", actualData.get)


            // 步骤3
            H2OMixedOre = (double) AviatorEvaluator.execute(formulaH2OMixedOre, envActual);
            H2OMixedCoke = (double) AviatorEvaluator.execute(formulaH2OMixedCoke, envActual);

            double TFeMixedOre = (double) AviatorEvaluator.execute(formulaTFeMixedOre, envActual);
            double TFeMixedCoke = (double) AviatorEvaluator.execute(formulaTFeMixedCoke, envActual);
            System.out.println("TFeMixedOre  "+ TFeMixedOre);
            System.out.println("TFeMixedCoke  " + TFeMixedCoke);




            double Fe2O3MixedOre = (double) AviatorEvaluator.execute(formulaFe2O3MixedOre, envActual);
            double Fe2O3MixedCoke = (double) AviatorEvaluator.execute(formulaFe2O3MixedCoke, envActual);
            // Mmixedore=[1000*TFesinter/100-∑Mi*TFei/100]/[TFemixedOre/100]
            //                      (i=mixedcoke，Quicklime，Limestone，Dolomite)
            MMixedOre = (1000.0 * envActualParam.get("TFeSinter") / 100.0
                    - (MMixedCoke * TFeMixedCoke + actualData.getMQuicklime() * sParaMap.get("TFeQuicklime")
                    + MLimestone * sParaMap.get("TFeLimestone") + MDolomite * sParaMap.get("TFeDolomite")) / 100)
                    / (TFeMixedOre / 100);

            // FeOSinter=[[1000*TFesinter/100-ΣFe2O3*112/160]*72/56]/1000*100
            double FeOSinter = ( (1000.0 * envActualParam.get("TFeSinter") / 100.0
                    - (MMixedOre * Fe2O3MixedOre /100.0 + MMixedCoke * Fe2O3MixedCoke /100.0 + actualData.getMQuicklime() * sParaMap.get("Fe2O3Quicklime") /100.0
                    + MLimestone * sParaMap.get("Fe2O3Limestone") /100.0 + MDolomite * sParaMap.get("Fe2O3Dolomite") /100.0) * 112.0 / 160.0) * 72.0 / 56.0)
                    / 1000.0 * 100.0;

            System.out.println("TFeSinter  "+envActualParam.get("TFeSinter"));
            System.out.println("MMixedOre  "+MMixedOre);
            System.out.println("Fe2O3MixedOre  "+Fe2O3MixedOre);
            System.out.println("MMixedCoke  "+Fe2O3MixedCoke);
            System.out.println("MQuicklime  "+actualData.getMQuicklime());
            System.out.println("Fe2O3Quicklime  "+sParaMap.get("Fe2O3Quicklime"));
            System.out.println("MLimestone  "+MLimestone);
            System.out.println("Fe2O3Limestone  "+sParaMap.get("Fe2O3Limestone"));
            System.out.println("MDolomite  "+MDolomite);
            System.out.println("Fe2O3Dolomite  "+sParaMap.get("Fe2O3Dolomite"));
            System.out.println("FeOSinter  "+FeOSinter);

            System.out.println("TFeSinter  "+envActualParam.get("TFeSinter"));

            // 步骤4
            double MgOMixedOre = (double) AviatorEvaluator.execute(formulaMgOMixedOre, envActual);
            double MgOMixedCoke = (double) AviatorEvaluator.execute(formulaMgoMixedCoke, envActual);
            // MDolomite =[1000*MgOsinter/100-∑Mi*MgOi/100]/[MgODolomite/100]
            //                      (i=mixedore，mixedcoke，Quicklime，Limestone)
            MDolomite = (1000 * envActualParam.get("MgOSinter") / 100
                    - (MMixedOre * MgOMixedOre + MMixedCoke * MgOMixedCoke
                    + actualData.getMQuicklime() * sParaMap.get("MgOQuicklime") + MLimestone * sParaMap.get("MgOLimestone")) / 100)
                    / (sParaMap.get("MgODolomite") / 100);

            // 步骤5
            double CaOMixedOre = (double) AviatorEvaluator.execute(formulaCaOMixedOre, envActual);
            double CaOMixedCoke = (double) AviatorEvaluator.execute(formulaCaOMixedCoke, envActual);
            double SiO2MixedOre = (double) AviatorEvaluator.execute(formulaSiO2MixedOre, envActual);
            double SiO2MixedCoke = (double) AviatorEvaluator.execute(formulaSiO2MixedCoke, envActual);
            // MLimestone=[1000*R2sinter-∑Mi*CaOi/SiO2i]/[CaOLimestone/SiO2Limestone]
            //                      (i=mixedore，mixedcoke，Quicklime，Dolomite)
            MLimestone = (1000 * envActualParam.get("R2Sinter")
                    - (MMixedOre*CaOMixedOre + MMixedCoke*CaOMixedCoke + actualData.getMQuicklime()* sParaMap.get("CaOQuicklime") + MDolomite * sParaMap.get("CaODolomite"))
                    / (MMixedOre*SiO2MixedOre + MMixedCoke * SiO2MixedCoke + actualData.getMQuicklime() * sParaMap.get("SiO2QuickLime") + MDolomite*sParaMap.get("SiO2Dolomite")))
                    / (sParaMap.get("CaOLimestone") / sParaMap.get("SiO2Limestone"));

            // * * * * * * * * * * 存疑 * * * * * * * * * *
            //CaOsinter=ΣCaO/1000*100 or CaOsinter=ΣCaO/1000*100
            double CaOSinter = (MMixedOre * CaOMixedCoke + MMixedCoke * CaOMixedCoke
                    + actualData.getMQuicklime() * sParaMap.get("CaOQuicklime")
                    + MDolomite * sParaMap.get("CaODolomite"))
                    / 1000 * 100;

            // 步骤6
            // 6.1 - 气体平衡
            // 参数

            // 6.1 所需参数公式
            String formulaCMixedCoke = formulaMap.get("CMixedCoke");
            String formulaCMixedOre = formulaMap.get("CMixedOre");
            String formulaFeS2MixedCoke = formulaMap.get("FeS2MixedCoke");
            String formulaFeS2MixedOre = formulaMap.get("FeS2MixedOre");
            String formulaFeOMixedCoke = formulaMap.get("FeOMixedCoke");
            String formulaFeOMixedOre = formulaMap.get("FeOMixedOre");

            double CMixedCoke = (double) AviatorEvaluator.execute(formulaCMixedCoke, envActual);
            double CMixedOre = (double) AviatorEvaluator.execute(formulaCMixedOre, envActual);
            double FeS2MixedCoke = (double) AviatorEvaluator.execute(formulaFeS2MixedCoke, envActual);
            double FeS2MixedOre = (double) AviatorEvaluator.execute(formulaFeS2MixedOre, envActual);
            double FeOMixedCoke = (double) AviatorEvaluator.execute(formulaFeOMixedCoke, envActual);
            double FeOMixedOre = (double) AviatorEvaluator.execute(formulaFeOMixedOre, envActual);

            double CO2MixedGas = 2.4 * param.getRCOG()/100 + 20.0 * param.getRBFG()/100;
            System.out.println("CO2MixedGas:"+param.getRCOG()/100);
            double COMixedGas = 6.4 * param.getRCOG()/100 + 21.0 * param.getRBFG()/100;
            double H2MixedGas = 58.2 * param.getRCOG()/100 + 2.0 * param.getRBFG()/100;
            double CH4MixedGas = 25.5 * param.getRCOG()/100 + 1.0 * param.getRBFG()/100;
            double C2H2MixedGas = 2.80 * param.getRCOG()/100 + 0.0 * param.getRBFG()/100;
            double O2MixedGas = 0.5 * param.getRCOG() /100+ 0.0 * param.getRBFG()/100;
            double N2MixedGas = 4.2 * param.getRCOG() /100+ 56.0 * param.getRBFG()/100;

            //q点火煤气=[282.78*COmixedgas+242.58*H2mixedgas+802.80*CH4mixedgas+1594.50*C2H2mixedgas]/100*1000/22.4     (kJ/m3
            double qFireGas = (282.78 * COMixedGas + 242.58 * H2MixedGas
                    + 802 * CH4MixedGas + 1594.50 * C2H2MixedGas)
                    / 100 * 1000 / 22.4;

            // 6.1 - 1
            //ρ点火煤气=[44*CO2mixedgas+28*CO+2*H2mixedgas+16*CH4mixedgas+26*C2H2mixedgas+32*O2mixedgas+28*N2mixedgas]/100/22.4     (kg/m3
            double pFireCoke = (44 * CO2MixedGas + 28 * COMixedGas + 16 * CH4MixedGas
                    + 26 * C2H2MixedGas + 32 * O2MixedGas + 28 * N2MixedGas)
                    / 100 / 22.4;

            //O2消耗=[0.5*COmixedgas+0.5*H2mixedgas+2.0*CH4mixedgas+2.5*C2H2mixedgas-1.0*O2mixedgas]/100
            double O2Depletion = (0.5 * COMixedGas + 0.5 * H2MixedGas
                    + 2.0 * CH4MixedGas + 2.5 * C2H2MixedGas - 1.0 * O2MixedGas)
                    / 100;

            VFireGas = param.getQFire() / qFireGas;
            double MFireCoke = VFireGas * pFireCoke;
            double VFireAir = VFireGas * param.getRFire_GasAir();
            double MFireAir = VFireAir * sParaMap.get("pAir");
            VTemGas = param.getQTem() / qFireGas;
            double MTemCoke = VTemGas * pFireCoke;
            double VTemAir = VTemGas * param.getRTem_GasAir();
            double MTemAir = VTemAir * sParaMap.get("pAir");

            // M_O2C = Mi *Ci /100 *2.667
            //          (i=mixedcoke，mixedore，Quicklime，Limestone，Dolomite)
            double M_O2C = (MMixedCoke * CMixedCoke + MMixedOre * CMixedOre + actualData.getMQuicklime() * sParaMap.get("CQuicklime")
                    + MLimestone * sParaMap.get("CLimestone") + MDolomite * sParaMap.get("CDolomite"))
                    / 100.0 * 2.667;
            double V_O2C = M_O2C / sParaMap.get("pO2");

            double M_O2Carbide = 0.733 * envActualParam.get("DeS") / 100.0
                    * (MMixedCoke * FeS2MixedCoke + MMixedOre * FeS2MixedOre
                    + actualData.getMQuicklime() * sParaMap.get("FeS2Quicklime") + MLimestone * sParaMap.get("FeS2Limestone")
                    + MDolomite * sParaMap.get("FeS2Dolomite"))
                    / 100.0;
            double V_O2Carbide = M_O2Carbide / sParaMap.get("pO2");

            double M_O2FeO = ((MMixedCoke * FeOMixedCoke + MMixedOre + FeOMixedOre) / 100.0 - 1000.0 * FeOSinter / 100.0) / 9.0;
            double V_O2FeO = M_O2FeO / sParaMap.get("pO2");


            double V_O2 = V_O2C + V_O2Carbide + V_O2FeO;
            System.out.println("V_O2碳  "+V_O2C);
            System.out.println("V_O2碳化物  "+V_O2Carbide);
            System.out.println("V_O2_FeO  "+V_O2FeO);
            V_SinterAir = V_O2 * envActualParam.get("CoffExcess1") / 0.21;
            V_LossAir = V_SinterAir * envActualParam.get("Loss_air") / 100.0
                    / (1.0 - envActualParam.get("Loss_air") / 100.0);


            // 6.1 - 2
            // MCO2=(MQuicklime*LossQuicklime + MLimestone*LossLimestone + MDolomite*LossDolomite)
            double M_CO2 = actualData.getMQuicklime() * sParaMap.get("LossQuicklime") /100.0
                    + MLimestone * sParaMap.get("LossLimestone")/100.0 + MDolomite * sParaMap.get("LossDolomite")/100.0;

            // 6.1 - 3

            // 没懂 - ?????????????????????????


            // 6.2 - 热收入
            // M水=ΣMi*[H2O_2/(100-H2O_2)]
            // (i=mixedcoke，mixedore，Quicklime，Limestone，Dolomite)
            double M_H2O = (MMixedCoke + MMixedOre + actualData.getMQuicklime() + MLimestone + MDolomite)
                    * (envActualParam.get("H2O_2") / (100.0 - envActualParam.get("H2O_2")));

            double M_Return = (MMixedCoke + MMixedOre + actualData.getMQuicklime() + MLimestone + MDolomite) / (100.0 - envActualParam.get("ReturnSinter") * envActualParam.get("ReturnSinter"));

            double Q_Mixed = (MMixedCoke + MMixedOre + actualData.getMQuicklime() + MLimestone + MDolomite + M_Return) * sParaMap.get("CMixed") * envActualParam.get("TMaterial") + M_H2O * envActualParam.get("TMaterial");

            double Q_BeddingLayer = envActualParam.get("MBeddingLayer") * sParaMap.get("CBeddingLayer") * envActualParam.get("TBeddingLayer");

            // 煤气(coal gas)
            double Q_CoalGas = (VFireGas + VTemGas) * sParaMap.get("CGas") * envActualParam.get("TGas");

            double Q_Fire_TemAir = VFireAir * sParaMap.get("CAir") * envActualParam.get("TFireAir") + VTemAir * sParaMap.get("CAir") * envActualParam.get("TTemAir");

            double Q_Fire_TemGasBurn = (VFireGas + VTemGas) * qFireGas;

            // 疑问：TAir 是 TTemAir 还是 TFireAir ？
            double Q_SinterAir = (V_LossAir + V_SinterAir) * sParaMap.get("pAir") * sParaMap.get("CAir") * envActualParam.get("TVentilation");

            // MC-CO2=Σ(Mi*Ci)*(1-RCOgas/100)      MC-CO=Σ(Mi*Ci)*RCOgas/100
            // (i=mixedcoke，mixedore，Quicklime，Limestone，Dolomite)
            double M_C_CO2 = (MMixedCoke * CMixedCoke/100 + MMixedOre * CMixedOre/100 + actualData.getMQuicklime() * sParaMap.get("CQuicklime")/100
                    + MLimestone * sParaMap.get("CLimestone")/100 + MDolomite * sParaMap.get("CDolomite")/100 ) * (1 - envActualParam.get("RCOGas") / 100);

            double M_C_CO = (MMixedCoke * CMixedCoke/100 + MMixedOre * CMixedOre/100 + actualData.getMQuicklime() * sParaMap.get("CQuicklime")/100
                    + MLimestone * sParaMap.get("CLimestone")/100 + MDolomite * sParaMap.get("CDolomite")/100 ) * envActualParam.get("RCOGas") / 100;

            double Q_SolidBurn = (M_C_CO2 * 34072.0 + M_C_CO * 9167);

            double Q_SComponent = (MMixedCoke * FeS2MixedCoke + MMixedOre * FeS2MixedOre + actualData.getMQuicklime() * sParaMap.get("FeS2Quicklime")
                    + MLimestone * sParaMap.get("FeS2Limestone") + MDolomite * sParaMap.get("FeS2Dolomite")) / 100
                    * sParaMap.get("qFeS2") * envActualParam.get("DeS") / 100;

            double Q_FeO_in = ((MMixedCoke * FeOMixedCoke + MMixedOre * FeOMixedOre + actualData.getMQuicklime() * sParaMap.get("FeOQuicklime") + MLimestone * sParaMap.get("FeOLimestone") + MDolomite * sParaMap.get("FeODolomite")) / 100
                    - 1000 * FeOSinter / 100) * sParaMap.get("qFeO");

            if (Q_FeO_in < 0)
                Q_FeO_in = 0;

            // Q成渣 - Q_Slag
            double Q_Slag = (Q_Mixed + Q_BeddingLayer + Q_CoalGas + Q_Fire_TemAir + Q_Fire_TemGasBurn + Q_SinterAir + Q_SComponent + Q_FeO_in)
                    / (1 - 0.97) * 0.03;

            double Q_In = Q_Mixed + Q_BeddingLayer + Q_CoalGas + Q_Fire_TemAir + Q_Fire_TemGasBurn
                    + Q_SinterAir + Q_SolidBurn + Q_SComponent + Q_FeO_in + Q_Slag;

            System.out.println(" - - - - - - - - - - - - - - -");
            System.out.println("热收入");
            System.out.println("Q混合料  "+Q_Mixed);
            System.out.println("Q铺  "+Q_BeddingLayer);
            System.out.println("Q煤气  "+Q_CoalGas);
            System.out.println("Q点火+保温空气  "+Q_Fire_TemAir);
            System.out.println("Q点火+保温煤气燃烧  "+Q_Fire_TemGasBurn);
            System.out.println("Q烧空  "+Q_SinterAir);
            System.out.println("Q固燃  "+Q_SolidBurn);
            System.out.println("Q硫化物  "+Q_SComponent);
            System.out.println("QFeO_in  "+Q_FeO_in);
            System.out.println("Q成渣  "+Q_Slag);
            System.out.println(" - - - - - - - - - - - - - - -");


            //热支出
            //水分蒸发热
            double MWater=(MMixedCoke +MMixedOre +actualData.getMQuicklime() +MLimestone +MDolomite)
                    * (envActualParam.get("H2O_2") /(100 -envActualParam.get("H2O_2")));

            double QWater=MWater*sParaMap.get("qWater");

            //Fe2O3分解吸热

            double QFeO_Out=( (MMixedCoke*FeOMixedCoke + MMixedOre*FeOMixedOre + actualData.getMQuicklime()*sParaMap.get("FeOQuicklime") + MLimestone*sParaMap.get("FeOLimestone") + MDolomite*sParaMap.get("FeODolomite")) /100.0
                    - 1000.0*FeOSinter/100.0) *1952.06;

//            System.out.println("MMixedCoke*FeOMixedCoke  "+MMixedCoke*FeOMixedCoke);
            System.out.println("MMixedOre*FeOMixedOre  "+MMixedOre*FeOMixedOre);
            System.out.println("MMixedOre  "+MMixedOre);
            System.out.println("FeOMixedOre  "+FeOMixedOre);

//            System.out.println("MQuicklime*FeOQuicklime  "+actualData.getMQuicklime()*sParaMap.get("FeOQuicklime"));
//            System.out.println("MLimestone*FeOLimestone  "+MLimestone*sParaMap.get("FeOLimestone"));
//            System.out.println("MDolomite*FeODolomite  "+MDolomite*sParaMap.get("FeODolomite"));
            System.out.println("FeOSinter  "+FeOSinter);

            if(QFeO_Out<0){
                QFeO_Out=QFeO_Out*(-1);

            }else {
                QFeO_Out=0;
            }

            //碳酸盐分解吸热
            double Qcarbonate=(( (MLimestone+MDolomite) * (sParaMap.get("CaOLimestone")+sParaMap.get("CaODolomite")) /100.0 *3189.3)
                    + ((MLimestone+MDolomite) * (sParaMap.get("MgOLimestone")+sParaMap.get("MgODolomite")) *2516.4) ) /100.0;
//            System.out.println("碳酸盐分解热  "+Qcarbonate);

            // 烟气带走热
            double V_CO_flue_gas = ((MMixedCoke*CMixedCoke/100) + (MMixedOre*CMixedOre/100)) /12.0*22.4 *param.getRCOGas() /100;
            double V_CO2_flue_gas = VFireGas * (2.40+6.40+25.50)/100 + VTemGas*(2.40+6.40+25.50)/100 + (MMixedCoke*CMixedCoke/100 + MMixedOre*CMixedOre/100 )/12*22.4*((1-param.getRCOGas())/100) + M_CO2/44*22.4;
            double V_H2O_flue_gas = VFireGas * (58.20+25.50)/100 + VTemGas*(58.20+25.50)/100+(MMixedCoke +MMixedOre +actualData.getMQuicklime() +MLimestone +MDolomite)*(param.getH2O_2()/(100-param.getH2O_2()))/18.0*22.4;
            double V_N2_flue_gas = VFireGas * (4.20)/100 + VFireAir*79.0/100+VTemGas*(4.20)/100+VTemAir*79.0/100+V_SinterAir*79.0/100+V_LossAir*79.0/100;
            double V_O2_flue_gas = VFireGas * (0.50)/100 + VFireAir*21.0/100-VFireGas*O2Depletion+VTemGas*(0.50)/100+VTemAir*21.0/100-VTemAir*O2Depletion+
                    V_SinterAir*21.0/100* (param.getCoffExcess1()-1)+V_LossAir*21.0/100;
            double loss_S = MMixedOre * (FeS2MixedOre*64.0/120)*param.getDeS()/10000+actualData.getMQuicklime()*(sParaMap.get("FeS2Quicklime")*64.0/120)*param.getDeS()/10000+MLimestone*(sParaMap.get("FeS2Limestone")*64.0/120)*param.getDeS()/10000+
                    MDolomite*(sParaMap.get("FeS2Dolomite")*64.0/120)*param.getDeS()/10000+MMixedCoke*(Fe2O3MixedCoke*64.0/120)*param.getDeS()/10000;

            double V_SO2_flue_gas=loss_S/32*22.4;

            // 烟气
            double M_Gas = (V_CO_flue_gas*28.0 + V_CO2_flue_gas*44.0 + V_H2O_flue_gas*18.0 + V_N2_flue_gas*28.0 + V_O2_flue_gas*32.0 + V_SO2_flue_gas*64.0)/22.4;
            System.out.println("V_CO烟气  "+V_CO_flue_gas);
            System.out.println("V_CO2烟气  "+V_CO2_flue_gas);
            System.out.println("V_H2O烟气  "+V_H2O_flue_gas);
            System.out.println("V_N2烟气  "+V_N2_flue_gas);
            System.out.println("V_O2烟气  "+V_O2_flue_gas);
            System.out.println("V_SO2烟气  "+V_SO2_flue_gas);
            System.out.println("M烟气  "+M_Gas);
            double Q_Gas=M_Gas*1.436*param.getTGas();

            //烧结饼带走热，疑问
            double T = param.getTSinter();
            System.out.println("T  "+T);
//            double CSinter =    (0.115 + 0.257*(1.0/1000.0)*(T-100) - 0.0125*(1.0/100000.0)*(T-100)*(T-100)*4.1868);  //错误
            double CSinter =    (0.115 + 0.257*(1.0/1000.0)*(T-100) - 0.0125*(1.0/100000.0)*(T-100)*(T-100))*4.1868;  //正确
            System.out.println("CSinter  "+CSinter);


            QFire = (1000.0 + M_Return + param.getMBeddingLayer()) * CSinter * param.getTSinter();

            //热支出
            double Q_Out = QWater + QFeO_Out + Qcarbonate + Q_Gas + QFire;

            System.out.println("热支出");
            System.out.println("Q水  " + QWater);
            System.out.println("QFeO_Out  " + QFeO_Out);
            System.out.println("Q碳酸盐  " + Qcarbonate);
            System.out.println("Q烟气  " + Q_Gas);
            System.out.println("Q烧  " + QFire);

            System.out.println(" - - - - - - - - - - - - - - -");


            // 步骤7
            double R_Loss = (Q_In - Q_Out) / Q_In * 100.0;
            if (R_Loss <= envActualParam.get("R_Loss0")) {
                MMixedCoke += 0.01;
            } else {
                MMixedCoke -= 0.01;
            }


            // 条件判断
            // 条件1：abs（热损失比例-热损失设定）/热损失设定*100<0.3
//            flag1 = Math.abs(R_Loss - envActualParam.get("R_Loss0")) / envActualParam.get("R_Loss0") * 100.0 < 0.3;
            flag1 = Math.abs(R_Loss - envActualParam.get("R_Loss0")) / envActualParam.get("R_Loss0") * 100.0 < 3.0;
            System.out.println("R_Loss  "+R_Loss);
            System.out.println("flag1的值  "+Math.abs(R_Loss - envActualParam.get("R_Loss0")) / envActualParam.get("R_Loss0") *100.0);
            System.out.println("flag1  "+flag1);
            // 条件2：abs（MLimestone-MTEMP1）<0.1
            flag2 = Math.abs(MLimestone - MTemp1) < 0.1;
            System.out.println("MLimestone  "+MLimestone);
            System.out.println("MTemp1  "+MTemp1);
            System.out.println("flag2的值  "+Math.abs(MLimestone - MTemp1));
            System.out.println("flag2  "+flag2);
            // 条件3：abs（MDolomite-MTEMP2）<0.1
            flag3 = Math.abs(MDolomite - MTemp2) < 0.1;
            System.out.println("MDolomite  "+MDolomite);
            System.out.println("MTemp2  "+MTemp2);
            System.out.println("flag3的值  "+Math.abs(MDolomite - MTemp2));
            System.out.println("flag3  "+flag3);

            // 迭代次数判断
            counter++;

            System.out.println("当前循环迭代次数："+counter);
            boolean test = flag1 && (flag2 || flag3);

//            if (counter > 10000) break;
            if (counter > 10000) break;
//            else continue;
        } while (!(flag1 && (flag2 || flag3)));

        // 返回给前端的值
        double coke = MMixedCoke * actualData.getRatioCoke1();
        double coal = MMixedCoke * actualData.getRatioCoke2();
        double COG = (VFireGas + VTemGas) * param.getRCOG() / 100;
        double BFG = ((VFireGas + VTemGas) - COG);
        // 电耗？？疑问
        double electricity = 0.015 * Math.pow(84.0, 1.9);
        // 水耗=ΣMi*[H2O_2/(100-H2O_2)]-ΣMi*H2Oi/100
        //          (i=mixedcoke，mixedore，Quicklime，Limestone，Dolomite)
        double water = ((MMixedCoke + MMixedOre + actualData.getMQuicklime() + MLimestone + MDolomite)
                * (param.getH2O_2() / (100 - param.getH2O_2()))
                - (MMixedCoke * H2OMixedCoke + MMixedOre * H2OMixedOre + actualData.getMQuicklime() * sParaMap.get("H2OQuicklime")
                + MLimestone * sParaMap.get("H2OLimestone") + MDolomite * sParaMap.get("H2ODolomite")) /100  );
        double N2 = (V_LossAir + V_SinterAir) * 0.79 * 0.1;
        System.out.println("V漏风空气  "+V_LossAir);
        System.out.println("V烧结空气  "+V_SinterAir);
        double steam = QFire * param.getR_Rechot() /100.0 / sParaMap.get("qWater") *(-1);

        System.out.println("MMixedOre  " + MMixedOre);
        System.out.println("MLimestone  " + MLimestone);
        System.out.println("H2OMixedCoke  " +H2OMixedCoke);
        System.out.println("H2OMixedOre  " + H2OMixedOre);

        System.out.println("- - - 返回给前端的值 - - - ");
        System.out.println("coke  "+coke);
        System.out.println("coal  "+coal);
        System.out.println("COG  "+COG);
        System.out.println("BFG  "+BFG);
        System.out.println("电耗  "+electricity);
        System.out.println("水耗  "+water);
        System.out.println("N2  "+N2);
        System.out.println("蒸汽  "+steam);

        ActualVo actualVo = new ActualVo();
        actualVo.setCokeConsumption(coke);
        actualVo.setCoalConsumption(coal);
        actualVo.setCOGConsumption(COG);
        actualVo.setBFGConsumption(BFG);
        actualVo.setElectricityConsumption(electricity);
        actualVo.setWaterConsumption(water);
        actualVo.setN2Consumption(N2);
        actualVo.setSteamConsumption(steam);

        return actualVo;

    }

}
