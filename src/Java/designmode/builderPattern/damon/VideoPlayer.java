package Java.designmode.builderPattern.damon;

/**
 * Created by xieyuhui on 2018/4/13.
 * 复杂的产品类：
 */
public class VideoPlayer {

    private String menu;
    private String playList;
    private String mainWindow;
    private String controlStrip;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlStrip() {
        return controlStrip;
    }

    public void setControlStrip(String controlStrip) {
        this.controlStrip = controlStrip;
    }
}
