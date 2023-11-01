package com.example.extreme_energy_efficiency.beans.dto;

import com.example.extreme_energy_efficiency.beans.ActualData;
import com.example.extreme_energy_efficiency.dao.ParamThermMapper;
import com.example.extreme_energy_efficiency.dao.entity.Param;
import com.example.extreme_energy_efficiency.dao.entity.ParamTherm;
import com.example.extreme_energy_efficiency.dao.entity.RatioConvert;

import java.util.List;

public class ActualTechDTO {

    private ActualData actualData;
    private Param param;
    private RatioConvert ratioConvert;
    private List<ParamTherm> paramThermList;

    public ActualTechDTO(ActualData actualData, Param param, RatioConvert ratioConvert, List<ParamTherm> paramThermList) {
        this.actualData = actualData;
        this.param = param;
        this.ratioConvert = ratioConvert;
        this.paramThermList = paramThermList;
    }

    public ActualData getActualData() {
        return actualData;
    }

    public void setActualData(ActualData actualData) {
        this.actualData = actualData;
    }

    public Param getParam() {
        return param;
    }

    public void setParam(Param param) {
        this.param = param;
    }

    public RatioConvert getRatioConvert() {
        return ratioConvert;
    }

    public void setRatioConvert(RatioConvert ratioConvert) {
        this.ratioConvert = ratioConvert;
    }

    public List<ParamTherm> getParamThermList() {
        return paramThermList;
    }

    public void setParamThermList(List<ParamTherm> paramThermList) {
        this.paramThermList = paramThermList;
    }

    @Override
    public String toString() {
        return "ActualTechDTO{" +
                "actualData=" + actualData +
                ", param=" + param +
                ", ratioConvert=" + ratioConvert +
                ", paramThermList=" + paramThermList +
                '}';
    }
}
