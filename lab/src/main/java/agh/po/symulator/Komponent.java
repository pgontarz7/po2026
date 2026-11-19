package agh.po.symulator;

public class Komponent {

    String producent;
    String model;

    public Komponent(){}

    public Komponent(String producent, String model){
        this.producent = producent;
        this.model = model;
    }

    public String get_producent(){

        return producent;
    }

    public String get_model(){

        return model;

    }






}
