package HWLesson3;

import java.util.ArrayList;
import java.util.Collection;

public class BoxVarTwo<T extends Fruit> {


    private ArrayList<T> fructsList;

    public ArrayList<T> getFructsList() {
        return fructsList;
    }

    public void setFructsList(ArrayList<T> fructsList) {
        this.fructsList = fructsList;
    }

    public BoxVarTwo() {
        this.fructsList = new ArrayList<>();
    }

    public float getBoxWeight() {
        float weight = 0;
        if (fructsList == null) return weight;
        for (Fruit t : fructsList) {
            weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(BoxVarTwo<?> box) {
        if (this.getBoxWeight() - box.getBoxWeight() < 0.001) return true;
        return false;
    }

    //B  this - the  box  from///
    public void pourOut(BoxVarTwo<? super T> box) throws UncorrectFruictBox {
        if (!box.fructsList.isEmpty() &&
                !this.fructsList.isEmpty() &&
                !(box.fructsList.get(0).getClass().getName().
                        equals(this.fructsList.get(0).getClass().getName()))) {
            throw new UncorrectFruictBox("Sorts are different");
        }
        box.fructsList.addAll(this.fructsList);

        this.fructsList.clear();

    }

    public void addFruit(T t) {
        fructsList.add(t);
    }

    @Override
    public String toString() {
        return "BoxVarTwo{" +
                "fructsList=" + fructsList +
                '}';
    }


}

