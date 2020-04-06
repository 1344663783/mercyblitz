package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPoolNewFixedThreadPool {
    public static void main(String[] args) {
        //固定线程个数
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i= 0 ; i<10 ; i++){
            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + "=============== running" ));
        }
        executorService.shutdown();
    }


//    public static void run(){
//        System.out.println(Thread.currentThread().getName() + "=============== running" );
//    }
}
