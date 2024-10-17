import java.util.List;

public class reduce {
    public static void main(String[] args) {
        usingReduce();
    }
    public static void usingReduce() {
        List<Integer> numbers = List.of(1,2,3,4,5);
        int result = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(result);
    }
}
