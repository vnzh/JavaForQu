package HWLesson3;



public class ExchangePosition {


    public void exPos(Object[] obj, int first, int second) {
        if (obj == null) {
            System.out.println("Massiv T[] is empty (null)");
            return;
        }
        Object aux = obj[first];
        obj[first] = obj[second];
        obj[second] = aux;

    }

    public void print(Object[]  objects) {
        if (objects == null) {
            System.out.println("Massiv T[] is empty (null)");
            return;
        }
        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }

}
