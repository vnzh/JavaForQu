package HWLesson3;

public class Box<T extends Fruit> {

    private T fruit;

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Box(T fruit, int amount) {
        this.fruit = fruit;
        this.amount = amount;
    }


    public void add(T t) throws UncorrectFruictBox {
        if (!(t.getClass().getName().equals(this.fruit.getClass().getName()))) {
            throw new UncorrectFruictBox("Sorts are different");
        }
        if (this.fruit == null) {
            this.fruit = t;
            this.amount += 1;
        } else {
            this.amount += 1;
        }
    }

    public float getWeight() {
        float weight = this.fruit.getWeight() * this.amount;

        return weight;
    }

    public boolean compare(Box<?> box) {
        if (this.getWeight() - box.getWeight() < 0.001) return true;
        return false;
    }

    //from this - to  box
    public void pourOut(Box<?> box) throws UncorrectFruictBox {
        if (box.fruit.getClass().getName() != null &&
                this.fruit.getClass().getName()  != null &&
               !(box.fruit.getClass().getName().equals(this.fruit.getClass().getName()))) {
            throw new UncorrectFruictBox("Sorts are different");
        }
        box.setAmount(this.getAmount() + box.getAmount());
        this.setAmount(0);
        this.fruit = null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruit=" + fruit +
                ", amount=" + amount +
                '}';
    }
}
