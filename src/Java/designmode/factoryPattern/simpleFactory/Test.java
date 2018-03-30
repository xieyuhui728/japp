package Java.designmode.factoryPattern.simpleFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 * 简单工厂模式
 * 所有的产品类都在一个工厂类中生产。
 * 虽然实现了构建职责和使用职责分离的目的，
 * 但工厂类会成为一个上帝类，责任过重，难以维护
 *
 */
public class Test {

    public static void main(String[] args) {
        try {
            Shape shape = ShapeFactory.getShape("triangle");
            shape.draw();
            shape.erase();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
