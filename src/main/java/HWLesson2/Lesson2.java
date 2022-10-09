package HWLesson2;



public class Lesson2 {

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//    должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.


    int arraySum(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        checkSize(strings);

        int summ = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    summ += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("incorerect value in[%d][%d]", i, j));
                }
            }
        }
        return summ;
    }

    void checkSize(String[][] strings) throws MyArraySizeException {
        for (String[] str : strings) {
            if (str.length != 4) {
                throw new MyArraySizeException("array size is not  4x4");
            }
        }
    }
}
