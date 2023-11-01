package com.example.extreme_energy_efficiency.dao;

import com.example.extreme_energy_efficiency.dao.entity.RatioMixedOre;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RatioMixedOreMapper {
    List<RatioMixedOre> selectAll();
}
