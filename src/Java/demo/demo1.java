package Java.demo;

/**
 * Created by xieyuhui on 2018/6/29.
 */
public class demo1 {


    public static void main(String[] args) {
        int READ = 1 << 0;

        int WRITE = 1 << 1;

        int CREATE = 1 << 2;

        int DELETE = 1 << 3;

        int ADMIN = 1 << 4;

        int ALL = READ | WRITE | CREATE | DELETE | ADMIN;

        System.out.println(DELETE);
    }
}
