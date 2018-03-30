package Java.designmode.singletonPattern;

/**
 * Created by xieyuhui on 2018/3/30.
 * 简单的单例模式
 * new Singleton()可能需要大量的时间，
 * 多线程情况下
 * 第一个线程还未实例化成功，第二个线程就进入getInstance()。
 * 就会出现执行多次 new Singleton()的情况，
 * 违背了单例模式的初衷
 */
public class Singleton {

    //step1：防止被外部实例化，把构成器设置成私有
    private Singleton() {

    }

    //step2: 私有静态的成员变量，唯一的实例
    private static Singleton loadBalancer = null;

    //step3:让外部可以访问类内部的唯一实例
    public static Singleton getInstance() {
        if (loadBalancer == null) {
            Singleton.loadBalancer = new Singleton();
        }
        return loadBalancer;
    }
}
