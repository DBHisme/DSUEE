package com.example.extreme_energy_efficiency;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.example.extreme_energy_efficiency.dao")
public class ExtremeEnergyEfficiencyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExtremeEnergyEfficiencyApplication.class, args);
    }
}
