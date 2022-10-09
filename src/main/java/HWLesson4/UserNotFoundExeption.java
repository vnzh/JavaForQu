package HWLesson4;

public class UserNotFoundExeption extends Throwable {
    public UserNotFoundExeption(String message) {
        super(message);
    }
}
