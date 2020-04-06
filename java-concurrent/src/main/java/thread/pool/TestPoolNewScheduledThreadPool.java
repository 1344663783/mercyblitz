package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestPoolNewScheduledThreadPool {
    public static void main(String[] args) {
        //延时3秒执行
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        System.out.println(System.currentTimeMillis());
        scheduledExecutorService.schedule(() -> {
            System.out.println("延迟3秒执行");
            System.out.println(System.currentTimeMillis());
        },3, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }


//    public static void run(){
//        System.out.println(Thread.currentThread().getName() + "=============== running" );
//    }
}
