package OldData.OldMaterial.java8.map;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapInStream {
    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][] {
                { "Hello", "World" },
                { "John", "Doe" },
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        Map<Integer, String> customMap = Stream.of(new Object[][]{
                {1,"test"}
        }).collect(Collectors.toMap(data->(Integer) data[0], data -> (String) data[1]));

    }
}
