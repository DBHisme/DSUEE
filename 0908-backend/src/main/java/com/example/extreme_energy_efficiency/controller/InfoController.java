package com.example.extreme_energy_efficiency.controller;

import com.example.extreme_energy_efficiency.beans.HttpResponseEntity;
import com.example.extreme_energy_efficiency.dao.entity.InfoEntity;
import com.example.extreme_energy_efficiency.service.impl.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class InfoController {
    @Autowired
    private InfoService infoService;

    /**
     * 用户列表查询
     * @param infoEntity
     * @return
     */
    @RequestMapping(value = "/queryInfoList",method = RequestMethod.POST,headers = "Accept=application/json")
    public HttpResponseEntity queryInfoList(@RequestBody InfoEntity infoEntity){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try{
            if(infoEntity.getArticle_name() ==null){
                infoEntity.setArticle_name("");
            }
            if(infoEntity.getId() == null){
                infoEntity.setId("");
            }
            List<InfoEntity> hasUser = infoService.queryInfoList(infoEntity);
            System.out.println(hasUser);
            if(CollectionUtils.isEmpty(hasUser)){
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("无用户信息");
            }else{
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(hasUser);
                httpResponseEntity.setMessage("查询成功");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return httpResponseEntity;
    }

}
