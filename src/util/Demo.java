package util;

import java.util.Random;

/**
 * @Author psq
 * @Date 2021/6/7
 * @Desc
 */
public class Demo {
    /**
     * 获取指定长度的随机字符串
     * @param num
     * @return
     */
    public static String getRandomNum(int num) {
        //随机字符的范围
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXWZabcdefghijklmnopqrstuvwxyz1234567890$#*";
        Random random;
        StringBuilder rendomStr = new StringBuilder();
        for (int i = 0; i < num; i++) {
            random = new Random();
            int index = random.nextInt(65);
            rendomStr.append(str.charAt(index));
        }
        return rendomStr.toString();
    }

    public static void main(String[] args) {
        String randomNum = getRandomNum(6);
        System.out.println(randomNum);
    }

}
