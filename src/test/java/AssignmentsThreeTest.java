import javafx.util.Pair;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.Matchers.is;

final class AssignmentsThreeTest {
    @Test
    void pairToMapReturnEmptyMapForNull() {
        //setup
        Map<String, String> actual = AssignmentThree.pairToMap(null);
        //Assert
        MatcherAssert.assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void pairToMapReturnOneMapForOneInput() {
        //setup
        Pair<String, String> pair = new Pair("firstProp", "firstVal");

        Map<String, String> actual = AssignmentThree.pairToMap(pair);
        //Assert
        MatcherAssert.assertThat(actual.get("firstProp"), is("firstVal"));

    }

    @Test
    void pairToMapReturnOneMapForOneDifferentInput() {
        //setup
        Pair<String, String> pair = new Pair("secondProp", "secondVal");

        Map<String, String> actual = AssignmentThree.pairToMap(pair);
        //Assert
        MatcherAssert.assertThat(actual.get("secondProp"), is("secondVal"));

    }

    @Test
    void pairToMapReturnMapForTwotInput() {
        //setup
        Pair<String, String> pair1 = new Pair("secondProp", "secondVal");
        Pair<String, String> pair2 = new Pair("firstProp", "firstVal");
//exercise
        Map<String, String> actual = AssignmentThree.pairToMap(pair1, pair2);
        //Assert
        MatcherAssert.assertThat(actual.size(), is(2));
        MatcherAssert.assertThat(actual.get("secondProp"), is("secondVal"));
        MatcherAssert.assertThat(actual.get("firstProp"), is("firstVal"));

    }
}
