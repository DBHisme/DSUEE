package com.example.extreme_energy_efficiency.service.impl;

import com.example.extreme_energy_efficiency.dao.ParamThermMapper;
import com.example.extreme_energy_efficiency.dao.RatioMixedCokeMapper;
import com.example.extreme_energy_efficiency.dao.RatioMixedOreMapper;
import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import com.example.extreme_energy_efficiency.dao.entity.RatioMixedCoke;
import com.example.extreme_energy_efficiency.dao.entity.RatioMixedOre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatioMixedService {
    @Autowired
    private RatioMixedCokeMapper ratioMixedCokeMapper;
    @Autowired
    private RatioMixedOreMapper ratioMixedOreMapper;
    @Autowired
    private ParamThermMapper paramThermMapper;

    public List<RatioMixedCoke> getRatioMixedCokeList(){
        List<RatioMixedCoke> ratioMixedCokeList = ratioMixedCokeMapper.selectAll();
        return ratioMixedCokeList;
    }

    public List<RatioMixedOre> getRatioMixedOreList(){
        List<RatioMixedOre> ratioMixedOreList = ratioMixedOreMapper.selectAll();
        return ratioMixedOreList;
    }

    public List<ParamTherm> getParamThermList(){
        List<ParamTherm> paramThermList = paramThermMapper.selectAll();
        return paramThermList;
    }

}
