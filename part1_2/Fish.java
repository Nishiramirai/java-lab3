package part1_2;

public class Fish extends Animal {
    private boolean marine;
    private int finCount;

    public Fish() {
        super();
        this.marine = true;
        this.finCount = 2;
    }

    public Fish(String name, String gender, int age, boolean marine, int finCount) {
        super(name, gender, age);
        setMarine(marine);
        setFinCount(finCount);
    }

    public boolean isMarine() {
        return marine;
    }

    public void setMarine(boolean marine) {
        this.marine = marine;
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        if (finCount <= 0) {
            throw new IllegalArgumentException("Количество плавников должно быть положительным");
        }
        this.finCount = finCount;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + getName() + ", gender=" + getGender()
                + ", age=" + getAge() + ", marine=" + marine + ", finCount=" + finCount + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Fish fish = (Fish) obj;
        return marine == fish.marine && finCount == fish.finCount;
    }
}
