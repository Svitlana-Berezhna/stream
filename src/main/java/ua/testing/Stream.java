package ua.testing;

import java.util.Arrays;

/**
 * <h1>Stream</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-02
 */
public class Stream {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).average().getAsDouble());
        System.out.println(Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).min().getAsInt());
        System.out.println(Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).filter(x -> x == 0).count());
        System.out.println(Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).filter(x -> x > 0).count());
        Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).map(x -> x * 5).forEach(x -> System.out.format("%s ", x));
    }
}
