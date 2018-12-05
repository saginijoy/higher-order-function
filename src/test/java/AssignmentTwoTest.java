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
        //setup
        List<String> actual = AssignmentTwo.pluck(Arrays.asList(map), "foo");
        //Assert
        MatcherAssert.assertThat(actual, contains("bar"));

    }
    @Test
    void pluckReturnsOneValueForOneDifferentInput(){


        Map<String, String> map = new HashMap<String, String>();

        map.put("foo" , "ski");
       //setup
        List<String> actual = AssignmentTwo.pluck(Arrays.asList(map), "foo");
        //Assert
        MatcherAssert.assertThat(actual, contains("ski"));

    }
    @Test
    void pluckReturnsTwoValueForTwoInput(){


        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("foo" , "ski");
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("foo", "bar");
        //setup
        List<String> actual = AssignmentTwo.pluck(Arrays.asList(map1,map2), "foo");
        //Assert
        MatcherAssert.assertThat(actual, contains("ski","bar"));
        MatcherAssert.assertThat(actual.size(), is(2));

    }
}
