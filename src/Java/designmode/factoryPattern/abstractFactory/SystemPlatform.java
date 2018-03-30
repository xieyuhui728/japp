package Java.designmode.factoryPattern.abstractFactory;

/**
 * Created by xieyuhui on 2018/3/30.
 * 产品族的抽象工厂类
 */
public interface SystemPlatform {

    InterfaceController getInterfaceController();

    OperationController getOperationController();
}
