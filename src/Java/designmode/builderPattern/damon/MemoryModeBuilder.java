package Java.designmode.builderPattern.damon;

/**
 * Created by xieyuhui on 2018/4/13.
 */
public class MemoryModeBuilder extends VideoBuilder{
    @Override
    void buildMenu() {

    }

    @Override
    void buildPlayList() {

    }

    @Override
    void buildMainWindow() {
        System.out.println("MemoryModeBuilder : MainWindow");
    }

    @Override
    void buildControlStrip() {
        System.out.println("MemoryModeBuilder : ControlStrip");
    }

    @Override
    void buildCollectList() {
        System.out.println("MemoryModeBuilder : CollectList");
    }
}
