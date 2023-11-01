package com.example.extreme_energy_efficiency.controller;

import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import com.example.extreme_energy_efficiency.dao.entity.RatioMixedCoke;
import com.example.extreme_energy_efficiency.dao.entity.RatioMixedOre;
import com.example.extreme_energy_efficiency.service.impl.RatioMixedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/RatioMixed")
public class RatioMixedController {
    @Autowired
    private RatioMixedService ratioMixedService;

    @PostMapping("/getRatioMixedCoke")
    public List<RatioMixedCoke> getRatioMixedCoke(){
        return ratioMixedService.getRatioMixedCokeList();
    }

    @PostMapping("/getRatioMixedOre")
    public List<RatioMixedOre> getRatioMixedOre(){
        return ratioMixedService.getRatioMixedOreList();
    }

    @PostMapping("/getParamTherm")
    public List<ParamTherm> getParamTherm(){
        return ratioMixedService.getParamThermList();
    }

}
