package com.example.extreme_energy_efficiency.service;

import com.example.extreme_energy_efficiency.dao.entity.ActualParameter;

import java.util.List;

public interface ActualParameterService {

    //获取所有参数
    List<ActualParameter> getParameters();
}
