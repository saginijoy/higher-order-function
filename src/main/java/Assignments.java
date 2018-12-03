
import java.util.List;

import java.util.function.Predicate;
import java.util.stream.Collectors;

final class Assignments {


    public static List<String> slowFoxes(List<String> actualString) {

            return actualString.stream()
                    //.filter((name->!"Swift Fox".equals(name)))
                    .filter(Predicate.isEqual("Swift Fox").negate())
                    .collect(Collectors.toList());
    }

    public static List<Person> adults(List<Person> persons) {

            return persons.stream()
                    .filter(person -> person.getAge()>=18)
                    .collect(Collectors.toList());
    }

}
