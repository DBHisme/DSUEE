package com.example.extreme_energy_efficiency.dao.entity;

public class ActualParameter {

    private String name;
    private double parameter;
    private String annotation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getParameter() {
        return parameter;
    }

    public void setParameter(double parameter) {
        this.parameter = parameter;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "actualParameter{" +
                "name='" + name + '\'' +
                ", parameter=" + parameter +
                ", annotation='" + annotation + '\'' +
                '}';
    }
}
