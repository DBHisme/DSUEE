package com.example.extreme_energy_efficiency.dao;


import com.example.extreme_energy_efficiency.dao.entity.TheoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface Theory1EntityMapper {
     //获取公式
     TheoryEntity getFormulas(String ID);

}
