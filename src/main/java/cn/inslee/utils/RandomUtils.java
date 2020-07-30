package cn.inslee.utils;

/**
 * 生成随机字符串的工具类
 *
 * @author dean.lee
 */
public class RandomUtils {

    protected static char[] chars = {
            'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z',
            '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9'
    };
    protected static char[] nums = {
            '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9'
    };

    /**
     * 在chars[]范围内，生成一个count位数的随机数
     * @param count
     * @param chars
     * @return
     */
    public static String random(int count, char[] chars){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(chars[(int) (Math.random() * chars.length)]);
        }
        return result.toString();
    }

    /**
     * 生成一个count位数的数字随机字符串
     * @param count
     * @return
     */
    public static String randomInt(int count){
        return random(count, nums);
    }

    /**
     * 生成一个count位数的字母+数字的随机字符串
     * @param count
     * @return
     */
    public static String randomChars(int count){
        return random(count, chars);
    }
}
