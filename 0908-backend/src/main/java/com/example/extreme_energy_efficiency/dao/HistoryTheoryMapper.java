package com.example.extreme_energy_efficiency.dao;

import com.example.extreme_energy_efficiency.dao.entity.History;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface HistoryTheoryMapper {
    List<History> selectAll();
    int insert(History history);
    int deleteByID(History history);
}
