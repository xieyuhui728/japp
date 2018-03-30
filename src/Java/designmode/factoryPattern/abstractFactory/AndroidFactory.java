package Java.designmode.factoryPattern.abstractFactory;

/**
 * Created by xieyuhui on 2018/3/30.
 * 安卓产品族的工厂类，用于生产属于安卓产品族的具体产品
 */
public class AndroidFactory implements SystemPlatform {
    @Override
    public InterfaceController getInterfaceController() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController getOperationController() {
        return new AndroidOperationController();
    }
}
