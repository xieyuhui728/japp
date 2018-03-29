package Java.designmode.templatePattern;

/**
 * Created by xieyuhui on 2018/3/22.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
