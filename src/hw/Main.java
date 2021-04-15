package hw;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {


    private static final List<Person> people = List.of(
            new Person(" Anton ", "Best", 15),
            new Person("Sergey", "West",17),
            new Person("Andrei", "Brain", 21),
            new Person("Stas","Clever",27),
            new Person("Vitalii", "Brigth", 29)
    );

    public static void main(String[] args) {

        Stream<Person> stream2 = people.stream();

        people.stream().filter(person -> person.getAge() <= 21).forEach(System.out::println);
        System.out.println( );
        people.stream().sorted(Comparator.comparing(Person::getSurname))
                .sorted(Comparator.comparing(Person::getName))
                .limit(4)
                .forEach(System.out::println);
    }
}
