import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Example2 {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya", "fig");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);

        Map<String, Long> finalMap1 = new LinkedHashMap<>();

//        Sort a map by key and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByKey()).forEachOrdered(e -> finalMap1.put(e.getKey(), e.getValue()));
        System.out.println(finalMap1);

//        Sort a map by value and add to finalMap
        Map<String, Long> finalMap2 = new LinkedHashMap<>();
        result.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e -> finalMap2.put(e.getKey(),
                e.getValue()));

        System.out.println(finalMap2);
    }
}
