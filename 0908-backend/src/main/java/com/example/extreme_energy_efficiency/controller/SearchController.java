package com.example.extreme_energy_efficiency.controller;


import com.example.extreme_energy_efficiency.dao.entity.InfoEntity;
import com.example.extreme_energy_efficiency.service.impl.InfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080") // 允许来自特定源的跨域请求
@RequestMapping("/api/search")
public class SearchController {
    @Resource
    private InfoService infoService;

    @GetMapping("/getInfo")
    public List<InfoEntity> getInfo(@RequestParam String key) {
        InfoEntity infoEntity = new InfoEntity();
        infoEntity.setArticle_name(key);
        return infoService.queryInfoList(infoEntity);
    }

}
