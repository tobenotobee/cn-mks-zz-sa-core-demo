package a.b.c.d.demo.lambda;

public class LambdaDemo01 {


    public static void main(String [] args){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程1启动了！");
            }
        }).start();

        new Thread(()->{System.out.println("新线程2启动了！");}).start();

    }
}
