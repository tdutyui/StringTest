import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ListToCsvConverter {

    public static void writeToCsvFile(List<String> ids) {
        String name = ids.get(0) + ids.get(1) + ids.get(2);
        try (FileWriter writer = new FileWriter(name + ".csv")) {
            writer.write(convertToCommaSeparated(ids));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertToCommaSeparated(List<String> ids) {
        return String.join(",", ids);
    }
}
