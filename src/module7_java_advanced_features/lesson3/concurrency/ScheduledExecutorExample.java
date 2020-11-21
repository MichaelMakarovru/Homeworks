package module7_java_advanced_features.lesson3.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorExample {

    public static void main(String[] args) {

        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();

        //Starts with delay
        //service.schedule(new MyRunnableTask(), 5, TimeUnit.SECONDS);

        service.scheduleAtFixedRate
                (new Runnable() {
                     @Override
                     public void run() {
                         try {
                             System.out.println("Start");
                             Thread.sleep(7000);
                             System.out.println("End");
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                 },
                        0, 5, TimeUnit.SECONDS);

//        service.scheduleWithFixedDelay
//                (new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            System.out.println("Start");
//                            Thread.sleep(7000);
//                            System.out.println("End");
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }, 0, 5, TimeUnit.SECONDS);

    }
}
