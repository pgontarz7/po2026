package agh.po.symulator;

public class Samochod {

    Silnik silnik;
    SkrzyniaBiegow skrzynia;

    public Samochod(){
        silnik = new Silnik();
        skrzynia = new SkrzyniaBiegow();
    }

    void włącz(){
        silnik.uruchom();
    }

    void wylacz(){
        silnik.wylacz();
    }



    }

