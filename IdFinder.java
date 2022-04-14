import java.util.ArrayList;
import java.util.List;

public class IdFinder {

    public static List<String> findIds(String string, String[] array) {
        List<String> input = readString(string);
        List<String> output = new ArrayList<>();
        for (String s : array) {
            List<String> ids = readString(s);
            if (ids.containsAll(input)) {
                output.addAll(ids);
            }
        }
        return output;
    }

    private static List<String> readString(String string) {
        List<String> ids = new ArrayList<>();
        int index = 0;
        while (string.indexOf("T", index) != -1) {
            int indexOfT = string.indexOf("T", index);
            String id = string.substring(indexOfT, indexOfT + 5);
            ids.add(id);
            index = indexOfT + 5;
        }
        return ids;
    }
}
