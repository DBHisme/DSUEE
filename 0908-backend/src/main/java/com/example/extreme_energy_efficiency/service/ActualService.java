package com.example.extreme_energy_efficiency.service;

import com.example.extreme_energy_efficiency.beans.ActualData;
import com.example.extreme_energy_efficiency.dao.entity.Param;
import com.example.extreme_energy_efficiency.beans.vo.ActualVo;
import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import com.example.extreme_energy_efficiency.dao.entity.RatioConvert;

import java.util.List;

public interface ActualService {
    ActualVo calculate(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList);
}
