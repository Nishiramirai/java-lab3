package part1_2;

public class Mammal extends Animal {
    private double weight;

    public Mammal() {
        super();
        this.weight = 1.0;
    }

    public Mammal(String name, String gender, int age, double weight) {
        super(name, gender, age);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть положительным");
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + getName() + ", gender=" + getGender()
                + ", age=" + getAge() + ", weight=" + weight + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Mammal mammal = (Mammal) obj;
        return Double.compare(mammal.weight, weight) == 0;
    }
}
