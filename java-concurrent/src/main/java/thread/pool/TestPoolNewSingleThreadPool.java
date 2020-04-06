package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPoolNewSingleThreadPool {
    public static void main(String[] args) {
        //只有一个线程数
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i= 0 ; i<10 ; i++){
            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + "=============== running" ));
        }
        executorService.shutdown();
    }


//    public static void run(){
//        System.out.println(Thread.currentThread().getName() + "=============== running" );
//    }
}
