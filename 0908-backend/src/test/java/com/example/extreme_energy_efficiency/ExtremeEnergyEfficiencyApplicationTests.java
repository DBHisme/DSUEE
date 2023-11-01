package com.example.extreme_energy_efficiency;

import com.example.extreme_energy_efficiency.beans.TheoryData;
import com.example.extreme_energy_efficiency.dao.*;
import com.example.extreme_energy_efficiency.service.TheoryService;
import com.googlecode.aviator.AviatorEvaluator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class ExtremeEnergyEfficiencyApplicationTests {
//
////    @Autowired
//    Theory1EntityMapper theory1EntityMapper;
//
////    @Autowired
//    TheoryService theoryService;
//
//    @Test
//    void contextLoads() {
//
//
//
//        // 从数据库中检索出公式
//        String formula = "mO2=MOC/12*32";
//
//        // 设置公式中的变量
//        double MOC = 1200.0; // 假设 MC 的值为 1000
//
//        // 使用 Aviator 进行计算
//
//        double result = (double) AviatorEvaluator.execute(formula.replaceAll("MOC", String.valueOf(MOC)));
//
//        System.out.println(result);
//    }
////
//
//    @Test
//    void testMC(){
//
////        System.out.println(theory1Service.getMC());
////        System.out.println(theory1Service.getN2());
//    }
//
//    @Test
//    void test2(){
//        //         步骤1：铁平衡方程获得矿石质量：More = 1000 * TFe / 100 * (160 / 112)
//
//        String formula =theory1EntityMapper.getFormulas("N001").getFormulas();
//        double More = (double) AviatorEvaluator.execute(formula.replaceAll("TFe", String.valueOf(TFe)));
//
//        // 步骤2：根据碱度方程求解熔剂质量 MCao、MSiO2
//        String formula2 =theory1EntityMapper.getFormulas("N017").getFormulas();
//        formula2=formula2.replaceAll("TFe", String.valueOf(TFe));
//
//        System.out.println(formula2);
//        double MSiO2 = (double) AviatorEvaluator.execute(formula2);
//        System.out.println(MSiO2);
//
//        double MCao=MSiO2*1.8;
//    }
//
//
//    @Test
//     void check(){
//
//        String formula3=theory1EntityMapper.getFormulas("N009").getFormulas();
//        Map<String,Object> env=new HashMap<>();
//        env.put("More", 852);
//        env.put("x", 52);
//        double Fe2O3显热=(double) AviatorEvaluator.execute(formula3, env);
//        System.out.println(Fe2O3显热);
//    }
//
//    double TFe = new TheoryData().getTFe();
//    double Tsolid_start=new TheoryData().getTsolid_start();
//    double Tsolid_end=new TheoryData().getTsolid_end();
//
//    @Test
//    void test(){
//
//
//
//
////         步骤1：铁平衡方程获得矿石质量：More = 1000 * TFe / 100 * (160 / 112)
//
//        String formula =theory1EntityMapper.getFormulas("N001").getFormulas();
//        double More = (double) AviatorEvaluator.execute(formula.replaceAll("TFe", String.valueOf(TFe)));
//
//        System.out.println(More);
//        // 步骤2：根据碱度方程求解熔剂质量 MCao、MSiO2
//        String formula2 =theory1EntityMapper.getFormulas("N017").getFormulas();
//        double MSiO2 = (double) AviatorEvaluator.execute(formula2.replaceAll("TFe", String.valueOf(TFe)));
//        double MCao=MSiO2*1.8;
//
//        System.out.println(MSiO2);
//        System.out.println(MCao);
//
//
//        // 步骤3：根据热平衡计算烟气质量 Mgas 和焦炭质量 MC
//        // 3.1 气体平衡
//
//
//        // 热收入
////        燃烧热
//        String formulaN008=theory1EntityMapper.getFormulas("N008").getFormulas();
//
////        Fe2O3显热
//        String formula3=theory1EntityMapper.getFormulas("N009").getFormulas();
//        Map<String,Object> env=new HashMap<>();
//        env.put("More", More);
//        env.put("x", Tsolid_start);
//        double Fe2O3显热=(double) AviatorEvaluator.execute(formula3, env);
//        System.out.println(Fe2O3显热);
//
////       CaO显热
//        String formula4=theory1EntityMapper.getFormulas("N010").getFormulas();
//        Map<String,Object> env2=new HashMap<>();
//        env2.put("MCao", MCao);
//        env2.put("x", Tsolid_start);
//        double CaO显热=(double) AviatorEvaluator.execute(formula4, env2);
//        System.out.println(CaO显热);
//
////        SiO2显热
//        String formula5=theory1EntityMapper.getFormulas("N011").getFormulas();
//        Map<String,Object> env3=new HashMap<>();
//        env3.put("MSiO2", MSiO2);
//        env3.put("x", Tsolid_start);
//        double SiO2显热=(double) AviatorEvaluator.execute(formula5, env3);
//        System.out.println(SiO2显热);
//
////        气体显热
//        String formula6=theory1EntityMapper.getFormulas("N012").getFormulas();
//
//
//
//        // 热支出
//        String formulaNo13=theory1EntityMapper.getFormulas("N013").getFormulas();
//
//        Map<String,Object> envN013=new HashMap<>();
//        envN013.put("More", More);
//        envN013.put("y", Tsolid_end);
//        double heatFe2O3Out=(double) AviatorEvaluator.execute(formulaNo13, envN013);
//        System.out.println(heatFe2O3Out);
//
//        //       CaO显热
//        String formulaN014=theory1EntityMapper.getFormulas("N014").getFormulas();
//        Map<String,Object> envN014=new HashMap<>();
//        envN014.put("MCao", MCao);
//        envN014.put("y", Tsolid_end);
//        double heatCaOOut=(double) AviatorEvaluator.execute(formulaN014, envN014);
//        System.out.println(heatCaOOut);
//
//
//        //        SiO2显热
//        String formulaN015=theory1EntityMapper.getFormulas("N015").getFormulas();
//        Map<String,Object> envN015=new HashMap<>();
//        envN015.put("MSiO2", MSiO2);
//        envN015.put("y", Tsolid_end);
//        double heatSiO2Out=(double) AviatorEvaluator.execute(formulaN015, envN015);
//        System.out.println(heatSiO2Out);
//
//
//        String formulaN016=theory1EntityMapper.getFormulas("N016").getFormulas();
//
//
//        double Sensible_heat_of_raw_material=Fe2O3显热+CaO显热+SiO2显热;
//
////        热支出
//        double Sintered_cake_sensible_heat=heatFe2O3Out+heatCaOOut+heatSiO2Out;
//
//        double remainder=Sintered_cake_sensible_heat-Sensible_heat_of_raw_material;
//
//
//
//        String formulaMC = "-((1.0/12) * (393.51 + (32.0/32) * (0.0012 * x * x + 32.443 * x - 10595) + ((1.0/(0.2107928 * 28)) * (0.0021 * x * x + 27.865 * x - 8493.3)) - ((44.0/44) * (0.0012 * y * y + 53.658 * y - 19630)) - remainder))";
//
//        Map<String,Object> envMC=new HashMap<>();
//        envMC.put("x", Tsolid_start);
//        envMC.put("y", Tsolid_end);
//        envMC.put("remainder",remainder);
//        double MCQuality=(double) AviatorEvaluator.execute(formulaMC, envMC);
//        System.out.println(MCQuality);
//
//    }
//
//
//
//
    @Autowired
    RatioMixedCokeMapper ratioMixedCokeMapper;
    @Autowired
    private Theory1EntityMapper theory1EntityMapper;
    @Autowired
    private Theory2EntityMapper theory2EntityMapper;
    @Autowired
    private Theory3EntityMapper theory3EntityMapper;
    @Autowired
    RatioMixedOreMapper ratioMixedOreMapper;
    @Test
    void testRatioCoke(){
        System.out.println(ratioMixedCokeMapper.selectAll());
    }
    @Test
    void testRatioOre(){
//        System.out.println(ratioMixedOreMapper.selectAll());
        double TFe=58.5;
        double R2=1.8;
//        String formula2 =theory1EntityMapper.getFormulas("N017").getFormulas();
//        Map<String,Object> MSio2=new HashMap<>();
//        MSio2.put("TFe", TFe);
//        MSio2.put("R2", R2);
//        double MSiO2 = (double) AviatorEvaluator.execute(formula2,MSio2);
//        System.out.println("MSiO2：看看看看"+MSiO2);
//        double MCao=MSiO2*R2;
//        String formula2 =theory2EntityMapper.getFormulas("M017").getFormulas();
//        Map<String,Object> MSio2=new HashMap<>();
//        MSio2.put("TFe", TFe);
//        MSio2.put("R2", R2);
//        double MSiO2 = (double) AviatorEvaluator.execute(formula2,MSio2);
//        System.out.println("MSiO2：看看看看"+MSiO2);
//        double MCaCO3=R2*MSiO2*100/56;
//        String formula2 =theory3EntityMapper.getFormulas("B019").getFormulas();
//        Map<String,Object> MSio2=new HashMap<>();
//        MSio2.put("TFe", TFe);
//        MSio2.put("R2", R2);
//        double MSiO2 = (double) AviatorEvaluator.execute(formula2,MSio2);
//        System.out.println("MSiO2：看看看看"+MSiO2);
//        double MCaCO3=R2*MSiO2*100/56;

        String formula =theory3EntityMapper.getFormulas("B001").getFormulas();
        double More = (double) AviatorEvaluator.execute(formula.replaceAll("TFe", String.valueOf(TFe)));
        System.out.println(More);

    }


}
