import org.example.Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTest {

    @Test
    void testAddStrings() {
        assertEquals("FooBar", Strings.addWords(Strings.sendFoo(), Strings.sendBar()));
    }
}
