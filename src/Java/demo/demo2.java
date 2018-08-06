package Java.demo;

import java.math.BigDecimal;

/**
 * Created by xieyuhui on 2018/7/4.
 */
public class demo2 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("9999");
        System.out.println(a.setScale(2,BigDecimal.ROUND_DOWN));
    }
}
