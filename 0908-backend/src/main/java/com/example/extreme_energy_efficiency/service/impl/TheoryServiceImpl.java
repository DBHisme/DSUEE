package com.example.extreme_energy_efficiency.service.impl;

import com.example.extreme_energy_efficiency.beans.TheoryData;
import com.example.extreme_energy_efficiency.beans.vo.ActualVo;
import com.example.extreme_energy_efficiency.service.TheoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheoryServiceImpl implements TheoryService {
    @Autowired
    Theory1ServiceImpl theory1Service;
    @Autowired
    Theory2ServiceImpl theory2Service;
    @Autowired
    Theory3ServiceImpl theory3Service;

    public ActualVo getResult(TheoryData theoryData){
        return theory3Service.calculate(theoryData);
    }
}
