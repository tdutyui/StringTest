import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IdFinderTest {

    @Test
    void returnCorrectIds() {
        String string = "T1004, , T1005, ";
        String[] array = {"T1005, ,T1004,", " T1008, ,T1004, ,T1005, ", "T1009, ,T1005, "};
        List<String> ids = Arrays.asList("T1005", "T1004", "T1008", "T1004", "T1005");
        assertTrue(IdFinder.findIds(string, array).containsAll(ids));
    }
}