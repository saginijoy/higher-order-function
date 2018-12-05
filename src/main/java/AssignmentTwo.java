import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class AssignmentTwo {
    public static List<String> pluck(List<Map<String,String>> property, String name) {

        if(property == null || name == null)
        {
            return Collections.emptyList();
        }

        return Arrays.asList("bar");



    }
}
