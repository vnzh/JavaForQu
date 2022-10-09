package HWLesson2;



public class Lesson2 {

//1. �������� �����, �� ���� �������� ������� ��������� ��������� ������ �������� 4�4.
//    ��� ������ ������� ������� ������� ���������� ������� ���������� MyArraySizeException.
//2. ����� ����� ������ �������� �� ���� ��������� �������, ������������� � int � ��������������.
//    ���� � �����-�� �������� ������� �������������� �� ������� (��������, � ������ ����� ������ ��� ����� ������ �����),
//    ������ ���� ������� ���������� MyArrayDataException � ������������, � ����� ������ ������ ����� �������� ������.


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
