package lambda.without.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 */
public class SortListString {
    public static List<String> sort(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return list;
    }
}
