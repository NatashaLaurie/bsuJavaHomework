package operation;

import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;


public class Operation {
    public static double findUniqDigitsNumber(double[] array) {
        final OptionalDouble num = DoubleStream.of(array)
                .filter(x -> String.valueOf(x).chars()
                        .distinct()
                        .count() == String.valueOf(x).length())
                .findAny();
        return num.orElseThrow(NoSuchElementException::new);
    }
}
