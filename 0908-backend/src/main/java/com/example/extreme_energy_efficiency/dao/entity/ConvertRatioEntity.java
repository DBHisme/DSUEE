package com.example.extreme_energy_efficiency.dao.entity;

//从数据库获得折标系数
public class ConvertRatioEntity {
    private String name;
    private double ratio;
    private String annotation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "convert_ratioEntity{" +
                "name='" + name + '\'' +
                ", ratio=" + ratio +
                ", annotation='" + annotation + '\'' +
                '}';
    }
}
