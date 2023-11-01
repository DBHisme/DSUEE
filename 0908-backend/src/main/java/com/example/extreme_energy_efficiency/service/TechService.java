package com.example.extreme_energy_efficiency.service;

import com.example.extreme_energy_efficiency.beans.ActualData;
import com.example.extreme_energy_efficiency.beans.vo.TechVo;
import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import com.example.extreme_energy_efficiency.dao.entity.RatioConvert;
import com.example.extreme_energy_efficiency.dao.entity.Param;

import java.util.List;

public interface TechService {
    /**
     * 小球烧结
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    TechVo pelletSinter(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList);

    /**
     * 支撑烧结
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    TechVo strutSinter(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList);

    /**
     * 变频技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    TechVo inverterTech(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList);

    /**
     * 回收技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    TechVo recycleTech(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList);

    /**
     * 磁封、水封技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    TechVo magneticWaterSeal(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList);

    /**
     * 厚料层技术
     * @param actualData
     * @param param
     * @param ratioConvert
     */
    TechVo thickLayer(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList);

}
