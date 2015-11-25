package lambda.without.lambda;

import java.util.Arrays;
import java.util.List;

/**
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("\n-- Without Lambda Expressions: Sort List --");
        List<String> st = Arrays.asList("Steve", "Alex", "Jim", "Bob");
        System.out.println("Before sort: " + st);
        System.out.println("After sort: " + SortListString.sort(st));
    }
}
