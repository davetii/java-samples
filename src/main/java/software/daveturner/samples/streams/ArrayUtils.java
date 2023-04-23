package software.daveturner.samples.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayUtils {

    public static List<String> getDistinct(List<String> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> formatPlayerNamesMapExample(List<Map<String, String>> data) {
        Function<Map<String, String>, String> f = (t) -> t.get("firstName") + " " + t.get("lastName") + ", " + t.get("position");
        return data.stream().map(f).collect(Collectors.toList());
    }








}
