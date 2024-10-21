import java.util.List;
import java.util.function.BinaryOperator;

public class Exercise3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sumTwoNumbers = new BinaryOperator<Integer>() {
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        List<Integer> numbers = List.of(1,2);
        Integer result = numbers.stream()
                .reduce(0, sumTwoNumbers);
        System.out.println(result);

    };
}
