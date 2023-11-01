package com.example.extreme_energy_efficiency.dao;


import com.example.extreme_energy_efficiency.dao.entity.ConvertRatioEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ConvertRatioMapper {
    //获得折标系数
    List<ConvertRatioEntity> getConvertRatio();

}