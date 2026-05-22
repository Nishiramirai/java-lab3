package part1_2;

public class Cat extends Mammal {
    private String breed;
    private String color;
    private double tailLength;

    public Cat() {
        super();
        this.breed = "Неизвестна";
        this.color = "Неизвестен";
        this.tailLength = 0.0;
    }

    public Cat(String name, String gender, int age, double weight,
               String breed, String color, double tailLength) {
        super(name, gender, age, weight);
        setBreed(breed);
        setColor(color);
        setTailLength(tailLength);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException("Порода не может быть пустой");
        }
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Окрас не может быть пустым");
        }
        this.color = color;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        if (tailLength < 0) {
            throw new IllegalArgumentException("Длина хвоста не может быть отрицательной");
        }
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + getName() + ", gender=" + getGender()
                + ", age=" + getAge() + ", weight=" + getWeight()
                + ", breed=" + breed + ", color=" + color + ", tailLength=" + tailLength + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Cat cat = (Cat) obj;
        return Double.compare(cat.tailLength, tailLength) == 0
                && breed.equals(cat.breed)
                && color.equals(cat.color);
    }
}
