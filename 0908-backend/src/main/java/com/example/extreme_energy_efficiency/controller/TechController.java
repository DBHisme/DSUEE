package com.example.extreme_energy_efficiency.controller;

import com.example.extreme_energy_efficiency.beans.Response;
import com.example.extreme_energy_efficiency.beans.dto.ActualTechDTO;
import com.example.extreme_energy_efficiency.service.impl.TechServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/Tech")
public class TechController {
    @Autowired
    TechServiceImpl techService;

    /**
     * 小球烧结
     * @param techDTO
     * @return
     */
    @PostMapping(value = "/GetPellet", headers = "Accept=application/json")
    public Response getPellet(@RequestBody ActualTechDTO techDTO){
        return new Response(true,
                techService.pelletSinter(
                        techDTO.getActualData(),
                        techDTO.getParam(),
                        techDTO.getRatioConvert(),
                        techDTO.getParamThermList()
                ));
    }

    /**
     * 支撑烧结
     * @param techDTO
     * @return
     */
    @PostMapping(value = "/GetStrut", headers = "Accept=application/json")
    public Response getStrut(@RequestBody ActualTechDTO techDTO){
        return new Response(true,
                techService.strutSinter(
                        techDTO.getActualData(),
                        techDTO.getParam(),
                        techDTO.getRatioConvert(),
                        techDTO.getParamThermList()
                ));
    }

    /**
     * 变频技术
     * @param techDTO
     * @return
     */
    @PostMapping(value = "/GetInverter", headers = "Accept=application/json")
    public Response getInverter(@RequestBody ActualTechDTO techDTO){
        return new Response(true,
                techService.inverterTech(
                        techDTO.getActualData(),
                        techDTO.getParam(),
                        techDTO.getRatioConvert(),
                        techDTO.getParamThermList()
                ));
    }

    /**
     * 回收技术
     * @param techDTO
     * @return
     */
    @PostMapping(value = "/GetRecycle", headers = "Accept=application/json")
    public Response getRecycle(@RequestBody ActualTechDTO techDTO){
        return new Response(true,
                techService.recycleTech(
                        techDTO.getActualData(),
                        techDTO.getParam(),
                        techDTO.getRatioConvert(),
                        techDTO.getParamThermList()
                ));
    }

    /**
     * 磁封、水封技术
     * @param techDTO
     * @return
     */
    @PostMapping(value = "/GetSeal", headers = "Accept=application/json")
    public Response getSeal(@RequestBody ActualTechDTO techDTO){
        return new Response(true,
                techService.magneticWaterSeal(
                        techDTO.getActualData(),
                        techDTO.getParam(),
                        techDTO.getRatioConvert(),
                        techDTO.getParamThermList()
                ));
    }

    /**
     * 厚料层技术
     * @param techDTO
     * @return
     */
    @PostMapping(value = "/GetThickLayer", headers = "Accept=application/json")
    public Response getThickLayer(@RequestBody ActualTechDTO techDTO){
        return new Response(true,
                techService.thickLayer(
                        techDTO.getActualData(),
                        techDTO.getParam(),
                        techDTO.getRatioConvert(),
                        techDTO.getParamThermList()
                ));
    }
}
