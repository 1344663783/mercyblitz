package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPoolNewCachedThreadPool {
    public static void main(String[] args) {
        //执行时间非常短的时候使用它
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i= 0 ; i<10 ; i++){
            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + "=============== running" ));
        }
        executorService.shutdown();
    }


//    public static void run(){
//        System.out.println(Thread.currentThread().getName() + "=============== running" );
//    }
}
