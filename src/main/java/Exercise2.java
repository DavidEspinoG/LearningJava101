import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> result = filterEvenNumbers(numbers);
        System.out.println(result);
    }

    public static List<Integer> filterEvenNumbers (List<Integer> numbers) {
        return numbers.stream()
                .filter((number) -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}
