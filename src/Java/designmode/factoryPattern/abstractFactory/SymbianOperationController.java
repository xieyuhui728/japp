package Java.designmode.factoryPattern.abstractFactory;

/**
 * Created by xieyuhui on 2018/3/30.
 * 具体的产品类，该类属于抽象工厂模式中的产品等级结构
 */
public class SymbianOperationController implements OperationController {

    @Override
    public void operation() {
        System.out.println("SymbianOperationController operation");
    }
}
