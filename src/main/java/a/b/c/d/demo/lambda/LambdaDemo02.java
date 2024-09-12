package a.b.c.d.demo.lambda;

import java.util.function.IntBinaryOperator;

public class LambdaDemo02 {

    public static void main(String[] args) {
        int c=calculateNum(1, 2, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left+right;
            }
        });
        System.out.println(c);


        int d=calculateNum(1,2,(int a, int b)->{return a+b;});
        System.out.println(d);
    }

    public static int calculateNum(int a, int b, IntBinaryOperator operator) {
        return operator.applyAsInt(a, b);
    }
}
