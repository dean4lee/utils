package cn.inslee.utils;

/**
 * 字符串工具类
 *
 * @author endy
 */
public class StringUtils {
    /**
     * 首字母转大写
     *
     * @param src
     * @return
     */
    public static String initial2Uppercase(String src) {
        if (Character.isUpperCase(src.charAt(0))) {
            return src;
        }
        return new StringBuilder().append(Character.toUpperCase(src.charAt(0)))
                .append(src.substring(1)).toString();
    }

    /**
     * 首字母转小写
     *
     * @param src
     * @return
     */
    public static String initial2LowerCase(String src) {
        if (Character.isLowerCase(src.charAt(0))) {
            return src;
        }
        return new StringBuilder().append(Character.toLowerCase(src.charAt(0)))
                .append(src.substring(1)).toString();
    }

    /**
     * 去除所有空格
     *
     * @param src
     * @return
     */
    public static String trim(String src) {
        return src.replaceAll(" ", "");
    }

    /**
     * 判断字符串去除所有空格后长度是否为0,长度为0则返回true,否则相反
     *
     * @param src
     * @return
     */
    public static boolean isEmpty(String src) {
        return trim(src).isEmpty();
    }
}
