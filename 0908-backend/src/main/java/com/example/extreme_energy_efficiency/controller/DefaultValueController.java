package com.example.extreme_energy_efficiency.controller;

import com.example.extreme_energy_efficiency.dao.entity.DefaultValue;
import com.example.extreme_energy_efficiency.service.impl.DefaultValueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/DefaultValue")
public class DefaultValueController {
    @Autowired
    private DefaultValueServiceImpl defaultValueService;

    @PostMapping(value = "/getDefaultValueList", headers = "Accept=application/json")
    public List<DefaultValue> getDefaultValueList(){
        return defaultValueService.getDefaultValueList();
    }
}
