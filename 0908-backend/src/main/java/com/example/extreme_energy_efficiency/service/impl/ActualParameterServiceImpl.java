package com.example.extreme_energy_efficiency.service.impl;


import com.example.extreme_energy_efficiency.dao.ActualParameterMapper;
import com.example.extreme_energy_efficiency.dao.entity.ActualParameter;
import com.example.extreme_energy_efficiency.service.ActualParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActualParameterServiceImpl implements ActualParameterService {

    @Autowired
    private ActualParameterMapper actualParameterMapper;

    @Override
    public List<ActualParameter> getParameters() {
        return actualParameterMapper.getParameters();
    }
}
