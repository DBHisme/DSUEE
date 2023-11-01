package com.example.extreme_energy_efficiency.dao;


import com.example.extreme_energy_efficiency.dao.entity.TheoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Theory2EntityMapper {
    //获取公式
    TheoryEntity getFormulas(String ID);

}
