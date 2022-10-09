package HWLesson3;

public class Orange extends Fruit{

    private final float weight = 1.5f;
    public Orange() {


    }

    @Override
    public String toString() {
        return String.format("Orange, weight %2.2f", getWeight());
    }

    @Override
    public float getWeight() {
        return weight;
    }


}
