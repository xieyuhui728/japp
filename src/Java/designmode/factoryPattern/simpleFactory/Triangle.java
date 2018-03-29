package Java.designmode.factoryPattern.simpleFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase()");
    }
}
