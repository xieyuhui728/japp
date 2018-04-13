package Java.designmode.builderPattern.damon;

/**
 * Created by xieyuhui on 2018/4/13.
 * 抽象构建者
 */
public abstract class VideoBuilder {
    private VideoPlayer player = new VideoPlayer();

    abstract void buildMenu();

    abstract void buildPlayList();

    abstract void buildMainWindow();

    abstract void buildControlStrip();

    abstract void buildCollectList();

    VideoPlayer getResult() {
        return player;
    }

}
