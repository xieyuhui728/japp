package Java.designmode.factoryPattern.methodFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 * 具体的产品类
 */
public class JPG implements Picture {
    @Override
    public void show() {
        System.out.println("jpg picture show");
    }
}
