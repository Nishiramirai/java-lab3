package part1_2;

public class Animal {
    private String name;
    private String gender;
    private int age;

    public Animal() {
        this.name = "Неизвестно";
        this.gender = "самец";
        this.age = 0;
    }

    public Animal(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || (!gender.equalsIgnoreCase("самец") && !gender.equalsIgnoreCase("самка"))) {
            throw new IllegalArgumentException("Пол должен быть 'самец' или 'самка'");
        }
        this.gender = gender.toLowerCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", gender=" + gender + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age && name.equals(animal.name) && gender.equals(animal.gender);
    }
}
