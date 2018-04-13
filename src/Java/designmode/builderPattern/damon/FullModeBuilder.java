package Java.designmode.builderPattern.damon;

/**
 * Created by xieyuhui on 2018/4/13.
 */
public class FullModeBuilder extends VideoBuilder{
    @Override
    void buildMenu() {
        System.out.println("FullModeBuilder：Menu");
    }

    @Override
    void buildPlayList() {
        System.out.println("FullModeBuilder：PlayList");
    }

    @Override
    void buildMainWindow() {
        System.out.println("FullModeBuilder：MainWindow");
    }

    @Override
    void buildControlStrip() {
        System.out.println("FullModeBuilder：ControlStrip");
    }

    @Override
    void buildCollectList() {
        System.out.println("FullModeBuilder：CollectList");
    }
}
