package agh.po.lab3;

public class CodingBat {
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i==-1) return false;

        if(i+1 >= str.length ())
            return false;
        return str.substring(i+1, i+2).equals("x");
    }

    int countXX(String str) {
        int countr=0;

        for(int j=0; j<str.length()-1; j++){
            if (str.substring(j, j+2).equals("xx"))
                countr++;
        }
        return countr;

    }




    public static void main(String[] args){

        CodingBat codingBat = new CodingBat();
        //doubleX
        System.out.println(codingBat.doubleX("bxxxx"));
        System.out.println(codingBat.doubleX("bxxfx"));
        System.out.println(codingBat.doubleX("aaaa"));

        //countXX
        System.out.println(codingBat.countXX("xxxx"));
        System.out.println(codingBat.countXX("xx"));
        System.out.println(codingBat.countXX("asdf"));

    }


}




