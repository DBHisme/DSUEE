package com.example.extreme_energy_efficiency.controller;


import com.example.extreme_energy_efficiency.dao.ConvertRatioMapper;
import com.example.extreme_energy_efficiency.dao.entity.ConvertRatioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/Actual")
public class ConvertRatioController {
    @Autowired
    ConvertRatioMapper convertRatioMapper;

    @PostMapping(value = "/getConvertRatio", headers = "Accept=application/json")
    public List<ConvertRatioEntity> getConvertRatio(){
        return convertRatioMapper.getConvertRatio();
    }

}
