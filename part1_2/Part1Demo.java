package part1_2;

public class Part1Demo {
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

        System.out.println("=== Все животные (" + animals.length + " шт.) ===");
        for (Animal a : animals) {
            System.out.println(a);
        }

        System.out.println("\n--- Сравнение объектов ---");
        Animal a1 = new Animal("Тест", "самец", 1);
        Animal a2 = new Animal("Тест", "самец", 1);
        System.out.println("a1.equals(a2): " + a1.equals(a2));

        Cat c1 = new Cat("Барсик", "самец", 2, 5.0, "Дворовая", "чёрный", 20.0);
        Cat c2 = new Cat("Барсик", "самец", 2, 5.0, "Дворовая", "чёрный", 20.0);
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1 == c2: " + (c1 == c2));
    }
}
