package com.example.extreme_energy_efficiency.beans;


import lombok.Data;

@Data
public class Response {

    private Boolean flag;
    private Object data;

    public Response(){}

    public Response(Boolean flag, Object data){
        this.flag=flag;
        this.data=data;
    }
}
