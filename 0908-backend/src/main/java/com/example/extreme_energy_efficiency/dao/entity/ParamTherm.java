package com.example.extreme_energy_efficiency.dao.entity;

public class ParamTherm {
    private String name;
    private double value;
    private String annotation;

    public ParamTherm(String name, double value, String annotation) {
        this.name = name;
        this.value = value;
        this.annotation = annotation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "ParamTherm{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", annotation='" + annotation + '\'' +
                '}';
    }
}
