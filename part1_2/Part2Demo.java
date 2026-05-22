package part1_2;

import java.util.ArrayList;
import java.util.List;

public class Part2Demo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Animal("Зверь1", "самец", 2),
            new Animal("Зверь2", "самка", 5),
            new Animal("Зверь3", "самец", 1),

            new Mammal("Слон", "самец", 10, 5000.0),
            new Mammal("Кит", "самка", 25, 15000.0),
            new Mammal("Собака", "самец", 3, 25.0),
            new Mammal("Лошадь", "самка", 7, 600.0),

            new Cat("Пушистик", "самка", 3, 4.5, "Персидская", "белый", 25.0),
            new Cat("Гарфилд", "самец", 5, 6.0, "Полосатый", "рыжий", 20.0),
            new Cat("Луна", "самка", 2, 3.8, "Сиамская", "рыжий", 22.0),
            new Cat("Симба", "самец", 1, 4.0, "Мейн-кун", "коричневый", 30.0),
            new Cat("Белла", "самка", 4, 4.2, "Бенгальская", "рыжий", 18.0),
            new Cat("Том", "самец", 6, 5.5, "Британская", "серый", 15.0),
            new Cat("Носок", "самка", 3, 3.5, "Сфинкс", "розовый", 12.0),

            new Fish("Немо", "самец", 2, true, 6),
            new Fish("Дори", "самка", 4, true, 8),
            new Fish("Золотая", "самец", 1, false, 4),
            new Fish("Камбала", "самец", 3, true, 5),
            new Fish("Пузырёк", "самка", 7, true, 7),
            new Fish("Ангел", "самка", 2, false, 3),
        };

        System.out.println("=== Запрос 1: Средний вес млекопитающих мужского пола ===");
        double avgWeight = averageWeightOfMaleMammals(animals);
        System.out.println("Средний вес: " + avgWeight + " кг");

        System.out.println("\n=== Запрос 2: Имена кошек женского пола рыжего окраса ===");
        List<String> orangeFemaleCats = femaleOrangeCats(animals);
        System.out.println("Найдены: " + orangeFemaleCats);

        System.out.println("\n=== Запрос 3: Самая старшая морская рыба ===");
        Fish oldestMarine = oldestMarineFish(animals);
        System.out.println(oldestMarine != null ? oldestMarine : "Не найдено");
    }

    public static double averageWeightOfMaleMammals(Animal[] animals) {
        double sum = 0;
        int count = 0;
        for (Animal a : animals) {
            if (a instanceof Mammal && a.getGender().equals("самец")) {
                sum += ((Mammal) a).getWeight();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static List<String> femaleOrangeCats(Animal[] animals) {
        List<String> names = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                if (c.getGender().equals("самка") && c.getColor().equals("рыжий")) {
                    names.add(c.getName());
                }
            }
        }
        return names;
    }

    public static Fish oldestMarineFish(Animal[] animals) {
        Fish oldest = null;
        for (Animal a : animals) {
            if (a instanceof Fish) {
                Fish f = (Fish) a;
                if (f.isMarine() && (oldest == null || f.getAge() > oldest.getAge())) {
                    oldest = f;
                }
            }
        }
        return oldest;
    }
}
