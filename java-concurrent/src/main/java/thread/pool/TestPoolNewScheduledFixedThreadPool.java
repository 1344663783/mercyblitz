package thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestPoolNewScheduledFixedThreadPool {
    public static void main(String[] args) {
        //延时一秒执行，并且每3秒执行一次
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        System.out.println(System.currentTimeMillis());
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("延时一秒执行，并且每3秒执行一次");
            System.out.println(System.currentTimeMillis());
        },1,3, TimeUnit.SECONDS);

//        scheduledExecutorService.shutdown();
    }


//    public static void run(){
//        System.out.println(Thread.currentThread().getName() + "=============== running" );
//    }
}
