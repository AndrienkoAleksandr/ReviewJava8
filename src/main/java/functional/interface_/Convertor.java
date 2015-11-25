package functional.interface_;

/**
 */
@FunctionalInterface
public interface Convertor<F, T> {
    T convert(F f);
    //T convert(F f, Class<F> c);
}
