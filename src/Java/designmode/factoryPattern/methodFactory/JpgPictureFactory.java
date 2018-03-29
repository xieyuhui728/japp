package Java.designmode.factoryPattern.methodFactory;

/**
 * Created by xieyuhui on 2018/3/29.
 */
public class JpgPictureFactory implements PictureFactory {
    @Override
    public Picture getPicture() {
        return new JPG();
    }
}
