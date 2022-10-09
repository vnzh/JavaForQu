package HWLesson3;

public class main {

    public static void main(String[] args) {


        String[] strings = {"1", "2", "3", "4"};
        Fruit[] fruits = {new Apple(), new Apple(),
                new Orange(), new Orange()};
//        Integer[] integers = {1, 2, 3, 4};
        Integer[] integers = null;

        ExchangePosition position = new ExchangePosition();
        position.exPos(strings, 0, 3);
        position.print(strings);
        position.exPos(fruits, 0, 3);
        position.print(fruits);
        position.exPos(integers, 0, 3);
        position.print(integers);

        Box<Apple> appleBox = new Box<>(new Apple(), 15);
        System.out.println(appleBox.getWeight());
        Box<Orange> orangeBox = new Box<>(new Orange(), 10);
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

//        try {
//            appleBox.pourOut(orangeBox);
//        } catch (UncorrectFruictBox e) {
//            e.printStackTrace();
//        }


        Box<?> fruitBox = new Box<>(new Orange(), 20);
        System.out.println(orangeBox);
        System.out.println(fruitBox);
        try {
            orangeBox.pourOut(fruitBox);
        } catch (UncorrectFruictBox e) {
            e.printStackTrace();
        }

        System.out.println(orangeBox);
        System.out.println(fruitBox);
        try {
            orangeBox.add(new Orange());
        } catch (UncorrectFruictBox e) {
            throw new RuntimeException(e);
        }
        System.out.println(orangeBox);

        BoxVarTwo<Apple> boxApple = new BoxVarTwo<>();
        BoxVarTwo<Apple> boxAppleTwo = new BoxVarTwo<>();
        System.out.println(boxAppleTwo);
        boxAppleTwo.addFruit(new Apple());
        System.out.println(boxAppleTwo);
        boxAppleTwo.addFruit(new Apple());
        System.out.println(boxAppleTwo);
        try {
            boxAppleTwo.pourOut(boxApple);
        } catch (UncorrectFruictBox e) {
            throw new RuntimeException(e);
        }
        System.out.println(boxApple);


    }


}
