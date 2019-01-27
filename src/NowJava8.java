import entity.Person;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NowJava8 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream().filter(x -> "jack".equals(x.getName())).findAny().orElse(null);

        System.out.println(result1.getAge());

        Person result2 = persons.stream().filter(x -> "mkyong".equals(x.getName())).findAny().orElse(null);

        System.out.println(result2.getAge());

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }

}
