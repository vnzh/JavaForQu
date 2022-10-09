package HWLesson4;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"my", "name", "David", "in", "small", "village", "near",
                "Chicago", "my", "cousin", "married", "my", "father", "and", "her",
                "father", "are", "twins", "we", "are", "very", "busy", "my",
                "uncle", "friend", "is" };
        System.out.println(new Lesson4PointOne().uniqueString(strings));
        System.out.println(new Lesson4PointOne().uniqueCounter(strings));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Black", "123456");
        phoneBook.add("White", "987456");
        phoneBook.add("Black", "456987");
        System.out.println(phoneBook);
        try {
            System.out.println(phoneBook.get("Black"));
        } catch (UserNotFoundExeption e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(phoneBook.get("Apple"));
        } catch (UserNotFoundExeption e) {
            throw new RuntimeException(e);
        }
    }
}

