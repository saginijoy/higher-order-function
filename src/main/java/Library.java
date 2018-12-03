import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {

    final List<String> words = Arrays.asList(
            "the",
            "shortest",
            "shorter",
            "Fred",
            "longer",
            "longest"
    );

    final List<String> longWords = words
            .stream()
            .filter(Library::removeShortWords)
            .collect(Collectors.toList());

    final List<String> shortWords = words
            .stream()
            .filter(Library::removeShortWords)
            .collect(Collectors.toList());

    static Predicate<String> wordsShorterThan(final int minLength){
        return testString->Optional.ofNullable(testString).orElse("")
                .length()>minLength;
    }


    final Predicate<String> shorterThanThree = wordsShorterThan(3);

    public static void main(String... args) {

    }


    public static boolean removeShortWords(String testString) {

        return Optional
                .ofNullable(testString)
                .orElse("")
                .length() > 4;
    }
}
