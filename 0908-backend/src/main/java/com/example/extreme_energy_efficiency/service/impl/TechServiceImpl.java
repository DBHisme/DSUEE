package com.example.extreme_energy_efficiency.service.impl;

import com.example.extreme_energy_efficiency.beans.ActualData;
import com.example.extreme_energy_efficiency.beans.vo.ActualVo;
import com.example.extreme_energy_efficiency.beans.vo.TechVo;
import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import com.example.extreme_energy_efficiency.dao.entity.RatioConvert;
import com.example.extreme_energy_efficiency.dao.entity.Param;
import com.example.extreme_energy_efficiency.service.ActualService;
import com.example.extreme_energy_efficiency.service.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechServiceImpl implements TechService {
    @Autowired
    private ActualService actualService;

    /**
     * 小球烧结
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    public TechVo pelletSinter(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList){
        // 燃料燃烧率 92% ...
        // FeO含量 （5%~7%）...
        param.setReturnSinter(5.0);
        ActualVo actualVo = actualService.calculate(actualData, param, ratioConvert, paramThermList);
        TechVo techVo = new TechVo(actualVo);
        return techVo;
    }

    /**
     * 支撑烧结
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    public TechVo strutSinter(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList){
        // 燃料燃烧率 96% ...
        ActualVo actualVo = actualService.calculate(actualData, param, ratioConvert, paramThermList);
        TechVo techVo = new TechVo(actualVo);
        return techVo;
    }

    /**
     * 变频技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    public TechVo inverterTech(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList){
        ActualVo actualVo = actualService.calculate(actualData, param, ratioConvert, paramThermList);
        actualVo.setElectricityConsumption(actualVo.getElectricityConsumption() *0.9);
        TechVo techVo = new TechVo(actualVo);
        return techVo;
    }

    /**
     * 回收技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    public TechVo recycleTech(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList){
        // 余热回收率 提高10% ...
        ActualVo actualVo = actualService.calculate(actualData, param, ratioConvert, paramThermList);
        TechVo techVo = new TechVo(actualVo);
        return techVo;
    }

    /**
     * 磁封、水封技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    public TechVo magneticWaterSeal(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList){
        param.setLoss_air(param.getLoss_air() *0.7);
        ActualVo actualVo = actualService.calculate(actualData, param, ratioConvert, paramThermList);
        TechVo techVo = new TechVo(actualVo);
        return techVo;
    }

    /**
     * 厚料层技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    public TechVo thickLayer(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList){
        param.setR_Loss0(param.getR_Loss0() *0.99);
        ActualVo actualVo = actualService.calculate(actualData, param, ratioConvert, paramThermList);
        TechVo techVo = new TechVo(actualVo);
        return techVo;
    }
}
