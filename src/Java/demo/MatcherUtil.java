package Java.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xieyuhui on 2018/6/4.
 */
public class MatcherUtil {
    public static boolean nameMatcher(String name) {
        String regex = "^[a-zA-Z.\\u4e00-\\u9fa5]{1,50}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static boolean phoneMatcher(String phone) {
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if (phone.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            return m.matches();
        }
    }

    public static void main(String[] args) {
//        boolean b1 = nameMatcher("DQtest");
//        if (b1) {
//            System.out.println(1);
//        }else{
//            System.out.println(2);
//        }
        boolean b = phoneMatcher("18221062297");
        if (b) {
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
}
