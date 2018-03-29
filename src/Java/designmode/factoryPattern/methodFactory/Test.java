package Java.designmode.factoryPattern.methodFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 * 工厂方法模式
 * 每个产品类都有一个对应的能够生产自己的工厂类。
 * 解决了简单工厂模式的确定，但是类会成倍的增加。
 *
 */
public class Test {

    public static void main(String[] args) {
        GifPictureFactory gifPictureFactory = new GifPictureFactory();
        Picture picture = gifPictureFactory.getPicture();
        picture.show();
    }
}
