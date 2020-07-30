package cn.inslee.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程池工具类
 *
 * @author dean.lee
 */
public class ThreadPoolUtils {

    private static Logger log = LoggerFactory.getLogger(ThreadPoolUtils.class);

    private ThreadPoolUtils() {
    }

    /**
     * 获取一个默认线程名字的线程工厂
     *
     * @return
     */
    public static ThreadFactory getThreadFactory() {
        return getThreadFactory("thread-pool-");
    }

    /**
     * 获取一个指定线程名字
     * @param name
     * @return
     */
    public static ThreadFactory getThreadFactory(String name) {
        AtomicInteger count = new AtomicInteger(0);
        ThreadFactory factory = (r) -> {
            Thread thread = new Thread(r);
            thread.setName(name + count);
            count.addAndGet(1);
            return thread;
        };
        return factory;
    }

    /**
     * 线程池的异常处理
     *
     * @return
     */
    public static RejectedExecutionHandler getExecutionHandler() {
        RejectedExecutionHandler handler = (r, executor) -> {
            try {
                executor.getQueue().put(r);
            } catch (InterruptedException e) {
                log.debug("", e);
                throw new RuntimeException(e);
            }
        };
        return handler;
    }
}
