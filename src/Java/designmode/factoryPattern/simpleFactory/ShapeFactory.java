package Java.designmode.factoryPattern.simpleFactory;


/**
 * Created by xieyuhui on 2018/3/29.
 * 简单工厂模式
 */
public class ShapeFactory {

    public static Shape getShape(String shapeName) throws Exception {
        if (shapeName.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else {
            throw new Exception("UnSupportedShapeException");
        }

    }
}
