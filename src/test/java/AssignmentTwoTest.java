import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

final class AssignmentTwoTest {
    @Test
    void pluckReturnEmptyListForNull(){
        //setup
        List<String> actual = AssignmentTwo.pluck(null, null);
        //Assert
        MatcherAssert.assertThat(actual.isEmpty(), is(true));

    }


    @Test
    void pluckReturnsOneValueForOneInput(){


        Map<String, String> map = new HashMap<String, String>();

        map.put("foo" , "bar");
       // map.put("foo", "ski");
        //setup
        List<String> actual = AssignmentTwo.pluck(Arrays.asList(map), "foo");
        //Assert
        MatcherAssert.assertThat(actual, contains("bar"));

    }

}
