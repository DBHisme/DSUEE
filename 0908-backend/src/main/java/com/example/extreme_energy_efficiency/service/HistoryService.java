package com.example.extreme_energy_efficiency.service;

import com.example.extreme_energy_efficiency.dao.entity.History;

import java.util.Date;
import java.util.List;

public interface HistoryService {
    List<History> getHistoryList();

    int addOneHistory(History history);

    int deleteHistoryByID(History history);

    List<History> getHistoryListBetween(Date startTime, Date endTime);
}
