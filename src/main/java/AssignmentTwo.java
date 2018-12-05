import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

final class AssignmentTwo {
    public static List<String> pluck(List<Map<String,String>> property, String name) {

        if(property == null || name == null)
        {
            return Collections.emptyList();
        }
       return property.stream().map(map->map.get(name)).collect(Collectors.toList());

    }
}
