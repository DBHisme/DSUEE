package com.example.extreme_energy_efficiency.controller;

import com.example.extreme_energy_efficiency.beans.Response;
import com.example.extreme_energy_efficiency.beans.dto.ActualTechDTO;
import com.example.extreme_energy_efficiency.service.impl.ActualServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/Actual")
public class ActualController {
    @Autowired
    ActualServiceImpl actualService;

    @PostMapping(value = "/GetActualVo", headers = "Accept=application/json")
    public Response getResult(@RequestBody ActualTechDTO actualTechDTO){
//        System.out.println(actualTechDTO);
        return new Response(true,
                actualService.calculate(
                        actualTechDTO.getActualData(),
                        actualTechDTO.getParam(),
                        actualTechDTO.getRatioConvert(),
                        actualTechDTO.getParamThermList()
                ));
    }

}
