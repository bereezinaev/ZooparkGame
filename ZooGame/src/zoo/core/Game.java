package zoo.core;

import java.util.ArrayList;
import java.util.List;
import zoo.animals.Animal;
import zoo.animals.Soundable;
import zoo.animals.Lion;
import zoo.animals.Penguin;

public class Game {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Симба"));
        animals.add(new Penguin("Пингу"));

        // полиморфизм: работаем через абстрактный тип
        for (Animal a : animals) {
            System.out.println(a.getInfo());

            // полиморфизм через интерфейс
            if (a instanceof Soundable s) {
                System.out.println(s.makeSound());
            }
        }
    }
}