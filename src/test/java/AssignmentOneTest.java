import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

final class AssignmentOneTest {
    @Test
    void evenOrOddReturnEmptyListForNullInput() {
        //setup
        List<String> actual = AssignmentOne.evenOrOdd(null);
        //Assert
        MatcherAssert.assertThat(actual.isEmpty(), is(true));
    }

    @Test
    void evenOrOddReturnsOddForOne() {
        //setup
        final List<String> actual = AssignmentOne.evenOrOdd(Arrays.asList(1));
        //Assert
        MatcherAssert.assertThat(actual, contains("odd"));
    }

    @Test
    void evenOrOddReturnEmptyListWhenGivenEmptyList() {
        //setup
        List<String> actual = AssignmentOne.evenOrOdd(Collections.emptyList());
        //Assert
        MatcherAssert.assertThat(actual.isEmpty(), is(true));
    }


    @Test
    void evenOrOddReturnsEvenForFour() {
        //setup
        final List<String> actual = AssignmentOne.evenOrOdd(Arrays.asList(4));
        //Assert
        MatcherAssert.assertThat(actual, contains("even"));


    }

    @Test
    void evenOrOddReturnsEvenForZero() {
        //setup
        final List<String> actual = AssignmentOne.evenOrOdd(Arrays.asList(0));
        //Assert
        MatcherAssert.assertThat(actual, contains("even"));

    }

    @Test
    void evenOrOddReturnsTwoWordsForTwoInput() {
        //setup
        final List<String> actual = AssignmentOne.evenOrOdd(Arrays.asList(1, 2, null));
        //Assert
        MatcherAssert.assertThat(actual, contains("odd", "even"));


    }


}
