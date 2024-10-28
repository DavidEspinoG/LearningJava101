import java.math.BigInteger;
import java.util.stream.LongStream;

public class BigInt {
    public static void main(String[] args) {
        printBigInt();
    }

    public static void printBigInt() {
        System.out.println(LongStream.rangeClosed(1, 40)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply));
    }
}
