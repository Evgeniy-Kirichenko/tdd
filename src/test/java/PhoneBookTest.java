import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest() {
        boolean expected = true;
        var result = phoneBook.add();
        assertEquals(expected,result);
    }

    @Test
    public void findByNumber() {
        String expected = "";
        var result = phoneBook.findByNumber();
        assertEquals(expected,result);
    }
}
