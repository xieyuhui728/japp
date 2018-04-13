package Java.designmode.builderPattern.damon;

/**
 * Created by xieyuhui on 2018/4/13.
 */
public class Client {
    public static void main(String[] args) {
        VideoBuilder builder  = new MemoryModeBuilder();
        VideoDirector director = new VideoDirector(builder);
        director.construct();
    }
}
