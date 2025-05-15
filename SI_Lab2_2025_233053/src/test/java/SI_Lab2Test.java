import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class SI_Lab2Test {

    @Test
    void checkCart_EveryStatement() {
        RuntimeException ex1 = assertThrows(RuntimeException.class, () ->
                SI_Lab2.checkCart(null, "1234567890123456")
        );
        assertEquals("allItems list can't be null!", ex1.getMessage());

        List<Item> items2 = List.of(new Item(null, 1, 100, 0));
        RuntimeException ex2 = assertThrows(RuntimeException.class, () ->
                SI_Lab2.checkCart(items2, "1234567890123456")
        );
        assertEquals("Invalid item!", ex2.getMessage());

        List<Item> items3 = List.of(new Item("Item1", 5, 350, 0.1));
        double result3 = SI_Lab2.checkCart(items3, "1234567890123456");
        assertEquals(1545, result3);

        List<Item> items4 = List.of(new Item("Item2", 2, 100, 0));
        double result4 = SI_Lab2.checkCart(items4, "1234567890123456");
        assertEquals(200, result4);

        List<Item> items5 = List.of(new Item("Item3", 1, 100, 0));
        RuntimeException ex5 = assertThrows(RuntimeException.class, () ->
                SI_Lab2.checkCart(items5, "12345678ABCD1234")
        );
        assertEquals("Invalid character in card number!", ex5.getMessage());
    }

    @Test
    void checkCart_MultipleCondition() {
        String validCard = "1234567890123456";

        List<Item> items1 = List.of(new Item("P1", 1, 350, 0));
        double result1 = SI_Lab2.checkCart(items1, validCard);
        assertEquals(320, result1);

        List<Item> items2 = List.of(new Item("P2", 1, 100, 0.1));
        double result2 = SI_Lab2.checkCart(items2, validCard);
        assertEquals(60, result2);

        List<Item> items3 = List.of(new Item("P3", 11, 10, 0));
        double result3 = SI_Lab2.checkCart(items3, validCard);
        assertEquals(80, result3);

        List<Item> items4 = List.of(new Item("P4", 1, 100, 0));
        double result4 = SI_Lab2.checkCart(items4, validCard);
        assertEquals(100, result4);
    }

}