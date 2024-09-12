package a.b.c.d.demo.lambda;

import java.util.function.Function;

public class LambdaDemo04 {

    public static void main(String[] args) {

        typeCovert(new Function<String, Integer>() {
            @Override
            public Integer apply(String str) {
                return Integer.valueOf(str);
            }
        });
    }

    public static <R> R typeCovert(Function<String, R> function) {
        String str = "1235";
        R result = function.apply(str);
        System.out.println(result);
        return result;
    }
}
