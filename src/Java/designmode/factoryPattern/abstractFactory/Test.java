package Java.designmode.factoryPattern.abstractFactory;

/**
 * Created by xieyuhui on 2018/3/30.
 * 抽象工厂模式是工厂方法模式的进一步延伸，解决工厂方法模式工厂类过多的问题
 * 在抽象工厂模式中，增加一个产品族非常方便，比如现在要增加一个IOS系统，
 * 只需要新增IOS对应的具体产品类和具体工厂类即可，符合开闭原则，但是如果要增加
 * 一个产品结构的话，比如现在要新增一个XXXController 某某控制类的话，就需要
 * 很大的改动，不符合开闭原则，这也是抽象工厂模式的缺点。
 *
 */
public class Test {

    public static void main(String[] args) {
        AndroidFactory androidFactory = new AndroidFactory();
        androidFactory.getInterfaceController().operation();
        androidFactory.getOperationController().operation();

        SymbianFactory symbianFactory = new SymbianFactory();
        symbianFactory.getInterfaceController().operation();
        symbianFactory.getOperationController().operation();
    }
}
