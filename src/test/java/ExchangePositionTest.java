import HWLesson3.ExchangePosition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExchangePositionTest {

    private ExchangePosition ep;

    @BeforeEach
    public void startTest() {
        ep = new ExchangePosition();
    }


    @Test
    public void printTestNull() {
//        PrintStream printStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        ep.print(null);
        String result = outputStream.toString();
        Assertions.assertEquals("Massiv T[] is empty (null)\r\n", result);
    }

    @Test
    public void printTestNormal() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        ep.print(new String[]{"1", "2", "3", "4"});
        String result = outputStream.toString();
        Assertions.assertEquals("1\r\n2\r\n3\r\n4\r\n", result);
    }

    @Test
    public void exPosNull() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        ep.exPos(null, 0, 0);
        String result = outputStream.toString();
        Assertions.assertEquals("Massiv T[] is empty (null)\r\n", result);
    }

    @Test
    public void exPosOutArrayEx() {
        Integer[] ints = {1, 2};
        ArrayIndexOutOfBoundsException thrown =
                Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    ep.exPos(ints, 0,2);
                });
    }

    @Test
    public void exPosOutNormal() {
        String[] strings = {"1", "2", "3", "4"};
        ep.exPos(strings, 0, 3);

        Assertions.assertEquals("4", strings[0]);
        Assertions.assertEquals("1", strings[3]);
    }

}
