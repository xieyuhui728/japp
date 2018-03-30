package Java.designmode.singletonPattern;

/**
 * Created by xieyuhui on 2018/3/30.
 * 饿汉式的单例模式
 * 饿汉式可确保多线程下单例类的唯一性
 * 饿汉式在类被加载的适合就将自己实例化好了，
 * 所以在调用速度和反应时间上来讲，饿汉式比懒汉式更快
 * 同时也无需考虑多线程的问题
 *
 */
public class EagerSingleton {

    private EagerSingleton() {
    }

    //在类加载时，静态成员就会被初始化，此时类的私有构造器被调用，单例类的唯一实例将被创建
    private static EagerSingleton eagerLoadBalancer = new EagerSingleton();

    private static EagerSingleton getInstance() {
        return eagerLoadBalancer;
    }
}
