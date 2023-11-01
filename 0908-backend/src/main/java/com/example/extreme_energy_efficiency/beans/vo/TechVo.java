package com.example.extreme_energy_efficiency.beans.vo;

public class TechVo {
    private ActualVo actualVo;

    public TechVo(ActualVo actualVo) {
        this.actualVo = actualVo;
    }

    public ActualVo getActualVo() {
        return actualVo;
    }

    public void setActualVo(ActualVo actualVo) {
        this.actualVo = actualVo;
    }

    @Override
    public String toString() {
        return "TechVo{" +
                "actualVo=" + actualVo +
                '}';
    }
}
