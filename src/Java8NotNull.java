import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Java8NotNull {

    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

//      way 1:
        List<String> result1 = language.filter(x -> x!=null).collect(Collectors.toList());

        result1.forEach(System.out::println);

//        way 2
        List<String> result2 =  language.filter(Objects::isNull).collect(Collectors.toList());

        result2.forEach(System.out::println);
    }

}
