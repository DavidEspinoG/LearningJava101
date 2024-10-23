import java.util.function.BiPredicate;

public class BiPredicateExercise {
    public static void main(String[] args) {
        BiPredicate<Integer, String> validate = (integer, string) -> {
            return integer < 10 && string.contains("java");
        };
        System.out.println(validate.test(8, "Learning jao"));
    }
}
