package functional.interface_;

/**
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("\n-- Functional Interface Using --");
        Convertor<String, Integer> convertor = (f) -> Integer.valueOf(f);
        Integer convertAge = convertor.convert("22");
        System.out.println("Age Convert: " + convertAge);
        System.out.println("Type: " + convertAge.getClass().getTypeName());
    }
}
