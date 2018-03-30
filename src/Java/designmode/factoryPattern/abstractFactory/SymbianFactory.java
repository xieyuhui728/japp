package Java.designmode.factoryPattern.abstractFactory;

/**
 * Created by xieyuhui on 2018/3/30.
 * 塞班产品族的工厂类，用于生产属于塞班产品族的具体产品
 */
public class SymbianFactory implements SystemPlatform {

    @Override
    public InterfaceController getInterfaceController() {
        return new SymbianInterfaceController();
    }

    @Override
    public OperationController getOperationController() {
        return new SymbianOperationController();
    }
}
