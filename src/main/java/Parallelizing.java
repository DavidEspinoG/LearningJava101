import java.util.stream.LongStream;

public class Parallelizing {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        //553
        System.out.println(LongStream.range(0, 1000000000).parallel().sum());
        System.out.println(System.currentTimeMillis() - time);
        // 124
    }



}
