import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest() {
        boolean expected = true;
        var result = phoneBook.add();
        assertEquals(expected, result);
    }

    @Test
    public void findByNumberTest() {
        String expected = "";
        var result = phoneBook.findByNumber();
        assertEquals(expected, result);
    }

    @Test
    public void findByNameTest() {
        String expected = "";
        var result = phoneBook.findByName();
        assertEquals(expected, result);
    }

    @Test
    public void printAllNamesTest() {
        String expected = "";
        var result = phoneBook.printAllNames();
        assertEquals(expected, result);
    }
}
