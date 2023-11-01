package com.example.extreme_energy_efficiency.service.impl;

import com.example.extreme_energy_efficiency.dao.HistoryActualMapper;
import com.example.extreme_energy_efficiency.dao.HistoryTechMapper;
import com.example.extreme_energy_efficiency.dao.HistoryTheoryMapper;
import com.example.extreme_energy_efficiency.dao.entity.History;
import com.example.extreme_energy_efficiency.service.HistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryActualMapper historyActualMapper;
    @Autowired
    private HistoryTechMapper historyTechMapper;
    @Autowired
    private HistoryTheoryMapper historyTheoryMapper;

    public List<History> getHistoryList(){
        List<History> result = new ArrayList<>();
        result.addAll(historyActualMapper.selectAll());
        result.addAll(historyTechMapper.selectAll());
        result.addAll(historyTheoryMapper.selectAll());
        return result;
    }

    public int addOneHistory(History history){
        if (history.getName().equals("实际模型")){
            return historyActualMapper.insert(history);
        }else if (history.getName().equals("技术模型")){
            return historyTechMapper.insert(history);
        }else if (history.getName().equals("理论模型")){
            return historyTheoryMapper.insert(history);
        }else {
            return -1;
        }
    }

    public int deleteHistoryByID(History history){
        if (history.getName().equals("实际模型")){
            return historyActualMapper.deleteByID(history);
        }else if (history.getName().equals("技术模型")){
            return historyTechMapper.deleteByID(history);
        }else if (history.getName().equals("理论模型")){
            return historyTheoryMapper.deleteByID(history);
        }else {
            return -1;
        }
    }

    public List<History> getHistoryListBetween(Date startTime, Date endTime){
        List<History> result = new ArrayList<>();
        result.addAll(historyActualMapper.selectAll());
        result.addAll(historyTechMapper.selectAll());
        result.addAll(historyTheoryMapper.selectAll());

        result.removeIf(history -> history.getUpdateTime().before(startTime)
                || history.getUpdateTime().after(endTime));
        return result;
    }
}
