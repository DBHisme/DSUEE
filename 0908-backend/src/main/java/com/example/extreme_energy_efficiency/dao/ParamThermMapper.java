package com.example.extreme_energy_efficiency.dao;

import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ParamThermMapper {
    List<ParamTherm> selectAll();
}
