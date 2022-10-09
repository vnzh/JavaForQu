package HWLesson3;

public class Apple extends Fruit {

    private final float weight = 1.0f;

    public Apple() {

    }


    @Override
    public String toString() {
        return String.format("Apple, weight %2.2f", getWeight());
    }

    @Override
    public float getWeight() {
        return weight;
    }


}

