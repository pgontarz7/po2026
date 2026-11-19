package agh.po.symulator;

public class Sprzeglo extends Komponent {

    boolean stanSprzęgła;

    public void sprzeglo_on(int stanSprzęgła){
        stanSprzęgła = 1;
    }

    public void sprzeglo_off(int stanSprzęgła){
        stanSprzęgła = 0;
    }



    void wcisnij(){
        sprzeglo_on();
    }

    void zwolnij(){
        sprzeglo_off();

    }
}
