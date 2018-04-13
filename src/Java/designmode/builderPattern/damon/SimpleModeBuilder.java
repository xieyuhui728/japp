package Java.designmode.builderPattern.damon;

/**
 * Created by xieyuhui on 2018/4/13.
 */
public class SimpleModeBuilder extends VideoBuilder {

    @Override
    void buildMenu() {

    }

    @Override
    void buildPlayList() {

    }

    @Override
    void buildMainWindow() {
        System.out.println("SimpleModeBuilder : MainWindow");
    }

    @Override
    void buildControlStrip() {
        System.out.println("SimpleModeBuilder : ControlStrip");
    }

    @Override
    void buildCollectList() {

    }
}
