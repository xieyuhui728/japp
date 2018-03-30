package Java.designmode.singletonPattern;

/**
 * Created by xieyuhui on 2018/3/30.
 * 饿汉式不能实现延迟加载，不管用不用都将占用内存。
 * 懒汉式需要多线程控制繁琐，且性能受影响。
 * IoDH：Initialization Demand Holder技术
 * IoDH能克服两种单例模式的缺点，将两者的优点合二为一。
 * 该方式是Java语言实现单例模式的最好方式。
 */
public class IoDHSingleton {

    private IoDHSingleton() {

    }

    /**
     * 对象在静态内部类中实例化。
     * 静态单例对象没有作为IoDHSingleton类的成员变量直接初始化，因此加载类不会实例化对象。
     * 第一次调用getInstance()时将加载内部类HolderClass，内部类中定义了static类型的变量instance，
     * 此时会首先初始化这个成员变量，jvm保证其线程安全，确保成员变量只能被初始化一次。
     * getInstance()方法没有任何锁定，性能也不会受影响。
     *
     */

    private static class HolderClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton s1, s2;
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        if (s1 == s2) {
            System.out.println(true);
        }
    }
}
