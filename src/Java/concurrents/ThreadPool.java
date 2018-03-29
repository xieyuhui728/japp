package Java.concurrents;

import java.util.concurrent.*;

/**
 * Created by xieyuhui on 2017/5/10.
 */
public class ThreadPool {

    public ThreadPoolExecutor getThreadPool(){
        int corePoolSize = 10;
        int maximumPoolSize = 15;
        long keepAliveTime = 2000;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new SynchronousQueue<>();
        //ThreadFactory threadFactory = new
        //RejectedExecutionHandler handler
        /**
         *
         */
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,unit,workQueue);
        return threadPoolExecutor;
    }

    static class MyTask implements Runnable {
        private int taskNum;

        public MyTask(int num) {
            this.taskNum = num;
        }

        @Override
        public void run() {
            System.out.println("正在执行task "+taskNum);
//            try {
//                Thread.currentThread().sleep(4000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task "+taskNum+"执行完毕");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<15;i++) {
            executorService.execute(new MyTask(i));
        }
        executorService.shutdown();
    }
}
