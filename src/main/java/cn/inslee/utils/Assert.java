package cn.inslee.utils;

/**
 *
 * @author dean.lee
 */
public class Assert {

    /**
     * 对象非null则放行<p/>
     * 否则抛出IllegalArgumentException异常，异常信息为msg
     *
     * @param obj
     * @param msg
     */
    public static void notNull(Object obj, String msg) {
        if (obj == null) {
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * 对象是null则放行<p/>
     * 否则抛出IllegalArgumentException异常，异常信息为msg
     *
     * @param obj
     * @param msg
     */
    public static void isNull(Object obj, String msg) {
        if (obj != null) {
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * expression表达式是true则放行<p/>
     * 否则抛出IllegalArgumentException异常，异常信息为msg
     * @param expression
     * @param msg
     */
    public static void isTrue(boolean expression, String msg) {
        if (!expression) {
            throw new IllegalArgumentException(msg);
        }
    }
}
