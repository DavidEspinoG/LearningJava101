import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierAndUnaryOperator {
    public static void main(String[] args) {
        Supplier<String> getSalute = () -> "Hello";
        System.out.println(getSalute.get());
        UnaryOperator<Integer> duplicate = x -> x * 2;
        System.out.println(duplicate.apply(2));
    }


}
