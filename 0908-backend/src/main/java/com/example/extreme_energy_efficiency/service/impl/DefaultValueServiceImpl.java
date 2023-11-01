package com.example.extreme_energy_efficiency.service.impl;

import com.example.extreme_energy_efficiency.dao.DefaultValueMapper;
import com.example.extreme_energy_efficiency.dao.entity.DefaultValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultValueServiceImpl {
    @Autowired
    private DefaultValueMapper defaultValueMapper;

    public List<DefaultValue> getDefaultValueList(){
        return defaultValueMapper.selectAll();
    }
}
