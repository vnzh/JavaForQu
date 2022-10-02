package HWLesson2;

public class Main {
    public static void main(String[] args) {
//        String[] strings = new String[] {"1", "1", "1", "1"};
//        String[] strings = new String[]{"1", "1", "1"};
                String[][] strings = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
//        String[][] strings = {{"[", "2", "3", "4"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"}};
//                String[][] strings = {{"[", "2", "3", "4"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3",},
//                {"1", "2", "3", "4"}};
//        String[][] strings = {{"[", "2", "3", "4", "5"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3",},
//                {"1", "2", "3", "4"}};

        try {
            System.out.println(new Lesson2().arraySum(strings));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();

        }
    }
}
