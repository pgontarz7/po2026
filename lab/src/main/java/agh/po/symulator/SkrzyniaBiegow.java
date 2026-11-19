package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {

    int aktualnyBieg;
    int iloscBiegow;

    public SkrzyniaBiegow(){};

    public SkrzyniaBiegow(int aktualnyBieg, int iloscBiegow){
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;

    }

    void zwiekszBieg(int bieg){
        if(bieg!=0){
            bieg++;
        }
    }

    void zmniejszBieg(int bieg){
        if(bieg!=0){
            bieg--;
        }
    }



}
