package com.example.extreme_energy_efficiency.service.impl;


import com.example.extreme_energy_efficiency.dao.InfoEntityMapper;
import com.example.extreme_energy_efficiency.dao.entity.InfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {
    @Autowired
    private InfoEntityMapper infoEntityMapper;

    /**
     * 查询用户列表
     * @param
     * @return
     */
    public List<InfoEntity> queryInfoList(InfoEntity infoEntity){
        if(infoEntity.getArticle_name() ==null){
            infoEntity.setArticle_name("");
        }
        if(infoEntity.getId() == null){
            infoEntity.setId("");
        }
        List<InfoEntity> result = infoEntityMapper.queryInfoList(infoEntity);
        return result;
    }



}
