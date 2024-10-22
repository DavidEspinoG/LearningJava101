import java.util.List;
import java.util.function.Predicate;

public class BehaviorParametrization {
    public static void main(String[] args) {
      List<Integer> numbers = List.of(1,2,3,4);
      System.out.println("Even numbers");
      filterAndPrint(numbers, x -> x % 2 == 0);
      System.out.println("Odd numbers");
      filterAndPrint(numbers, x -> x % 2 != 0);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);

    }
}
