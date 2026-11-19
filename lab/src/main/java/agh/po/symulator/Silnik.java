package agh.po.symulator;

public class Silnik extends Komponent {

    int maxObroty;
    int obroty;

    public int get_maxObroty(){
        return maxObroty;
    }

    public int get_obroty(){
        return obroty;
    }

    public void uruchom(){
        obroty = 800;
        System.out.println("Silnik uruchomiony, obroty: " + obroty);
    }

    public void wylacz(){
        obroty = 0;
        System.out.println("Silnik wylaczony");
    }
}
