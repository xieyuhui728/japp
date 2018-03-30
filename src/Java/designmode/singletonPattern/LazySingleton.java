package Java.designmode.singletonPattern;

/**
 * Created by xieyuhui on 2018/3/30.
 * 懒汉式的单例模式
 * 懒汉式在简单的单例模式中使用synchronized关键字解决多线程问题
 * 双重检查锁定需要用volatile修饰静态成员，但是volatile会屏蔽
 * jvm所做的一切优化，可能会导致代码执行效率底下。
 * 懒汉式只有在第一次使用时才创建对象，因此从资源使用角度上来讲要好于饿汉式
 */
public class LazySingleton {

    private LazySingleton() {

    }

    private volatile static LazySingleton lazyLoadBalancer = null;

    //双重检查锁定
    public static LazySingleton getInstance() {
        if (lazyLoadBalancer == null) {
            synchronized (LazySingleton.class) {
                if (lazyLoadBalancer == null) {
                    LazySingleton.lazyLoadBalancer = new LazySingleton();
                }
            }
        }
        return lazyLoadBalancer;
    }
}
