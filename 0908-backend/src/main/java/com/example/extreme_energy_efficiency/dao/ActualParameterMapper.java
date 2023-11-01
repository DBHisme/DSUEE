package com.example.extreme_energy_efficiency.dao;


import com.example.extreme_energy_efficiency.dao.entity.ActualParameter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ActualParameterMapper {

    //获取所有参数
    List<ActualParameter> getParameters();


}
