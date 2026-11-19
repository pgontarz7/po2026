package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto1 {public static void main(String[] args){

    Random r = new Random();

    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i=1; i<=6;){
        int a = r.nextInt(49)+1;
        boolean jest = numbers.contains(a);

        if(jest != true){
            numbers.add(a);
            i++;
        }
        }

    System.out.println(numbers);


}
}
