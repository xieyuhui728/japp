package Java.designmode.singletonPattern;

/**
 * Created by xieyuhui on 2018/3/30.
 */
public class Test {
    public static void main(String[] args) {
        Singleton loadBalancer1, loadBalancer2, loadBalancer3, loadBalancer4;
        loadBalancer1 = Singleton.getInstance();
        loadBalancer2 = Singleton.getInstance();
        loadBalancer3 = Singleton.getInstance();
        loadBalancer4 = Singleton.getInstance();
        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4) {
            System.out.println("简单的单例模式");
        }

    }
}
