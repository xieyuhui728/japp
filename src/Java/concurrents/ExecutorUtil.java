package Java.concurrents;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xieyuhui on 2018/7/31.
 */
public class ExecutorUtil {

    /**
     * newFixedThreadPool 创建一个固定长度的线程池，每当提交一个任务时就创建一个线程，
     * 直到达到线程的nThreads数量，如果某个线程由于发生Exception而结束，那么线程池会补充一个新的线程。
     * @return
     */
    public ExecutorService newFixedThreadPool() {
        return Executors.newFixedThreadPool(100);
    }


    /**
     * newSingleThreadExecutor 单线程的Executor，它创建单个worker thread 来执行任务，
     * 如果这个线程异常结束，会创建另一个线程来替代。
     */
    public ExecutorService newSingleThreadExecutor(){
        return Executors.newSingleThreadExecutor();
    }

    /**
     * newCachedThreadPool 创建一个可缓存的线程池，如果线程池的当前线程数超过处理需求时，
     * 那么将回收空闲的线程，当需求增加时，则添加新的线程，线程池的数量不存在限制。
     */
    public ExecutorService newCachedThreadPool(){
        return Executors.newCachedThreadPool();
    }

    /**
     * newScheduledThreadPool 创建一个固定长度的线程池，而且以延迟或定时的方法来执行任务。
     * 类似于Timer
     */
    public ExecutorService newScheduledThreadPool(){
        return Executors.newScheduledThreadPool(100);
    }
}
