package Java.designmode.factoryPattern.methodFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 * 具体的
 */
public class GifPictureFactory implements PictureFactory {

    @Override
    public Picture getPicture() {
        return new GIF();
    }
}
