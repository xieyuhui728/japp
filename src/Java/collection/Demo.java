package Java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xieyuhui on 2017/7/3.
 */
public class Demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","A");
        map.put("2","A");
        System.out.println(map.get("2"));
    }
}
