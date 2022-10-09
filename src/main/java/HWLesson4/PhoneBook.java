package HWLesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook(HashMap<String, ArrayList<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook() {
        this.phoneBook = new HashMap<String, ArrayList<String>>();
    }

    public PhoneBook(String surname, String phoneNumber) {
        this.phoneBook = new HashMap<String, ArrayList<String>>();
        add(surname, phoneNumber);
    }


    public void add(String surname, String phoneNumber) {
        ArrayList<String> value = new ArrayList<>();
        if (phoneBook.containsKey(surname)) {
            value = phoneBook.get(surname);
            value.add(phoneNumber);
        } else {
            value.add(phoneNumber);
        }
        phoneBook.put(surname, value);
    }

    public ArrayList<String> get(String surname) throws UserNotFoundExeption {

        if (phoneBook.containsKey(surname)) return phoneBook.get(surname);
        throw new UserNotFoundExeption("User not found");
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
