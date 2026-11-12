package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    animals[i] = new Parrot("Papuga" + i);
                    break;
                case 1:
                    animals[i] = new Dog("Pies" + i);
                    break;
                case 2:
                    animals[i] = new Snake("Waz" + i);
                    break;
            }
        }
    }

    public int sumLegs() {
        int sum = 0;
        for (int i = 0; i < animals.length; i++) {
            sum += animals[i].getLegs();
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillRandom();
        System.out.println("Suma nog: " + zoo.sumLegs());
    }
}
