package a.b.c.d.demo.lambda;

import java.util.function.IntPredicate;

public class LambdaDemo03 {

    public static void main(String[] args) {
        printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });

        printNum((int value) -> {
            return value % 2 == 0;
        });

        //参数类型可以省略
        printNum((value) -> {return value % 2 == 0;});

        //方法体只有一句代码时，大括号&return&代码的分号可以省略
        printNum((value) -> value % 2 == 0);

        //方法只有一个参数时，小括号可以省略
        printNum(value-> value % 2 == 0);
    }

    public static void printNum(IntPredicate intPredicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            if (intPredicate.test(i)) System.out.println(i);
        }
    }


}
