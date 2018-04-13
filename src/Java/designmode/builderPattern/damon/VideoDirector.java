package Java.designmode.builderPattern.damon;

/**
 * Created by xieyuhui on 2018/4/13.
 * 指挥者类
 */
public class VideoDirector {
    private VideoBuilder builder;

    public VideoDirector(VideoBuilder builder) {
        this.builder = builder;
    }

    public VideoPlayer construct() {
        builder.buildControlStrip();
        builder.buildMainWindow();
        builder.buildMenu();
        builder.buildPlayList();
        builder.buildCollectList();
        return builder.getResult();
    }
}
