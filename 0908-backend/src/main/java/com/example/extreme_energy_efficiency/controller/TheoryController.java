package com.example.extreme_energy_efficiency.controller;

import com.example.extreme_energy_efficiency.beans.Response;
import com.example.extreme_energy_efficiency.beans.TheoryData;
import com.example.extreme_energy_efficiency.service.impl.Theory2ServiceImpl;
import com.example.extreme_energy_efficiency.service.impl.TheoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/Theory")
public class TheoryController {
    @Autowired
    TheoryServiceImpl theoryService;

    //MC 水 蒸汽 氮气*0.1 其他为0

    @PostMapping(value = "/GetResult", headers = "Accept=application/json")
    public Response getResult(@RequestBody TheoryData theoryData){
        return new Response(true, theoryService.getResult(theoryData));
    }

}
