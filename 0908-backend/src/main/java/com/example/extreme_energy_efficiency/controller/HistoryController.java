package com.example.extreme_energy_efficiency.controller;

import com.example.extreme_energy_efficiency.beans.Response;
import com.example.extreme_energy_efficiency.dao.entity.History;
import com.example.extreme_energy_efficiency.service.impl.HistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin("*")
@RestController
@RequestMapping("/History")
public class HistoryController {
    @Autowired
    HistoryServiceImpl historyService;

    @PostMapping(value = "/getHistoryList", headers = "Accept=application/json")
    public Response getHistoryList(){
        return new Response(true, historyService.getHistoryList());
    }

    @PostMapping(value = "/addOneHistory", headers = "Accept=application/json")
    public Response addOneHistory(@RequestBody History history){
        if (historyService.addOneHistory(history)==-1){
            return new Response(false, "请检查所填字段");
        }else {
            return new Response(true, historyService.addOneHistory(history));
        }
    }

    @PostMapping(value = "/deleteHistoryByID", headers = "Accept=application/json")
    public Response deleteHistoryByID(@RequestBody History history){
        if (historyService.deleteHistoryByID(history)<=0){
            return new Response(false, "不存在该数据");
        }
        return new Response(true, historyService.deleteHistoryByID(history));
    }

    @GetMapping(value = "/getHistoryListBetween", headers = "Accept=application/json")
    public Response getHistoryListBetween(@RequestParam("startTime") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startTime,
                                          @RequestParam("endTime") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime) {
        return new Response(true, historyService.getHistoryListBetween(startTime, endTime));
    }

}
