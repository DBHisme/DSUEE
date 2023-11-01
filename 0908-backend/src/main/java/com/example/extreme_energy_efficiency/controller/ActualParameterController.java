package com.example.extreme_energy_efficiency.controller;


import com.example.extreme_energy_efficiency.dao.entity.ActualParameter;
import com.example.extreme_energy_efficiency.service.impl.ActualParameterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/Actual")
public class ActualParameterController {
    @Autowired
    ActualParameterServiceImpl actualParameterService;

    @PostMapping(value = "/getActualParameter", headers = "Accept=application/json")
    public List<ActualParameter> getActualParameters(){
        return actualParameterService.getParameters();
    }
}
