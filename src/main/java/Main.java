import java.util.List;

public class Main {

    public static void main(String[] args) {

        String string = "T1004, , T1005, ";
        //String string = ",T1006,";
        String[] array = {"T1005, ,T1004,", " T1008, ,T1004, ,T1005, ", "T1009, ,T1005, "};
        //String[] array = {"T1004, ,T1006, T1007,", " T1006, ,T1001, ,", "T1009, ,T1005, "};
        List<String> ids = IdFinder.findIds(string, array);
        ids.forEach(System.out::println);
        ListToCsvConverter.writeToCsvFile(ids);
    }
}
