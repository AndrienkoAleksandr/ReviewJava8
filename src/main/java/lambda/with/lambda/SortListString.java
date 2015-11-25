package lambda.with.lambda;

import java.util.Collections;
import java.util.List;

/**
 */
public class SortListString {
    public static List<String> sort(List<String> list) {
        Collections.sort(list, (a, b)-> {return a.compareTo(b);});
        return list;
    }
}
