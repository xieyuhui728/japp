package Java.designmode.factoryPattern.methodFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 * 工厂方法模式
 * 每个具体工厂类对应一个具体产品类。
 * 解决了简单工厂模式的缺点，但是工厂类会成倍的增加。
 *
 */
public class Test {

    public static void main(String[] args) {
        GifPictureFactory gifPictureFactory = new GifPictureFactory();
        Picture picture = gifPictureFactory.getPicture();
        picture.show();
    }
}
