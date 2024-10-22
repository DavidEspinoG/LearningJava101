import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviorParametrization2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3);
        List<Integer> result = manipulate(numbers, x-> x * x);
        System.out.println(result);

    }

    public static List<Integer> manipulate(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
