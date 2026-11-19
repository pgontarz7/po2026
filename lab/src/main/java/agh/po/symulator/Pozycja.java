package agh.po.symulator;

public class Pozycja {

    double x;
    double y;

    void aktualizuj_pozycje(double deltaX, double deltaY){

        this.x = deltaX;
        this.y = deltaY;

        System.out.println("pozycja X:" + deltaX);
        System.out.println("pozycja Y:" + deltaY);

    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }







}


