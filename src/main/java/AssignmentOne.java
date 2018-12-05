import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

final class AssignmentOne {
    private static Function<Integer, String> getParityOfInteger = number -> number % 2 == 0 ? "even" : "odd";

    public static List<String> evenOrOdd(List<Integer> numbers) {

        if (numbers == null) {
            return Collections.emptyList();
        }

        return numbers.stream()
                .filter(Objects::nonNull)
                .map(getParityOfInteger)
                .collect(Collectors.toList());


    }


}



