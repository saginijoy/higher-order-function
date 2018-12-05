import javafx.util.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

final class AssignmentThree {
    static Map<String, String> pairToMap(Pair... pairs) {
        if (pairs == null) {
            return Collections.emptyMap();
        }

        return Arrays.stream(pairs)
                .collect(Collectors
                        .toMap(pair -> pair.getKey().toString(), pair -> pair.getValue().toString()));

    }
}
