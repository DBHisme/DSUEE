package com.example.extreme_energy_efficiency.dao.entity;

public class TheoryEntity {
    private String ID;
    private String Formulas;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFormulas() {
        return Formulas;
    }

    public void setFormulas(String formulas) {
        Formulas = formulas;
    }

    @Override
    public String toString() {
        return "TheoryEntity{" +
                "ID='" + ID + '\'' +
                ", Formulas='" + Formulas + '\'' +
                '}';
    }

}
