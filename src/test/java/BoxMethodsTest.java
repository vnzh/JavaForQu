import HWLesson3.Apple;
import HWLesson3.Box;
import HWLesson3.Orange;
import HWLesson3.UncorrectFruictBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoxMethodsTest {

    @BeforeEach
    void start() {
        BoxMethodsTest methodsTest = new BoxMethodsTest();
    }

    @Test
    void pourOutExeptionTest() {
        Box<?> boxApple = new Box<>(new Apple(), 10);
        Box<?> boxOrange = new Box<>(new Orange(), 20);
        UncorrectFruictBox thrown = Assertions.assertThrows(UncorrectFruictBox.class, () -> {
            boxOrange.pourOut(boxApple);
        });
    }

    @Test
    void pourOutNormalTest() {
        Box<?> boxApple = new Box<>(new Apple(), 10);
        Box<?> boxAppleTwo = new Box<>(new Apple(), 20);
        try {
            boxApple.pourOut(boxAppleTwo);
        } catch (UncorrectFruictBox e) {
            throw new RuntimeException(e);
        }
//        Assertions.assertEquals(new Box<>(new Apple(), 30).toString(), boxApple.toString());
        Assertions.assertEquals(new Box<>(new Apple(), 30).toString(), boxAppleTwo.toString());

    }
}
