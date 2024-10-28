import java.util.stream.IntStream;

public class MyIntStream {
    public static void main(String[] args) {
        // generateIntStream();
        intStreamToList();
    }

    public static void generateIntStream() {
        IntStream
                .iterate(2, n -> n + 2 )
                .limit(10)
                .forEachOrdered(System.out::println);
    }
    public static void intStreamToList() {
        IntStream
                .iterate(2, n -> n + 2 )
                .limit(10)
                .boxed()
                .toList()
                .forEach(System.out::println);
    }
}
