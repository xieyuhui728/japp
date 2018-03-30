package Java.designmode.factoryPattern.abstractFactory;

/**
 * Created by xieyuhui on 2018/3/30.
 */
public class AndroidOperationController implements OperationController{
    @Override
    public void operation() {
        System.out.println("AndroidOperationController operation");
    }
}
