package Java.designmode.factoryPattern.simpleFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square erase()");
    }
}
